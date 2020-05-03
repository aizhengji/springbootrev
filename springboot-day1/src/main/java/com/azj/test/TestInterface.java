package com.azj.test;

import com.azj.service.Sp;
import com.azj.service.SpImpl;
import org.junit.Test;

public class TestInterface {
    @Test
    public void test22(){
        Sp sp = new SpImpl();
        String cc = sp.cc();
        System.out.println(cc);
    }

}
