
public class operator1 {

	public static void main(String[] args) {
		
		int param = 20;
		int result = 0;
		
		result = --param;	// 19, 19
		System.out.println("result" + result + ", param" + param);
		
		
		result = param--;   // 19, 18
		System.out.println("result" + result + ", param" + param);
	}

}
