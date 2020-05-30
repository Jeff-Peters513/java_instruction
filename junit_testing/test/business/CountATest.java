package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void countATest() {
		assertEquals(2, BasicCalculations.countA("I love ice cream with lot of whip cream"));
	}

}
