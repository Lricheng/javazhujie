package com.lrc.web.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//运行的策略是在运行的时候
public @interface MyTest {
    String name() default "lrc";
}
