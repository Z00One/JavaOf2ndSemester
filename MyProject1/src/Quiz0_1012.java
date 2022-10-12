import java.util.Scanner;

// 입력한 값들의 정보를 출력해주는 클래스
//class InputValues {
	
	
	InputValues() {												// 생성자
	}
	// 짝수 홀수 판별 메서드
	void EvenOdd(int value) {
		System.out.print("\t\t");
		System.out.println(value % 2 == 0 ? "even" : "odd");
	}
	// 3의 배수 판별 메서드
	void MuitiplesOf3(int value) {
		if (value % 3 == 0) {
		System.out.print("\t\t");
		System.out.println("This is Muitiples of 3");
		}
	}
	// 7의 배수 판별 메서드
	void MuitiplesOf7(int value) {
		if (value % 7 == 0) {
		System.out.print("\t\t");
		System.out.println("This is Muitiples of 7");
		}
	}
	
	
	
}

public class Quiz0_1012 {
	
	public static void main(String[] args) {
		// 입력 받기위한 객체 선언
		Scanner scn = new Scanner(System.in);
		
		// 입력값 판별을 위한 객체 생성
		InputValues output = new InputValues();
		
		int count = 0;
		while (true) {
			count ++;
			
			System.out.print(count + "번째 입력값은 = ");
			String inputValue = scn.next();
			
			// 종료 판별
			boolean flag = (inputValue.charAt(0) == 'q') ? true : false;
			
			// 종료
			if (flag) {
				System.out.println("Thank you");
				break;
				}
			
			// String to int
			int intValue = Integer.parseInt(inputValue);
			
			
			// 멤버 메소드 실행
			output.EvenOdd(intValue);
			output.MuitiplesOf3(intValue);
			output.MuitiplesOf7(intValue);
			
		}
	}
}
		
		