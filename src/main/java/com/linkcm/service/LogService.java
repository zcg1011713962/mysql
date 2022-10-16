package com.linkcm.service;

import com.linkcm.entity.PlayLog;

import java.util.List;

public interface LogService {

    List<PlayLog> getLogById(String id);

}
