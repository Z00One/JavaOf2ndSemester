import java.util.*;

public class Gugudan {
	
	public static void main(String args[]) {
		
		// 콘솔로부터 입력 받기 위한 Scanner 객체 선언
		Scanner scn = new Scanner(System.in);
		
		// 구구단 프로그램
		gugudan:
		while (true) {
			// 메뉴 출력하기
			System.out.println("----------------");
			System.out.println("1. Print multiplication tables");
			System.out.println("2. Shutting down a Program");
			System.out.println("----------------");
						
			// 메뉴 입력받기
			int choice = scn.nextInt();
			
			// 1번 메뉴
			if (choice == 1) {
				System.out.println("Enter a column between 2 and 9.");
				// 단 입력받기
				int dan = scn.nextInt();
				
				// 2~9의 범위를 벗어 난다면 다시 입력 받기
				while (dan > 9 || dan < 2) {
					System.out.println("Please enter a column between 2 and 9!!.");
					dan = scn.nextInt();
				}
					// 출력을 위한 형변환
				String row;
				row = String.valueOf(dan);
					
				for (int i = 1; i < 10; i++) {
					// 출력을 위한 형변환
					String col;
					col = String.valueOf(i);
						
					// 단, 행 연산값
					int value = dan * i;
					System.out.print(row + " X " + col + " = ");
					System.out.println(value);
					}
				}
			// 2번 메뉴
			else if (choice == 2) {
				break gugudan;
			}
			// 예외 처리
			else {
				System.out.println("Please enter 1 or 2");
			}
		}
	}
}
