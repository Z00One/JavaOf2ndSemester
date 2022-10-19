// 구구단 출력 프로그램

public class Quiz3_1_1019 {

	public static void main(String[] args) {
		// 열
		for (int row = 2; row <= 9; row++) {
			
			// 짝수일 때만 출력
			if (row % 2 == 0) {
				
				// 행 
				for (int col = 1; col <= 9; col++) {
					
					// row x col 출력
					int value = row * col; 
					System.out.print(row + " X " + col + " = "+ value + "\t\t");
					
					// 3의 배수를 곱하는 경우 - 엔터
					if (col % 3 == 0) {
						System.out.println();
					}
				}
				// 열이 바뀌면 띄어주기
				System.out.println();
			}		
		}
	}

}
