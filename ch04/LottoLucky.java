package ch04;

import java.util.Arrays;

public class LottoLucky {

	public static void main(String[] args) {
		int lotto[] = getLotto();
		for (int i = 0; i < lotto.length; i++) {
		System.out.print(lotto[i]+"\t");	
		}

	}

	public static int[] getLotto(){
		
		int lotto[] = new int[6]; //배열밑에 항상 for 문
		boolean isNumThere = false;
		for (int i = 0; i < lotto.length; i++) {
			isNumThere = false;
			lotto[i]=(int)(Math.random()*45)+1; //1~45까지
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					isNumThere = true;
				}
			}
			if(isNumThere)
				i--;
		}
		Arrays.sort(lotto); //오름차순 정렬
		return lotto;
	}
}