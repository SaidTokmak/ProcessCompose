package com.said.processcompose.entity;

import com.said.processcompose.dto.ProcessDto;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Table(name = "Note")
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "priority")
    private String priority;

    @Column(name = "is_root")
    private Boolean is_root;

    @Column(name = "parent_id")
    private Integer parent_id;

    @Column(name = "date")
    private Date date;

    public ProcessDto toDto() {
        return ProcessDto.builder()
                    .id(id)
                    .content(content)
                    .isRoot(is_root)
                    .parentId(parent_id)
                    .priority(priority)
                    .date(date)
                    .build();
    }
}