package com.bh.unit;

public abstract class Unit {
//     unit 객체 생성을 못하도록 막는 역할 -> 상속해서 써야함
//Unit unit = new Unit(); 불가능	
	
	
	//클래스 간의 공통 요소
	private int hp;
	private String color;
	private String name;
	
	public Unit () {
		System.out.println("Super 생성자");
	}
	
	//
	public abstract void move ();
	
	public void info() {
		System.out.println("Super Info");
	}
	
	//
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
