class FishCake{
	
	//Member variable
	String name;
	
	//Member method
	void prtNameOfFish() {
		System.out.println(name);
	}
	
	// Constructor (생성자) 매개변수 사용 가능하다.
	FishCake() {
		System.out.println("초기화 작업이 살행됩니다.");
	}
}

public class Class1 {

	public static void main(String[] args) {
		
		FishCake fish1 = new FishCake();
		fish1.name = "ss";
		
	}

}
