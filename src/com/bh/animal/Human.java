package com.bh.animal;

public class Human {
	
	private int age;
	//프라이빗 데이터를 외부로 보내기 위해 퍼블릭 메서드 이용
	public int getAge() {
		return this.age;
	}

//게터메서드 : get+변수명 : 무언가를 반환하기 위한 메서드	
//새터메서드 : set+변수명 : 무언가를 집어넣기위한 메서드	
	public void setAge(int age) {
		this.age = 0;
		if(age>=0 && age<150) {
			this.age=age;
		}
		
//		if(age>=0 && age<150) {
//		this.age = age;
//		}else {
//			this.age = 0;
//		}
	}
	
	public void info() {
		System.out.println(this.age);
	}
	
	public void myPet() {
		Cat cat = new Cat();
		cat.sound();
		cat.age =15 ; 
	}
	
}
