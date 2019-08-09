package com.shangcheng.shangcheng.mapper;
import com.shangcheng.shangcheng.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/31
 */
@Mapper
public interface UserMapper {
    public int saveUser(User user);
    public User getUserByOpenId(String openid);
    public User getUserById(Integer id);
    public int updateUser(User user);
    public List<User> getAllUser();
    public int delUser(Integer id);
}
