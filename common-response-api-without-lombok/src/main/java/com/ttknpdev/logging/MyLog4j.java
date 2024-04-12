package com.ttknpdev.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLog4j {
    public Logger log;
    public MyLog4j(Class c) {
        this.log = LoggerFactory.getLogger(c);
    }
}
