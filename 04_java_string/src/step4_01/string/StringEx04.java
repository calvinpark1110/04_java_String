package step4_01.string;

// 문자열 관련 형변환

public class StringEx04 {

	public static void main(String[] args) {

		// (구글에서 아스키 코드 표를 검색 후 확인)
		
		// 문자 -> 숫자  
		char ch = 'a';
		System.out.println((int)ch);	// 97
		ch = 'A';
		System.out.println((int)ch);	//	b
		System.out.println();
		
		// 숫자 -> 문자
		int n = 100;
		System.out.println((char)n);	// d
		n = 77;
		System.out.println((char)n);	// M
		System.out.println();
		
		
		
		// 1. 문자열 -> 숫자  Integer.parseInt("문자열") 사용
		int num = Integer.parseInt("10");
	
		
		
		// 2. 숫자 -> 문자열
		num = 777;
		
		// 방법 2-1) + "" 사용 
		String strNum = num + "";
		
		// 방법 2-2) Integer.toString(숫자) 사용
		strNum = Integer.toString(num);
		
		// 방법 2-3) String.valueOf(숫자) 사용
		strNum = String.valueOf(num);
		
	}

}
