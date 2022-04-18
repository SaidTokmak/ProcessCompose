package com.said.notecompose.reporistory;

import com.said.notecompose.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    Optional<Note> findById(Integer id);

    List<Note> findAll();

}