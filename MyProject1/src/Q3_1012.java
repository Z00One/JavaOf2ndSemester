import java.util.Iterator;

public class Q3_1012 {

	public static void main(String[] args) {
		// 1 ~ 100 사이 정수 중 짝수이면서
		// 8의 배수 또는 5의 배수인 값만 출력하라
		// for문 사용
		for (int value = 1; value <= 100; value++) {
			
			// 판별
			boolean flag = value % 8 == 0 || value % 5 == 0;
			
			// 출력
			if (flag) {
			System.out.println(value);}	
		}

	}

}
