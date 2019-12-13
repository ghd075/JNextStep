package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

/***
 * 
 * split로 구분자가 없을 때 반환되는지 테스트
 *
 */
public class SplitTest {

	@Test
	public void split() {
		String[] values = "1".split(",");
		assertArrayEquals(new String[] {"1"}, values);
		
		values = "1,2".split(",");
		assertArrayEquals(new String[] {"1","2"}, values);
	}
}
