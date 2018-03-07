package test;

import static org.junit.jupiter.api.Assertions.*;

import exercise.UniqueSum;

import org.junit.jupiter.api.Test;

class testUniqueNumber {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}

}*/
	@Test
	void testAreAllEqual() {
		assertTrue(UniqueSum.areAllEqual(1,1,1));
		assertTrue(UniqueSum.areAllEqual(5,5,5));
		assertFalse(UniqueSum.areAllEqual(1,2,3));
		assertFalse(UniqueSum.areAllEqual(1,1,3));
	}
	@Test
	void testUniqueSum() {
		assertEquals(UniqueSum.uniqueSum(1,2,3), 6);
		assertEquals(UniqueSum.uniqueSum(1,1,2), 2);
		assertEquals(UniqueSum.uniqueSum(1,1,1), 0);
		}
}
