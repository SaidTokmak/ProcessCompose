package com.said.processcompose.repository;

import com.said.processcompose.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessRepository extends JpaRepository<Note, Integer> {

    Note findById(Long id);

    List<Note> findAll();

    List<Note> findNotesByPriority(String priority);

    int deleteById(Long id);

}