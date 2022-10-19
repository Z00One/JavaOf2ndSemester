import java.util.Scanner;

// 키보드로부터 정수 2개를 입력 받아, M ~ N 사이의 정수를 출력해라
public class Quiz3_2_1019 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// 입력 받기
		System.out.println("M값을 입력하세요");
		int M = scn.nextInt();
		System.out.println("N값을 입력하세요");
		int N = scn.nextInt();
		
		// 출력
		// M < N -> M에서 N까지 정수 출력
		if (M < N) {
			System.out.println("M : " + M + " ~ N : " + N + "사이 정수 값은"); 
			for (int i = M; i <= N; i++) {
				System.out.print(i == N ? i + "\n" 
						: i + ", ");
			}
		}
		// M > N -> N에서 M까지 정수 출력
		else if (M > N) {
			System.out.println("N : " + N + " ~ M : " + M + "사이 정수 값은");
			for (int i = M; i >= N; i--) {
				System.out.print(i == N ? i  + "\n" 
						: i + ", ");
			}
		}
		// M = N -> 입력 값 출력
		else {
		System.out.println("N, M 정수 값 : " + M);
		}
		System.out.println("----감사합니다----");
	}
}
