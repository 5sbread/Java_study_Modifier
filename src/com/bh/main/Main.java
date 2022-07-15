package com.bh.main;

import com.bh.util.Collection;
import com.bh.util.CollectionStack;

public class Main implements CollectionStack{

	public static void main(String[] args) {
	
//1. com.bh.util.CollectionStack
//add 메서드 호출 -> 입력받은 새로운 숫자 추가 (무조건 0번 인덱스에)
//remove 메서드 호출 -> 0번 인덱스 숫자 삭제
		
//2. com.bh.util.CollectionQue
//add -> 새로운 숫자 추가 (무조건 0번)
//remove -> 마지막 인덱스 번호 삭제
		
//3. com.bh.util.CollectionSet
//add -> 새로운 숫자 마지막에 추가
//		단 중복되지 않는 숫자만 추가
//remove -> 삭제할 숫자 입력받아서 일치하는 숫자 삭제
		
//전부 새로 만들어진 배열 리턴		

		
//===========================================		
//		//test data set
//		int [] nums = {1, 2, 3};
//		
//		collectionStack.add(); //-> {4, 1, 2, 3}
//		collectionStck.remove(); //-> {2, 3}
//============================================
		
		CollectionStack cs = new CollectionStack() {
			
			@Override
			public int[] remove(int[] numbers) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int[] add(int[] numbers) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		int [] nums = {5, 6, 7};
		
		cs.add();
		
		cs.remove();
		
		
		
		
	}

}
