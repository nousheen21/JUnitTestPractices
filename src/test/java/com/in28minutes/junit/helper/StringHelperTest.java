package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Position() {
	assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	
	}
	@Test
	public void testTruncateFirst2Positions_AinFirstPosition(){
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	//ABCD => False
	@Test 
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeResult(){
		boolean actual= helper.areFirstAndLastTwoCharactersTheSame("ABCD");
		boolean expected = false;
		assertEquals(expected,actual);
	}
	//AB => True;
	@Test 
	public void testAreFirstAndLastTwoCharactersTheSame_IfOnlyTwoChars(){
		boolean actual = helper.areFirstAndLastTwoCharactersTheSame("AB");
		boolean expected = true;
		assertEquals(expected,actual);
	}
	//A => false;
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_OnlyOneChar(){
		boolean actual = helper.areFirstAndLastTwoCharactersTheSame("A");
		boolean expected = false;
		assertEquals(expected,actual);
	}

}
