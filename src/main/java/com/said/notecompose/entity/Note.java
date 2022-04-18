package com.said.notecompose.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Table(name = "note")
@Entity
public class Note {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

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

}