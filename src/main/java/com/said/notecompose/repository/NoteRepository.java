package com.said.notecompose.repository;

import com.said.notecompose.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

    Note findById(Long id);

    List<Note> findAll();

    List<Note> findNotesByPriority(String priority);

}