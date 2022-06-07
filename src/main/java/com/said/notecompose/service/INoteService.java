package com.said.notecompose.service;

import com.said.notecompose.entity.Note;

import java.util.List;

public interface INoteService {

    List<Note> getNotes();

    Note getNoteByID(Long id);

    Note insertNote(Note note);

    List<Note> getNotesByPriority(String priority);
}
