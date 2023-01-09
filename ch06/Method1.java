package ch06;

class Method11{
	int abs(int num) {
		if(num<0)
			num = -num;
		return num;
	}
	void prn(int a, int b) {
		int c = a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}

public class Method1 {

	public static void main(String[] args) {
		Method11 m = new Method11();
		int a = m.abs(-10);
		System.out.println(a);
		m.prn(10, 20);
		
	}

}
