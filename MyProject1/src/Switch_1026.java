import java.util.Scanner;

public class Switch_1026 {

	public static void main(String[] args) {
		// 입력받은 0 ~ 5까지 입력받은 정수에 해당하는 ASCII 코드 값 반환
		Scanner scn = new Scanner(System.in);
		
		int inputValue;
		while (true) {
		
		// 값 입력받기
		inputValue = scn.nextInt();
		String output;
		switch (inputValue) {
		case 0:
			output = "NUL";
			break;
		case 1:
			output = "SOH";
			break;
		case 2:
			output = "STX";
			break;
		case 3:
			output = "ETX";
			break;
		case 4:
			output = "EOT";
			break;
		case 5:
			output = "ENQ";
			break;
		default:
			output = "0 ~ 5 의 정수를 입력하세요.";
		}
		System.out.println(output);
		}
	}

}
