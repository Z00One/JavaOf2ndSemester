import java.util.Scanner;

public class Q1012 {

	public static void main(String[] args) {
		// 입력받기 위한 객체 선언
		Scanner scn = new Scanner(System.in);
		
		// 0 ~ 100 사이 정수 입력 받기
		System.out.println("Enter Integer between 0 to 100");
		
		int inputValue = scn.nextInt();

		if(inputValue > 100 || inputValue < 0) System.out.println("입력 값 오류");
		// 등급 판단
		// 90이상
		else if(inputValue >= 90) System.out.println('A');
		// 80이상
		else if(inputValue >= 80) System.out.println('B');
		// 70이상
		else if(inputValue >= 70) System.out.println('C');
		// 60이상
		else if(inputValue >= 60) System.out.println('D');
		// 60미만
		else if(inputValue < 60) System.out.println('F');
		
	}

}
