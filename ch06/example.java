package ch06;
//32라는 10진수를 2진수로
public class example {

	public static void main(String[] args) {
	Integer i = new Integer(32);
	String s = i.toBinaryString(32);
	System.out.println(s);
	}
}
