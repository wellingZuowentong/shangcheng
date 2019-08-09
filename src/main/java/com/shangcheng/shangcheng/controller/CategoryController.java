package com.shangcheng.shangcheng.controller;

import com.shangcheng.shangcheng.bean.Category;
import com.shangcheng.shangcheng.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/28
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    /*
    * 查询所有类别
    * */
    @RequestMapping("getAllCategory")
    @ResponseBody
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    /*
     * 添加类别
     * */
    @RequestMapping("saveCategory")
    @ResponseBody
    public int saveCategory(Category category){
        category.setIshaveChild("true");
        return categoryService.saveCategory(category);
    }
}
