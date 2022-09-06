package com.said.processcompose.controller;

import com.said.processcompose.dto.ProcessDto;
import com.said.processcompose.entity.Note;
import com.said.processcompose.service.IProcessService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProcessController {

    private final IProcessService processService;

    @GetMapping(value="/processes", produces = {"application/json"})
    public ResponseEntity<List<ProcessDto>> getProcesses() {
        return ResponseEntity.ok(processService.getProcesses());
    }

    @GetMapping(value="/process/{id}", produces = {"application/json"})
    public Note getProcessById(@PathVariable Long id) {
        return processService.getProcessByID(id);
    }

    @PostMapping(value = "/process", produces = {"application/json"}, consumes = {"application/json"})
    public Note insertProcess(@RequestBody Note body) {
        return processService.insertProcess(body);
    }

    @GetMapping(value = "/processesByPriority", produces = {"application/json"})
    public List<Note> getProcessesByPriority(@RequestParam @Param("priority") String priority) {
        return processService.getProcessesByPriority(priority);
    }

}
