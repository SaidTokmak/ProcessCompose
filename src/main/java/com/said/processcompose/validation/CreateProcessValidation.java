package com.said.processcompose.validation;

import com.said.processcompose.entity.Note;
import com.said.processcompose.util.ValidationUtil;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public class CreateProcessValidation {

    private static CreateProcessValidation instance;

    public static CreateProcessValidation getInstance() {
        if (Objects.isNull(instance)) {
            instance = new CreateProcessValidation();
        }
        return instance;
    }

    public void validate(Note note) {
        ValidationUtil.stringMaxSizeValidation(note.getContent(), 25);
    }

}
