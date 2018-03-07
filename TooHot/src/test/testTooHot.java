package test;

import static org.junit.jupiter.api.Assertions.*;

import exercise.TooHot;

import org.junit.jupiter.api.Test;

class testTooHot {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	void testTooHot() {
		assertEquals(TooHot.tooHot(60, true), true);
		assertEquals(TooHot.tooHot(90, true), true);
		assertEquals(TooHot.tooHot(99, true), true);
		assertEquals(TooHot.tooHot(30, false), false);
		assertEquals(TooHot.tooHot(75, false), true);
		assertEquals(TooHot.tooHot(91, false), true);
		assertEquals(TooHot.tooHot(30, true), false);
	}

}
