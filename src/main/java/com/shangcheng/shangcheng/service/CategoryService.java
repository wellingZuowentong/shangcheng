package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.Category;
import com.shangcheng.shangcheng.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/28
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    public List<Category> getAllCategory(){
        return categoryMapper.getAllCategory();
    }
    public int saveCategory(Category category){
        return categoryMapper.saveCategory(category);
    }
}
