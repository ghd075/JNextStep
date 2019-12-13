package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		if (isBlank(text)) {
			return 0;
		}
		
		return sum(toInts(split(text)));
	}
	
	//요구사항1 리팩토링로 분리
	private boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}
	
	/*
	 * 요구사항2 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환
	 * 요구사항3 숫자 두개를 쉼표(,)구분자로 입력할 경우 두 숫자의 합을 반환
	 * 요구사항4 구분자를 쉼표(,)이외에 콜론(:)을 사용할 수 있다.
	 * 요구사항5 "//"와 "\n" 문자 사이에 커스텀 구분자를 지정할 수 있다.
	 * 
	 */
	
	//리팩토링로 split기능 분리
	private String[] split(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if(m.find()) {
			String customDelimetor = m.group(1);
			return m.group(2).split(customDelimetor);
		}			
		
		return text.split(",|:");			
	}
	
	//문자열 -> 숫자로 변환하는 기능 분리
	private int[] toInts(String[] values) {
		int[] numbers = new int[values.length];
		for(int i = 0; i < values.length; i++) {
			int number = Integer.parseInt(values[i]);
			if(number < 0) {
				throw new RuntimeException();
			}
			numbers[i] = number;
		}
		return numbers;
	}
	
	//리팩토링로 sum기능 분리
	private int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
}
