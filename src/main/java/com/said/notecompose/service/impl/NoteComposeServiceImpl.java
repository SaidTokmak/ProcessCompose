package com.said.notecompose.service.impl;

import com.said.notecompose.entity.Note;
import com.said.notecompose.reporistory.INoteComposeReporistory;
import com.said.notecompose.service.INoteComposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteComposeServiceImpl implements INoteComposeService {

    @Autowired
    INoteComposeReporistory noteReporistory;

    @Override
    public Note getNoteById(Integer id) {
        return noteReporistory.getNotesById(id);
    }
}
