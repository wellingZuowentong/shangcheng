package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.Details;
import com.shangcheng.shangcheng.bean.ExCategory;
import com.shangcheng.shangcheng.bean.ExItem;
import com.shangcheng.shangcheng.bean.Item;
import com.shangcheng.shangcheng.service.DetailsService;
import com.shangcheng.shangcheng.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 作者：王怀朋
 * 日期：2019/7/11
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private DetailsService detailsService;
    @RequestMapping("getAllItems")
    @ResponseBody
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @RequestMapping("getItem")
    @ResponseBody
    public Item getItem(Integer id){
        return itemService.getItem(id);
    }

    @RequestMapping("getAllItemsByName")
    @ResponseBody
    public List<Item> getAllItemsByName(String name){
        return itemService.getAllItemsByName(name);
    }

    @RequestMapping("getAllExCategory")
    @ResponseBody
    public List<ExCategory> getAllExCategory(){
        return itemService.getAllExCategory();
    }

    @RequestMapping("getExItem")
    @ResponseBody
    public ExItem getExItem(Integer id){
        return itemService.getExItem(id);
    }

    @RequestMapping("updateItem")
    @ResponseBody
    public int updateItem(Item item){
        return itemService.updateItem(item);
    }

    @RequestMapping("saveItem" )
    @ResponseBody
    public int saveItem(@RequestParam(value="file",required=false)MultipartFile file,HttpServletRequest request)throws UnsupportedEncodingException {
        String paddress="";
        if(file.getOriginalFilename()!="") {

            File targetFile = null;
            String url = "";//返回存储路径

            String fileName = file.getOriginalFilename();//获取文件名加后缀
            if (fileName != null && fileName != "") {
                String path = "C:/inetpub/wwwroot"; //文件存储位置
                File filew = new File(path);
                //如果文件夹不存在则创建
                if (!filew.exists() && !filew.isDirectory()) {
                    filew.mkdir();
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                String fileAdd = sdf.format(new Date());
                String fileF = fileName.substring(fileName.lastIndexOf("."), fileName.length());//文件后缀
                fileName = fileAdd+new Date().getTime() + "_" + new Random().nextInt(1000) + fileF;//新的文件名

                //先判断文件是否存在

                //获取文件夹路径
                File file1 = new File(path);
                paddress="182.254.172.18/img/"+fileName;
                if (!file1.exists() && !file1.isDirectory()) {
                    file1.mkdir();
                }
                //将图片存入文件夹
                targetFile = new File(file1, fileName);
                try {
                    //将上传的文件写到服务器上指定的文件。
                    file.transferTo(targetFile);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

            String iname = request.getParameter("iname");
            BigDecimal inprice = new BigDecimal(request.getParameter("inprice"));
            BigDecimal outprice = new BigDecimal(request.getParameter("outprice"));
            System.out.println(outprice + "!!!!!!!!!!!!!!");
            String beiyonga = request.getParameter("beiyonga");
            String canshu = request.getParameter("canshu");
            String guige = request.getParameter("guige");
            BigDecimal kuaidi = new BigDecimal(request.getParameter("kuaidi"));
            String huodong = request.getParameter("huodong");
            Integer kucun = request.getParameter("kucun") == null ? 0 : Integer.parseInt(request.getParameter("kucun"));
            String daddress = request.getParameter("daddress");
            System.out.println(request.getParameter("cid") + "#################");
            Integer cid = Integer.parseInt(request.getParameter("cid"));
            Item item = new Item();
            item.setIname(iname);
            item.setInprice(inprice);
            item.setOutprice(outprice);
            item.setBeiyonga(beiyonga);
            item.setPaddress(paddress);
            item.setCid(cid);
            System.out.println(item);
            itemService.saveItem(item);
            Integer iid = item.getId();
            Details details = new Details();
            details.setCanshu(canshu);
            details.setDaddress(daddress);
            details.setGuige(guige);
            details.setHuodong(huodong);
            details.setKuaidi(kuaidi);
            details.setKucun(kucun);
            details.setDaddress(daddress);
            details.setXiaoliang(0);
            details.setIid(iid);
            detailsService.saveDetails(details);
            return 0;
        }
}
