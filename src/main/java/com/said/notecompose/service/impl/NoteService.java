package com.said.notecompose.service.impl;

import com.said.notecompose.entity.Note;
import com.said.notecompose.repository.NoteRepository;
import com.said.notecompose.service.INoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService implements INoteService {

    private final NoteRepository noteRepository;

    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteByID(Long id) {
        return noteRepository.findById(id);
    }

    @Override
    public Note insertNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getNotesByPriority(String priority) {
        return noteRepository.findNotesByPriority(priority);
    }

}
