import java.util.Scanner;

public class Q2_1012 {

	public static void main(String[] args) {
		// 입력 받기 위한 객체 선언
		Scanner scn = new Scanner(System.in);
		
		// 정수를 입력 받아 아래와 같이 출력하는 프로그램 작성
		System.out.println("what is your sex?");
		
		String printMsg;
		int sex = scn.nextInt();
		
		// 판별
		if (sex == 1) {			// 남자
			printMsg = "Male";
		}
		else if (sex == 2) {	// 여자
			printMsg = "Female";
		}
		else {					// 그 외
			printMsg = "잘못된 입력 값.";
		}
		
		System.out.println(printMsg);

	}

}