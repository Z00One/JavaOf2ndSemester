
public class MyPrg1 {

	public static void main(String[] args) {
		// variable
		int ValueA = 1;
		int ValueB = 1;
		
		// 메모리 바이트 수가 같거나 더 넓은 범위로는 형변환이 가능하다.
		long ValueC = ValueA + ValueB;
		
		// ++ 반대의 경우는 오류가 난다!
		
		System.out.println(ValueC);
	}

}
