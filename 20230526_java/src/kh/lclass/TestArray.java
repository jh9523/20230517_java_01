package kh.lclass;

import java.util.Arrays;


public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = new String[3];
		strArr[0] = "apple";
		strArr[1]= "banana";
		strArr[2] = new String("mango");
		// strArr을 복사할 strCopyArr 생성
		String[] strCopyArr = new String[strArr.length];
		for(int i = 0; i < strArr.length; i++) {
			strCopyArr[i]=strArr[i]; 
		}
		strArr[2] = "orange";
		strCopyArr[1] = "딸기";
		for(int i =0; i<strCopyArr.length; i++) {
			System.out.println(strArr[i]+" : " +strCopyArr[i]);
		}
		System.out.println("======================");
		
		int[] arrA = new int[3];
		arrA[2]=20;
		int[] arrB = arrA.clone();
		System.out.println(arrB.length);
		System.out.println(arrB[2]);
		
		System.out.println("=== Arrays.coptOf ===");
		String[] strCopyArr2 = Arrays.copyOf(strArr, 5);
		System.out.println(strArr.length);
		for(int i = 0; i<strCopyArr2.length; i++) {
			System.out.println(strCopyArr2[i]);
		}
		
		System.out.println("====Systme.====");
		String[] strCopyArr3 = new String[5];
		System.arraycopy(strArr, 1, strCopyArr3, 0, 2);
		for(int i=0; i<strCopyArr3.length; i++) {
			System.out.println(strCopyArr3[i]);
		}
		
		
		
		
		String[] strArr2 = {"apple", "banana", new String("mango")};
		String[] strArr3 = {new String("apple"), "banana", new String("mango")};
		String[] strArr4 = new String[] {"apple", "banana", new String("mango")};
		String[] strArr5 = new String[] {new String("apple"), "banana", new String("mango")};
		
		System.out.println("strArr의 3번째 과일은 "+strArr[strArr.length-1]);
		
		for(int i =0 ; i<strArr.length; i++) {
			System.out.println((i+1)+"번째 과일은 "+strArr[i]);
		}
		
		
		
		
		
		System.out.println(strArr[0]);
		
		int[] intArr = new int[3];
		System.out.println(intArr[1]);
		
		int[] intArr2 = {1,2,3};
		int[] intArr3 = new int[] {1,2,3,4};
		
//		Student[] studentArr = new 
		
	}

}
