package com.subhu.movieBookingSystem;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTestDemo {
	@Test
	public void testMethod1() {
		System.out.println("Testing method1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Testing method2");
	}

	@BeforeEach
	public void beforeEachTestMethod() {
		System.out.println("pre test");
	}

	@AfterEach
	public void afterEachTestMethod() {
		System.out.println("post test");
	}

	@BeforeAll
	public static void beforeAllTestMethods() {
		System.out.println("begining");
	}

	@AfterAll
	public static void afterAllTestMethods() {
		System.out.println("end");
	}
}
