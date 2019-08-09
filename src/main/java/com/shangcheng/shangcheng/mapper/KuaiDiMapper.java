package com.shangcheng.shangcheng.mapper;

import com.shangcheng.shangcheng.bean.KuaiDi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/9
 */
@Mapper
public interface KuaiDiMapper {
    public List<KuaiDi> getAllKuaiDi();
}
