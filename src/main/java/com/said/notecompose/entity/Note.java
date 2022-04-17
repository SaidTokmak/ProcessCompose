package com.said.notecompose.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "note")
@Entity
public class Note {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

}