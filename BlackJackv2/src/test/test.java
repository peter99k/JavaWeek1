package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import exercise.BlackJackv2;

class test {

//	@Test
//	@Ignore
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testBlackJack() {
		assertEquals(BlackJackv2.blackJack(18,19), 2);
		assertEquals(BlackJackv2.blackJack(20,5), 1);
		assertEquals(BlackJackv2.blackJack(21,21), 3);
		assertEquals(BlackJackv2.blackJack(23,23), 4);
		assertEquals(BlackJackv2.blackJack(3,3), 3);
		assertEquals(BlackJackv2.blackJack(21,1), 1);
		
		
//		fail("Not yet implemented");
	}

}
