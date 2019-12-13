package calculator;

/***
 * 
 * 문자열 계산기 구현을 통한 테스트와 리팩토링
 *
 */
public class StringCaculator {

	public int add(String text) {
		/*
		 * 요구사항1 빈 문자열 또는 null값을 입력할 경우 0을 반환
		 * 
		 */
		if (text == null || text.isEmpty()) {
			return 0;
		}

		/*
		 * 요구사항3 숫자 두개를 쉼표(,)구분자로 입력할 경우 두 숫자의 합을 반환
		 * 
		 */
		String[] values = text.split(",");
		int sum = 0;
		for (String value : values) {
			sum += Integer.parseInt(value);
		}
		
		return sum;

	}
}
