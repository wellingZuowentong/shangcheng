package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.Details;
import com.shangcheng.shangcheng.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者：王怀朋
 * 日期：2019/7/16
 */
@Controller
public class DetailsController {
    @Autowired
    private DetailsService detailsService;
    /*
     * 添加商品详情
     * */
    @RequestMapping("saveDetails")
    @ResponseBody
    public int saveDetails(Details details){
        return detailsService.saveDetails(details);
    }

    /*
     * 根据商品id查询商品详情
     * */
    @RequestMapping("getDetailsByIid")
    @ResponseBody
    public Details getDetailsByIid(Integer iid){
        return detailsService.getDetailsByIid(iid);
    }
    /*
     * 根据id查询商品详情
     * */
    @RequestMapping("getDetailsById")
    @ResponseBody
    public Details getDetailsById(Integer id){
        return detailsService.getDetailsById(id);
    }
    /*
     * 修改商品详情
     * */
    @RequestMapping("updateDetails")
    @ResponseBody
    public int updateDetails(Details details){
        return detailsService.updateDetails(details);
    }

    /*
     * 删除商品详情
     * */
    @RequestMapping("delDetails")
    @ResponseBody
    public int delDetails(Integer iid){
        return detailsService.delDetails(iid);
    }
}
