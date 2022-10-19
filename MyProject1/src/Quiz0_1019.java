import java.util.Iterator;
import java.util.Scanner;

public class Quiz0_1019 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// 콘솔로부터 문자열 입력 받기
		String inputString = scn.next();
		
		// 입력 받은 문자열에서 첫 번째 들자를 반환 -> (0번째)
//		char inputChar = inputString.charAt(0);
		
		// 입력받은 알파벳이 "d" 이며 "참 아니면 "거짓"을 출력하는 코드 작성
//		System.out.println(inputChar == 'd' ? "true" : "false");
		
		// 입력받은 값이 f, t, u, k 일 경우 해당 값 출력
		// 그외 값 아무것도 출력하지 않음
		// 예) a -> x
		
//		if (inputChar == 'f' || inputChar == 't' || inputChar == 'u' || inputChar == 'k') {
//			System.out.println(inputChar);
//		}else {
//			System.out.println("잘못된 입력 값");
//		}
		
		int hCount = 0;
		int tCount = 0;
		int pCount = 0;
		int etcCount = 0;
		// 입력 받은 문자열에서 모든 글자를 반환
		for (int i = 0; i < inputString.length() ; i++) {
			char inputChar = inputString.charAt(i);
			
			// 'h', 't', 'p' -> 글자 별 발생 빈도를 출력하라
			// hhtttpppp -> h : 2, t : 3, p : 4
			// 그 외 3개
			
			
			// 카운트
			// h
			if (inputChar == 'h') {
				hCount++;
			}else if (inputChar == 't') {
				tCount++;
			}else if (inputChar == 'p') {
				hCount++;
			}else {
				etcCount++;
			}
			
			// t
			// p
			// 그 외
		}
		System.out.println("h : " + hCount + ", t : " + tCount + ", p : " + pCount);
		System.out.println("그 외" + etcCount + "개");
	}

}
