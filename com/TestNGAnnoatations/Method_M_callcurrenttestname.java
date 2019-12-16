package com.TestNGAnnoatations;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Method_M_callcurrenttestname {

	//how to call current test case name in testng? Method method....methodname.getName()
@Test
public void login(Method method) {

System.out.println("Currently run method was " + method.getName());

}

@Test
public void login1(Method m) {

System.out.println("Currently run method was " + m.getName());

}

}
