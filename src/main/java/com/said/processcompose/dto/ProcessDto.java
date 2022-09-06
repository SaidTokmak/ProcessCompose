package com.said.processcompose.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
public class ProcessDto {
    private Long id;

    private String content;

    private String priority;

    private Boolean isRoot;

    private Integer parentId;

    private Date date;

}
