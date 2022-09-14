// Scanner 사용하기 위한 호출
import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		
		// 삼각형 밑변과 높이를 입력 받아 삼각형 면적 값을 출력하는 프로그램
		// 콘솔로부터 입력 받기위한 객체 생성
		Scanner scn = new Scanner(System.in);
		
		// 밑변, 높이 입력받기
		float base;			// 밑변값을 받을 변수 선언
		float height;		// 높이값을 받을 변수 선언
		
		System.out.println("밑변을 입력하세요");
		base   = scn.nextFloat();
		System.out.println("높이를 입력하세요");
		height = scn.nextFloat();
		
		// 면적 계산 및 출력
		float areaOfTriangle = (base * height) / 2;
		
		System.out.println(areaOfTriangle);
	}

}
