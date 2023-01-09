package ch06;
class Car3{
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
public class CarEx3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3();
		c1.carName = "소나타";
		c2.carName = "아반테";
		System.out.println("c1:"+c1.carName);
		System.out.println("c2:"+c2.carName);
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());
		c2=c1; //car3클래스를 참조하는 참조형 변수 c1의 주소값을 c2가 복사
				//call by reference
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());
		System.out.println("c1:"+c1.carName);
		System.out.println("c2:"+c2.carName);
		c1.carName="그랜저";
		int a=10;
		int b=a; //call by value
		a=20;
		System.out.println(a+b);
	}

}
