package com.shangcheng.shangcheng.controller;

import com.alibaba.fastjson.JSONObject;
import com.shangcheng.shangcheng.bean.User;
import com.shangcheng.shangcheng.service.UserService;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.codehaus.xfire.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

   /* @RequestMapping("/init")
    @ResponseBody
    public void init(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String echostr = this.initWechat(request);
        PrintWriter out = response.getWriter();
        out.print(echostr);
        out.close();
        out = null;
    }*/

    @RequestMapping(value = "userinfo", method = RequestMethod.POST)
    @ResponseBody
    public Integer userinfo(String code,String encryptedData,String iv,HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String sessionkey = getSessionKey(code);
        System.out.println("sessionkey=======>"+sessionkey+"encryptedData========>"+encryptedData+"iv=======>"+iv);
       JSONObject userInfo = this.getUserInfo(encryptedData, sessionkey, iv);
       System.out.println("userInfo:========>"+userInfo);
        String openid = userInfo.get("openId")+"";
        String username = userInfo.get("nickName")+"";
        String touxiang = userInfo.get("avatarUrl")+"";
        String weizhi = userInfo.get("city")+"";
        User user = userService.getUserByOpenId(openid);
        if(user==null){
            User u = new User();
            u.setOpenid(openid);
            u.setTouxiang(touxiang);
            u.setUsername(username);
            u.setWeizhi(weizhi);
            userService.saveUser(u);
            return user.getId();
        }

return user.getId();


    }

    @RequestMapping(value = "getAllUser", method = RequestMethod.POST)
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping(value = "getUserById", method = RequestMethod.POST)
    @ResponseBody
    public User getUserById(Integer id){
        return userService.getUserById(id);
    }





    public String getSessionKey(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx08269207b6d2fd7d&secret=94eb89ac50202f68cbca57594e03c3a5&js_code=" + code + "&grant_type=authorization_code";
        System.out.println(url);
        String reusult = sendGetReq(url);
        JSONObject oppidObj = JSONObject.parseObject(reusult);

        String openid = (String) oppidObj.get("openid");
        String session_key = (String) oppidObj.get("session_key");
        return session_key;
    }

   /* public String initWechat(HttpServletRequest request) {
        String signature = request.getParameter("signature"); // 加密需要验证的签名
        String timestamp = request.getParameter("timestamp");// 时间戳
        String nonce = request.getParameter("nonce");// 随机数
        String echostr = request.getParameter("echostr");
        WeixinMessageDigest wxDigest = WeixinMessageDigest.getInstance();
        boolean bValid = wxDigest.validate(WeChatConfig.TOKEN, signature, timestamp, nonce);
        if (bValid) {
            return echostr;
        }
        return "";
    }*/

    /**
     * 获取信息
     */
    public JSONObject getUserInfo(String encryptedData,String sessionkey,String iv){
        // 被加密的数据
        byte[] dataByte = Base64.decode(encryptedData);
        // 加密秘钥
        byte[] keyByte = Base64.decode(sessionkey);
        // 偏移量
        byte[] ivByte = Base64.decode(iv);
        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, "UTF-8");
                return JSONObject.parseObject(result);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String sendGetReq(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            java.util.Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        } // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }


}