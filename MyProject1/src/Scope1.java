import java.util.Iterator;

// 변수의 scope, life cycle
public class Scope1 {

	public static int bar = 20;

	public static void main(String[] args) {
		{	// '{}' -> 브레이스 문?
			
			System.out.println(bar);
			
			bar = 30;
		}
		
		System.out.println(bar);
	}

}
