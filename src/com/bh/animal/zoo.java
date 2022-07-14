package com.bh.animal;

public class Zoo {
	//멤버변수
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//클래스변수
	public static String title="사파리";
	
	//인스턴스변수
//	public int price=50000;
	public final int price = 50000;
	//     ㄴ 값을 지정한 후 변경 불가
	
	public final int PRICE = 10000; //멤버 변수 선언 -> 변수를 상수 취급해서 전부 대문자
	public final int MAX_VALUE = 1000; //
	
	//멤버 메서드 선언
	//접근지정자 [그외지정자] 리턴타입 메서드명 (매개변수선언){}
	//클래스메서드
	public static void info () {
		System.out.println("Static Method");
		System.out.println(Zoo.title);
//		System.out.println(price);
//		Zoo.getPrice(); <- 메서드가 만들어지기 전이라서 에러
//클래스메서드는 인스턴스 메서드 호출 불가
//		ㄴ static이 붙으면 개체 만들기 전에 사용 가능
	}
	
	//인스턴스메서드
	public void getPrice() {
		System.out.println(price);
		System.out.println(Zoo.title);
		Zoo.info();
	}
	
	
	
	
}
