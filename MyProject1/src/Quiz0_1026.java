import java.util.Scanner;

// n번째 반복에서 a, n + 1번째 반복에서 c가 나온다면 반복문 종료
public class Quiz0_1026 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		// n번째 값을 담아줄 변수 선언
		char value1 = 0;

		// flag 변수 만들어서 코딩
		
		// n번째 입력 실행
		while (true) {
			char inputValue = (scn.next()).charAt(0);
			
			// n번째 값이 a고 n+1번째 값이 c인 경우
			if (value1 == 'a' && inputValue == 'c') {
				System.out.println("true");
				break;
			}
			// n 번째 값
			value1 = inputValue;
		}
	}
}