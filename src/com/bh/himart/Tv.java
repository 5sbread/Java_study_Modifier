package com.bh.himart;

public class Tv extends Product{
	//사이즈, 브랜드, 가격, point
	//메서드 : info -> 모든 멤버변수 정보 출력
	
	private int size;
	
	public Tv() {
		this.size=100;
		this.setBrand("Samsumg");
		this.setMoney(8000000);
		this.setPoint(500);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void info() {
		super.info();
		System.out.println("Size : "+size);
	}
	
	
	
}
