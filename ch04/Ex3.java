package ch04;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		if(a<10 && a%3==0) {
			System.out.println("짝");
		}
		else if((10<a&&a<20) && a%3==1) {
			System.out.println("짝.");
		}else
		{
			System.out.println(a +"입니다.");
		}
	}

}
