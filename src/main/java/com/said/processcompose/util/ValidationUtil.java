package com.said.processcompose.util;

import java.util.Objects;

public class ValidationUtil {

    private static ValidationUtil instance;

    public static ValidationUtil getInstance() {
        if (Objects.isNull(instance)) {
            instance = new ValidationUtil();
        }
        return instance;
    }

    public boolean isValid(Object value) {
        return false;
    }

    public static boolean stringMaxSizeValidation(String value, int size) {
        if (value.isBlank()) {
            return false;
        }
        return value.length() <= size;
    }

    public static boolean integerMaxValidation(int value, int maxValue) {
        return value <= maxValue;
    }
}
