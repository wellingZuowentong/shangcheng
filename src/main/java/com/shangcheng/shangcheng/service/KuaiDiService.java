package com.shangcheng.shangcheng.service;

import com.shangcheng.shangcheng.bean.KuaiDi;
import com.shangcheng.shangcheng.mapper.KuaiDiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/8/9
 */
@Service
public class KuaiDiService {
    @Autowired
    private KuaiDiMapper kuaiDiMapper;

    public List<KuaiDi> getAllKuaiDi(){
        return kuaiDiMapper.getAllKuaiDi();
    }
}
