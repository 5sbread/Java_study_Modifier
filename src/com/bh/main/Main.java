package com.bh.main;

import com.bh.animal.Cat;
import com.bh.animal.Human;
import com.bh.animal.Zoo;

public class Main {

	public static void main(String[] args) {
//		//생성자 만들기 (없으면 컴파일러가 디폴트 생산자를 만들어줌)
//		Cat cat = new Cat();
////		생성자
//		cat.sound();
//		//cat.age = 5;
		Human human = new Human();
		human.setAge(250);
		human.info();
		//-----------------------
		System.out.println(Zoo.title);
		Zoo.info();
	}

}
