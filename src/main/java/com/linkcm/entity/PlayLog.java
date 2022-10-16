package com.linkcm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("play_log")
public class PlayLog {
    private Long id;
    private String traceId;
    private String url;
    private int success;
}
