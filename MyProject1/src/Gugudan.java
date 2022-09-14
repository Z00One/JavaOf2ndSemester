import java.util.*;

public class Gugudan {
	
	public static void main(String args[]) {
		
		while (true) {
			// 메뉴 출력하기
			System.out.println("----------------");
			System.out.println("1. Print multiplication tables");
			System.out.println("2. Shutting down a Program");
			System.out.println("----------------");
			
			// 콘솔로부터 입력 받기 위한 Scanner 객체 선언
			Scanner scn = new Scanner(System.in);
			
			// 메뉴 입력받기
			int choice = scn.nextInt();
			
			if (choice == 1) {
				System.out.println("Please enter a column between 2 and 9.");
				// 단 입력받기
				int dan = scn.nextInt();
				
				while (dan > 9 || dan < 2) {
					int dan = scn.nextInt();
			}
//			
//			// 출력을 위한 형변환
//			String row;
//			row = String.valueOf(dan);
//			
//			for (int i = 1; i < 10; i++) {
//				// 출력을 위한 형변환
//				String col;
//				col = String.valueOf(i);
//				
//				// 단, 행 연산값
//				int value = dan * i;
//				System.out.print(row + " X " + col + " = ");
//				System.out.println(value);
			}
		}
	}
}
