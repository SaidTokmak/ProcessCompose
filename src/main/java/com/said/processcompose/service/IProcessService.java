package com.said.processcompose.service;

import com.said.processcompose.dto.ProcessDto;
import com.said.processcompose.entity.Note;

import java.util.List;

public interface IProcessService {

    List<ProcessDto> getProcesses();

    Note getProcessByID(Long id);

    Note insertProcess(Note note);

    List<Note> getProcessesByPriority(String priority);
}
