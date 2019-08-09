package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.Details;
import com.shangcheng.shangcheng.bean.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/16
 */
@Mapper
public interface DetailsMapper {
    public int saveDetails(Details details);
    public Details getDetailsByIid(Integer iid);
    public Details getDetailsById(Integer id);
    public int updateDetails(Details details);
    public int delDetails(Integer iid);
}
