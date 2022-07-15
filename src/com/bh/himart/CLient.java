package com.bh.himart;

import com.bh.main.Main;

public class Client {

	private int price;
	private int point;
	
	public Client() {
		this.price=50000000;
		this.setPoint(900);
	}
	
	public void buy(int money, int point) {
		//내 돈 - 가격 (컴, 티비, 폰 중 1) - 가격*0.1
		//내 포인트 + 포인트 - 사용포인트
		this.price = this.price - money;
		this.point = this.point - point;
		
		System.out.println("잔액 : "+this.price);
		System.out.println("남은 포인트 : "+this.point);
	}
	
	//오버로딩
	public void buy(Computer computer) {
		this.price = this.price - C;
		this.point = this.point - point;
		
		System.out.println("잔액 : "+this.price);
		System.out.println("남은 포인트 : "+this.point);
	}
	}
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
