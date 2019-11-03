package com.lrc.web.annotation;

public class Demo1 {
    @MyTest(name="lrc")
    public  void test1(){
        System.out.println("test1方法执行");
    }
    @MyTest
    public  void test2(){
        System.out.println("test2方法执行");
    }
}
