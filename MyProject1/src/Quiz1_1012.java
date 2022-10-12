import java.util.Scanner;

// 입력한 값들의 정보를 출력해주는 클래스
class InputValues {
	InputValues() {														// 생성자
	}
	// 짝수 홀수 판별 메서드
	void EvenOdd(int value) {
		System.out.print("\t\t");
		System.out.println(value % 2 == 0 ? "even" : "odd");
	}
	// 배수 판별 메서드
	void CheckMuitiple(int value, int divide) {
		if (value % divide == 0) {
		System.out.println("\t\tThis is Muitiples of " + divide);
		}
	}
}

public class Quiz1_1012 {
	
	public static void main(String[] args) {
		// 입력 받기위한 객체 선언
		Scanner scn = new Scanner(System.in);
		
		// 입력값 판별을 위한 객체 선언
		InputValues output = new InputValues();
		
		int count = 1;
		while (true) {
			
			System.out.print(count + "번째 입력값은 = ");
			String inputValue = scn.next();
			
			// 정수인 경우
			try {
			
				// Type Casting String to int
				int intValue = Integer.parseInt(inputValue);
				
				// 멤버 메소드 실행
				output.EvenOdd(intValue);
				output.CheckMuitiple(intValue, 3);
				output.CheckMuitiple(intValue, 7);
				
				++count;
			}
			
			// 정수가 아닌 경우
			catch (Exception e) {
				while(inputValue.charAt(0) != 'q') {				// 올바른 종료 명령어가 나올 때까지
					System.out.print("올바른 종료 명령어를 입력하세요.");
					inputValue = scn.next();
				}
				// 종료
				System.out.println("Thank you");
				break;
			}
		}
	}
}