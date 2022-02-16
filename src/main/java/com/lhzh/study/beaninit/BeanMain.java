package com.lhzh.study.beaninit;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 卢宏政
 * @date 2021/10/30 12:05
 */
public class BeanMain {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "src/main/resources/spring.xml");
        A a = (A) context.getBean("a");
        System.out.println(a);
    }

}
