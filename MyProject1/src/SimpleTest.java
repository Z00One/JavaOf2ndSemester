import java.util.Iterator;

public class SimpleTest{
	public static void main(String[] args) {
		for (int i = 1, j = 0 ; i <= 100 && j < 30 ; i++) {
			if (i % 3 == 0) {
				j += i;
				System.out.println(i);
			}
		}
	}
}