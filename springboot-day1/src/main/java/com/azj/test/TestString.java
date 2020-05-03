package com.azj.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TestString {
    @Test
    public void testString(){
        String s = "shanghai";
        String b = "Shanghai";

        System.out.println(s.equals(b));
    }

    @Test
    public void test11() {
        //System.out.println(3*0.1==0.3);
        //List<Integer> list = new ArrayList<>();
       /* String s = "abcd";
        System.out.println(s.substring(1,3));
        String b = String.format("我是%s,今年%d岁，喜欢%s","张三",20,"读书");
        System.out.println(b);*/
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
