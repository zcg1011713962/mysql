package com.linkcm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linkcm.entity.PlayLog;
import com.linkcm.mapper.PlayLogMapper;
import com.linkcm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private PlayLogMapper playLogMapper;

    @Override
    public List<PlayLog> getLogById(String id) {
        QueryWrapper<PlayLog> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return playLogMapper.selectList(queryWrapper);
    }
}
