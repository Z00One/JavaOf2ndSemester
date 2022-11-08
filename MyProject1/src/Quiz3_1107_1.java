import java.util.Scanner;

// 1 ~ 20 단 중에 입력되는 값의 배수인 단만 출력하는 구구단 출력 프로그램

class Gugu{
	
	// 생성자
	Gugu(){
	}
	
	// 구구단 출력
	void printGugudan(int inputnum) {
		
		// 열
		// for (int row = 1; row <= 20 && row % inputnum == 0; row ++) { -> 조건문이 false가 나오는 순간 끝
		for (int row = 1; row <= 20; row ++) {
			// 행
			if (row % inputnum == 0) {
				for (int col = 1; col < 10; col ++) {
					System.out.print(row + " X " + col + " = " + (row * col) + "\t");
				}
				System.out.println();
			}
			// 단 바꾸기
			}
		}
	}

class inputInt {
	// 멤버 변수 선언
	int M;
	int N;
	boolean isequalMN;
	
	// 멤버 변수에 값 담아주기
	inputInt(int valueA, int valueB){
		this.M = valueA;
		this.N = valueB;
		isequalMN = M == N ? true : false ;
	}
	
	// 담긴 변수들의 크기 차이에 따라 출력
	void print() {
		if (isequalMN) {
			
		}
		else {
			
		}
	}
	
}

public class Quiz3_1107_1 {

	public static void main(String[] args) {
		Gugu gugu = new Gugu();
		gugu.printGugudan(3);
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("M갑을 입력하세요");
		int M = scn.nextInt();
		System.out.println("M갑을 입력하세요");
		int N = scn.nextInt();
		
		inputInt iI = new inputInt(M, N);
		iI.print();
	}

}
