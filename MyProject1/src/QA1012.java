import java.util.Scanner;

public class QA1012 {

	public static void main(String[] args) {
		// 입력받기 위한 객체 선언
		Scanner scn = new Scanner(System.in);
		
		// 0 ~ 100 사이 정수 입력 받기
		System.out.println("Enter integer between 0 to 100");
		
		int inputValue = scn.nextInt();
		
		// 출력할 메시지
		String resultMsg;
		
		if(inputValue > 100 || inputValue < 0) {resultMsg = "Out of range";}
		// 등급 판단
		// 90이상
		else if(inputValue >= 90) {resultMsg = "A";}
		// 80이상
		else if(inputValue >= 80) {resultMsg = "B";}
		// 70이상
		else if(inputValue >= 70) {resultMsg = "C";}
		// 60이상
		else if(inputValue >= 60) {resultMsg = "F";}
		// 60미만
		// else if(inputValue < 60) {resultMsg = "F";} 이렇게 하면 오류 발생하는 이유
		else {resultMsg = "F";}
		
		System.out.println(resultMsg);
	}

}
