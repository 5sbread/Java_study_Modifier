package com.bh.ex1;

public class Bh {
	
	//fix-study 버전관리중
	
	private String name;
	private int age;
	
	public static Bh bh = null;

	//기본생성자
	public Bh() {}
	
	//    인스턴스->클래스가 됨 / 객체없이 사용가능
	public static Bh getInstance() {
		if(Bh.bh == null ) {
			Bh.bh = new Bh();
		}
		return Bh.bh;
	}
		
	
	//setter
	//접근지정자 void set변수명(000){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
