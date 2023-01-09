package ch05;

public class Ex1 {

	public static void main(String[] args) {
		//배열 변수 선언
		int arr[];
		//배열의 크기 지정(불변)
		arr = new int [5];
		//배열값 할당
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 1;
		//4배열의 출력
		for(int i =0; i<arr.length; i ++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		int arr1[] = new int[3];
		for(int i =0;i<arr1.length; i++) {
			arr1[i]=i*10;
			System.out.println(arr1[i]);
		}

	}

}
