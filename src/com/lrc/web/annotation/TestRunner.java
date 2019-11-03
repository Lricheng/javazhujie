package com.lrc.web.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        //执行Demo里单元测试的方法

        //1 通过反射来获取方法
        //1.1 获取字节码
        Method[] methods = Demo1.class.getMethods();
        for (Method m : methods) {
            //2 通过反射来获取方法上面的注解
            MyTest myTest = m.getAnnotation(MyTest.class);
            if (m.getName().startsWith("test") && myTest != null) {
                System.out.println("方法名" + m.getName());
                System.out.println("注解name的属性" + myTest.name());
                //4 调用方法
                m.invoke(Demo1.class.newInstance());
            }
        }

    }
}
