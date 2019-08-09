package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/28
 */
@Mapper
public interface CategoryMapper {
    public List<Category> getAllCategory();
    public int saveCategory(Category category);
}
