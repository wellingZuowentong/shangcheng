package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.Details;
import com.shangcheng.shangcheng.mapper.DetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：王怀朋
 * 日期：2019/7/16
 */
@Service
public class DetailsService {
    @Autowired
    private DetailsMapper detailsMapper;
    public int saveDetails(Details details){
        return detailsMapper.saveDetails(details);
    }
    public Details getDetailsByIid(Integer iid){
        return detailsMapper.getDetailsByIid(iid);
    }
    public Details getDetailsById(Integer id){
        return detailsMapper.getDetailsById(id);
    }
    public int updateDetails(Details details){
        return detailsMapper.updateDetails(details);
    }
    public int delDetails(Integer iid){
        return detailsMapper.delDetails(iid);
    }
}
