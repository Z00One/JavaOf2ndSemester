
public class Operator2 {

	public static void main(String[] args) {
		byte a = 1;
		byte b = 2;
		
		// (자료형) 
		// -> 형 변환하는 단항연산자 
		// -> 이 경우에는 전위형으로 사용해야 함
		byte c = (byte)(a + b);
		System.out.println(c);
		
		byte d = (byte)129;
		// 리터럴 상수 정수형은 자료형이 int
		// 단항연산이라 129는 int형이 아님
		// 오버플로우가 일어나게 된다. 129 - 127
		// 2만큼의 오버플로우가 일어남
		// 따라서 -127의 결과값이 나온다.
		
		byte e = (byte)2000000000;
		
		float f = 200000000f;
		long g = 2L;
		
		float h = f + g;
		System.out.println(f);
		// 
		
		long aa = 200000000000000L;
		//문자형
	}

}
