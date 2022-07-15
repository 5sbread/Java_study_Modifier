package com.bh.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//싱글톤 - 디자인패턴 중 1, MVC2
		
		Bh bh = Bh.getInstance(); //클래스 선언
			//클래스명.인스턴스명 //클래스 호출
		
		//객체 만들기
		//데이터타입 변수명 = new 생성자();
//		Bh bh = new Bh();
		bh.setName("bh");
		bh.setAge(31);
		
		String name = bh.getName();
		
		System.out.println(name);
		System.out.println(bh.getAge());
		System.out.println(bh);
		System.out.println("====================");

		Bh bh2 = bh.getInstance();
		System.out.println(bh2.getName());
		System.out.println(bh2.getAge());
		System.out.println(bh2);
		
		
	}

}
