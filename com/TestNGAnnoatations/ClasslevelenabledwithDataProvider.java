package com.TestNGAnnoatations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClasslevelenabledwithDataProvider {
	@Test(enabled = true)
	public class MyTest {
	@DataProvider(name = "bla")
	private Object[][] bla() {
	return new Object[][] {
	new Object[] { "bla"}
	};
	}

	@Test(dataProvider = "bla")
	public void blatest(String bla) {
	System.out.println(bla);
	}
	}

}
