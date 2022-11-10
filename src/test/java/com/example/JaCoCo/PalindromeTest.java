package com.example.JaCoCo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class PalindromeTest {

	@Test
	public void whenEmptyString_thenAccept() {
		System.out.println("this is a test");
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	    assertTrue(palindromeTester.isPalindrome("qazaq"));
	    assertFalse(palindromeTester.isPalindrome("qqqaaa"));
	}
}
