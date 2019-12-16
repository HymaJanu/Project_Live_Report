package com.TestNGAnnoatations;

import org.testng.annotations.Test;

public class EnabledEqualsToTrueORFalse {
	@Test(enabled = true) //it will consider and execute the current test case
	public void enabledTrue() {
		System.out.println("print");
	}

	@Test(enabled = false)//it will ignore or not consider and not execute the current test case
	public void enabledFalse() {
		System.out.println("Not print");
	}

}