package ch06;
class Constructor2 extends Object{
	public Constructor2() {
		super();
	}
	//jvm은 생성자가 하나라도 선언되어 있으면 디폴트 생성자 제공 안함.
	public Constructor2(int i) {
		this();
	}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		Constructor2 c1 = new Constructor2();
		Constructor2 c2 = new Constructor2(22);
		
	}

}