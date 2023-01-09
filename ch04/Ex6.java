package ch04;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int score, year;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.(0-100)");
		score = sc.nextInt();
		System.out.println("학년을 입력하세요(1-4).");
		year = sc.nextInt();
		if(score>=60){
			if(year<4) {
				System.out.println("합격입니다.");
			}
			else if(year==4 && score<70) {
				System.out.println("불합격입니다.");
			}else {
				System.out.println("합격입니다.");
			}
		}else{
			System.out.println("불합격입니다.");
		}
	}
}
