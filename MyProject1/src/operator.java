
public class operator {

	public static void main(String[] args) {
		int a = 0;
		int b = a++;
		
		// 전위형 단항 연산 -> 단항 연산 먼저
		System.out.println(++a); // 2
		
		// 후위형 단항 연산 -> 단항 연산 마지막
		System.out.println(a++); // 2
		
		System.out.println(a);   // 3
		
		System.out.println(b);   // 0
		
	}

}
