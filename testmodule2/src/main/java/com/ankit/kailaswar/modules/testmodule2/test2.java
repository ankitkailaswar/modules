package com.ankit.kailaswar.modules.testmodule2;

import com.ankit.kailaswar.modules.testmodule.test;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class test2 {

    public static void main(String[] args) {
        testResult2();
    }

    public static void testResult2() {
        log.info("hello2");
        test.testResult();
    }
}
