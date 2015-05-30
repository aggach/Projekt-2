
import org.junit.Test;

import junit.framework.TestCase;

public class Problem4Test extends TestCase {

	@Test
	public void testIsPalindrome() {
		assertTrue(Problem4.isPal(9009));
		assertFalse(Problem4.isPal(9010));
	}
	

	@Test
	public void testgreatestPalindrom() {
		assertEquals(9009, Problem4.greatestPalindrom(99));
	}

}
