package com.hookTest;

import org.junit.Test;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HookTest2 {

	@BeforeStep
	public void beforeScenario() {
		System.out.println("This method is for before Scenario");
	}

	@Test
	public void test1() {

		System.out.println("I am in Test1");
	}

	@Test
	public void test2() {

		System.out.println("I am in Test2");
	}

	@Test
	public void test3() {
		System.out.println("I am in Test3");

	}

	@After
	public void initialisation() {

	}
}
