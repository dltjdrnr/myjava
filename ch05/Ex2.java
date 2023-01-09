package ch05;

public class Ex2 {

	public static void main(String[] args) {
		// 다차원배열
		
		int arr[][] = new int[2][3];
		/*for(int i =0; i<arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=i+j;
				//System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}*/
		int add=0;
		int arr2[][]= {{1,2},
					{3,4,5},
					{6},
					{1,2,3,4},
					{2,3,4}};
		for(int i=0; i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length; j++) {
				 add = add+arr2[i][j];
			}
		}
		System.out.println(add);
		double add1=0;
		double avg=0;
		int count = 0;
		double arr3[][] = {{1.0},
	               {2.3,3.4},
	               {4.5,6.2,4.3},
	                {9.0}};
		for(int i=0; i<arr3.length;i++) {
			for(int j=0; j<arr3[i].length; j++) {
				add1 = add1 + arr3[i][j];
				count++;
			}
		}
		avg = add1/count;
		System.out.println(avg);
	}

}
