package com.bh.util;

import java.util.Scanner;

public class CollectionStack implements Collection{
	
	Scanner sc = new Scanner(System.in);
		
	@Override
	public int[] add(int[] numbers) { //매개변수로 int배열이 선언된 add 메서드
		System.out.println("추가할 데이터를 입력하세요.");
		int num = sc.nextInt(); //추가할 데이터	
		
		int [] newAr = new int[numbers.length+1];
		//새 배열의 크기는 기존+1
		
		newAr[0] = num;
		for(int i=0; i<numbers.length; i++) {
			newAr[i+1] = numbers[i];
		}//기존 배열 복사해오기
		
		return newAr;
	}
	
	
	public int[] remove(int[] numbers) {
		int [] newAr = new int[numbers.length-1];
		for(int i=0; i<numbers.length; i++) {
			newAr[i-1] = numbers[i];
		}
		return newAr;
	}
}
	
	
	
//===========================================================
// 내가 만든 코드
	
//	public static void add() {
//		
//		int [] numbers = {1, 2, 3};
//		
//		System.out.println("배열에 저장할 숫자를 입력하세요.");
//		int num = sc.nextInt();
//		
//		int [] numbersCopy = new int [4];
//		for(int i=0; i<numbers.length; i++) {
//			numbersCopy[i+1]=numbers[i];
//		}
//		
//		for(int i=0; i<numbersCopy.length; i++) {
//			numbers=numbersCopy;
//		}
//		
//		System.out.println("추가되었습니다. | 변수 : "+numbers);
//	}
//	
//
////================================================	
//	//public abstract int [] remove(int [] numbers) ;
//	public static void remove() {
//	
//		int [] numbers = {1, 2, 3};
//		
//		int [] numbersCopy = new int[2];
//		for(int i=0; i<numbers.length; i++) {
//			numbersCopy[i] = numbers[i+1];
//		}
//		
//		for(int i=0; i<numbersCopy.length; i++) {
//			numbers=numbersCopy;
//		}
//		
//		System.out.println("삭제되었습니다. | 변수 : "+numbers);
//	}
//	
//}
