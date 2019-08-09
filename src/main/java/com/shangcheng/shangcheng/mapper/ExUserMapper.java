package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.ExUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/1
 */
@Mapper
public interface ExUserMapper {
    public int saveExUser(ExUser exUser);
    public int deleteExUser(Integer id);
    public int updateExUser(ExUser exuser);
    public ExUser getExUserById(Integer id);
    public List<ExUser> getExUserByUid(Integer uid);
    public List<ExUser> getAllExUser();
}
