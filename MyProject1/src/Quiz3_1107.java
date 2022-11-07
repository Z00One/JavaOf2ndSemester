import java.util.Scanner;

// 1 ~ 20 단 중에 입력되는 값의 배수인 단만 출력하는 구구단 출력 프로그램

class Gugu{
	
	// 생성자
	Gugu(){
	}
	
	// 구구단 출력
	void printGugudan(int inputnum) {
		
		// 열
		for (int row = 1; row <= 20; row ++) {
			// 행
			if (row % inputnum == 0) {
			for (int col = 1; col < 10; col ++) {
				System.out.print(row + " X " + col + " = " + (row * col) + " ");
			}
			// 단 바꾸기
			System.out.println();
			}
		}
	}
}
public class Quiz3_1107 {

	public static void main(String[] args) {
		Gugu gugu = new Gugu();
		gugu.printGugudan(5);
	}

}
