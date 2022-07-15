package com.bh.himart;

public abstract class Product {

	
	//공통 요소 : 브랜드, 가격, point
	private String brand;
	private int money;
	private int point;

	//같은 부분은 super.info();로 상속받고 하나만 추가 작성하는 방법
	public void info() {
		System.out.println("Brand : "+this.getBrand());
		System.out.println("Price : "+this.getMoney());
		System.out.println("Point : "+this.getPoint());
	}

	
//	//동일 메서드 : 모든 멤버 변수 출력 (한가지 다름)
//	public abstract/*추상메서드*/ void info();
//// 상속받아서 원하는대로 바꿔서 사용	

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
}
