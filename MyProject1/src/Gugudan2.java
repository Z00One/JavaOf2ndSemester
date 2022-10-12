import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
	// 값을 입력받아줄 객체 선언
	Scanner scn = new Scanner(System.in);
	
	while(true) {	
		// 메뉴 우선 출력 후
		System.out.println("---------------");
		System.out.println("1. Print gugudan");
		System.out.println("2. Shut down");
		System.out.println("---------------");
		
		// 메뉴 선택
		int menuValue = scn.nextInt();
		
		// 구구단 출력
		if (menuValue == 1) {
			System.out.println("Plese input dan of gugudan");
			
			// 단 입력받기
			int dan = scn.nextInt();
			
			// 2 ~ 9가 아닌 수가 입력되는 경우
			while (dan < 2 || dan > 9) {
				System.out.println("Plese input dan from 2 to 9!!!!");
				dan = scn.nextInt();
			}
	
			// 출력
			for (int col = 1; col < 10; col++) {
				System.out.println(dan + " X " + col + " = " + (dan * col));
			}
	
		 // 프로그램 종료
		}else if (menuValue == 2) {
			System.out.println("Thank you for using this program");
			break;
			
		 // 예외 처리
		}else {
			System.out.println("please input value 1 or 2");
		}
	}
	// Scanner 사용 종료
	scn.close();
}
}
