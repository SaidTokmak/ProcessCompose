package com.said.processcompose.service.impl;

import com.said.processcompose.dto.ProcessDto;
import com.said.processcompose.entity.Note;
import com.said.processcompose.repository.ProcessRepository;
import com.said.processcompose.service.IProcessService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProcessService implements IProcessService {

    private final ProcessRepository processRepository;

    @Override
    public List<ProcessDto> getProcesses() {
        List<Note> processes = processRepository.findAll();
        return processes.stream().map(Note::toDto).toList();
    }

    @Override
    public Note getProcessByID(Long id) {
        return processRepository.findById(id);
    }

    @Override
    public Note insertProcess(Note note) {
        return processRepository.save(note);
    }

    @Override
    public List<Note> getProcessesByPriority(String priority) {
        return processRepository.findNotesByPriority(priority);
    }

}
