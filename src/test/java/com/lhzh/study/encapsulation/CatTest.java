package com.lhzh.study.encapsulation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    private Cat cat =new Cat("red","catName");

    @Test
    public void getColor() {
        System.out.println(cat.getColor());
//        System.out.println(cat.color);
    }

    @Test
    public void setColor() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getColor1() {
    }

    @Test
    public void setColor1() {
    }

    @Test
    public void getName1() {
    }

    @Test
    public void setName1() {
    }
}