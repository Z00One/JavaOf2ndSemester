import java.util.Scanner;

public class sumOfIntAndAvgOfFloat {
	
	public static void main(String[] args) {
		// 수를 입력 받을 스캐너 인스턴스 선언
		Scanner scn = new Scanner(System.in);
		
		// 합계
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("value");
			int value = scn.nextInt();
			sum += value;
		}
		
		// 평균
		float avg = 0.0f;
		avg = sum / 5.0f;
		
		// 출력
		System.out.print("sum : ");
		System.out.println(sum);

		System.out.print("avg : ");
		System.out.println(avg);
		}
	}