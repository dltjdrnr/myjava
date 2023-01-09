package ch06;
class Constructor5{
	int a;
	String str;

	public Constructor5() {
	}
	public Constructor5(int i) {
		a = i;
	}
	public Constructor5(String s) {
		str = s;
	}
	class Constructor5_1{
		public Constructor5_1() {
			
		}
		public Constructor5_1(int i) {
			//자신의 디폴트 생성자 호출, 반드시 생성자의 첫번째 라인에 위치
			//즉 super() 같이 사용 불가
			this();
			a=i;
		}
		public Constructor5_1(String s) {
			this();
			str=s;
}
	}
}
public class ConstructorEx5 {

	public static void main(String[] args) {
		

	}

}
