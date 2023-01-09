package ch06;

class Car1{
	String carName;
	int velocity;
	String carColor;
	
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if(velocity<0)
			velocity = 0;
	}
	void stop() {
		velocity = 0;
	}
}
//필드: 객체의 속성<무조건()는 없다.
//
//.java로 선언된 클래스만 public 사용가능
public class Car {

	public static void main(String[] args) {
		int arr[]=new int[3];
		System.out.println(arr.length); //length-변수
		String str = "오늘의 메뉴는 수구레";
		System.out.println(str.length());//length-메소드 괄호있음
		//객채 생성
		Car1 c1 = new Car1();
		c1.carName = "소나타";
		c1.carColor = "은색";
		c1.speedUp();
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
	}

}
