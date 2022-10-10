package com.said.processcompose;

import com.said.processcompose.util.ArithmeticUtil;

public class Test {

    public static void main(String[] args) {

        // (((x*5)+13)/2)-41
        Integer result = ArithmeticUtil.instance()
                .setWorkOnObject(25)
                .multiple(5)
                .add(13)
                .divide(2)
                .subtract(41)
                .result();

        System.out.println("Hadi lan olabilir mi boyle? Lutfen olsun : " + result);
    }
}
