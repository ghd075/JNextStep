package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCaculatorTest {

	private StringCaculator cal;
	
	@Before
	public void setup() {
		cal = new StringCaculator();
	}
	
	@Test
	public void add_null_empty() {
		assertEquals(0,cal.add(""));
		assertEquals(0,cal.add(null));
	}
	
	@Test
	public void add_number_check() {
		assertEquals(1,cal.add("1"));
	}

	@Test
	public void add_rest_separator_check() {
		assertEquals(3,cal.add("1,2"));
	}

	@Test
	public void add_rest_colon_separator_check() {
		assertEquals(6,cal.add("1,2:3"));
	}
	
	@Test
	public void add_custom_separator() {
		assertEquals(1,cal.add("1"));
	}
	
	@Test
	public void add_negative() {
		assertEquals(1,cal.add("1"));
	}
}
