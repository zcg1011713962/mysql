package com.linkcm;

import com.linkcm.entity.PlayLog;
import com.linkcm.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@Slf4j
@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private LogService logService;

    @Test
    public void test(){
        String id = "1";
        List<PlayLog> logs = logService.getLogById(id);
        log.info("{}", logs);
    }

}
