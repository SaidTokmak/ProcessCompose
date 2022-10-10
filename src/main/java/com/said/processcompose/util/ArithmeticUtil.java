package com.said.processcompose.util;

import java.util.Objects;

public class ArithmeticUtil {

    private static ArithmeticUtil instance;

    private static Integer workOnObject;

    public static ArithmeticUtil instance() {
        if (Objects.isNull(instance)) {
            instance = new ArithmeticUtil();
        }
        return instance;
    }

    public ArithmeticUtil setWorkOnObject(int value) {
        workOnObject = value;
        return instance;
    }

    public ArithmeticUtil add(int value) {
        workOnObject += value;
        return instance;
    }

    public ArithmeticUtil multiple(int value) {
        workOnObject *= value;
        return instance;
    }

    public ArithmeticUtil subtract(int value) {
        workOnObject -= value;
        return instance;
    }

    public ArithmeticUtil divide(int value) {
        workOnObject /= value;
        return instance;
    }

    public Integer result() {
        return workOnObject;
    }

}
