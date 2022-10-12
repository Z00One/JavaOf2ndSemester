import java.util.Scanner;

public class Q2A_1012 {

	public static void main(String[] args) {
		// 입력 받기 위한 객체 선언
		Scanner scn = new Scanner(System.in);
		
		// 정수를 입력 받아 아래와 같이 출력하는 프로그램 작성
		System.out.println("what is your sex?");
		
		String printMsg;
		int sex = scn.nextInt();   // 무슨 값이 들어올 줄 모르는데 int로
		
		// 판별
		// 삼항연산자를 사용하여 if - else 문 대신 간단하게 표현할 수 있다.
		System.out.println(sex == 1 ? "Male" : "Female");

	}

}