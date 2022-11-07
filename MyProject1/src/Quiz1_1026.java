import java.util.Scanner;

// 1 ~ N까지 7의 배수 합 구하기
public class Quiz1_1026 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("1 ~ N 까지의 배수합 구하기.");

		int n = 0;
		// N값 입력받기
		while(true) {
		System.out.print("양수 N의 값을 입력하시오: ");
		n = scn.nextInt();
		// 양의 정수를 입력받으면 종료
		if (n >= 1) {
			break;
		}

		}
		final int SEVEN   			= 7;   	   // 7을 담아줄 상수 선언
		int sumOfMultiple 			= 0; 	   // 배수합을 담을 변수 선언
		int num                     = 0;	   // 100을 넘긴 배수를 담을 변수 선언
		boolean IsFoundFirstValue   = false;   // 100을 처음으로 넘겼는 지를 판별할 변수 선언
		
		// 배수합 연산
		for (int i = 0; i <= n; i += SEVEN) { // 0, 7, 14 ...
			sumOfMultiple += i;

			// 100을 처음으로 넘긴 배수
			if (!IsFoundFirstValue && sumOfMultiple >= 100) {
				num = i;
				IsFoundFirstValue = true;
			}
		}
		
		// 출력
		System.out.println("0 ~ " + n + "까지  7의 배수합은: " + sumOfMultiple);
		System.out.println("누적된 합의 값이 처음으로 100을 넘기는 7의 배수는 " + num);		
	}
}
