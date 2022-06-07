package com.said.notecompose.controller;

import com.said.notecompose.entity.Note;
import com.said.notecompose.service.INoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteController {

    private final INoteService noteService;

    @RequestMapping(value="/notes", produces = {"application/json"}, method = RequestMethod.GET)
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

    @RequestMapping(value="/note/{id}", produces = {"application/json"}, method = RequestMethod.GET)
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getNoteByID(id);
    }

    @RequestMapping(value = "/note", produces = {"application/json"}, method = RequestMethod.POST)
    public Note insertNote(@RequestBody Note body) {
        return noteService.insertNote(body);
    }

    @RequestMapping(value = "/notesByPriority", produces = {"application/json"}, method = RequestMethod.GET)
    public List<Note> getNotesByPriority(@RequestParam @Param("priority") String priority) {
        return noteService.getNotesByPriority(priority);
    }

}
