
public class java1012 {

	public static void main(String[] args) {
		
		// 문자		Primitive Variable
		char temp1 = 'a';
		
		// 문자열		Reference Variable
		String temp2 = "a";
		
		// 비교연산자 
		// >	>=
		// <	<=
		// ==	!=
		
		// 논리연산자
		// 짝수이면서 7의 배수이면서 10의 배수
		System.out.println(true && true && true);
		
		
		
		int intNum = 1234;
		float floatNum = 1234.5678f;

		String intStr = Integer.toString(intNum);
		System.out.println(System.identityHashCode(intStr));
		System.out.println(System.identityHashCode(intNum));
		
		
	}

}
