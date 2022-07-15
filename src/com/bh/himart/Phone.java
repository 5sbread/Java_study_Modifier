package com.bh.himart;

public class Phone extends Product {
	//제조회사, 브랜드, 가격, point
	//메서드 : info -> 모든 멤버변수 정보 출력
	
	private String company;
	
	public Phone() {
		this.setCompany("Samsung");
		this.setBrand("Note 10+");
		this.setMoney(150000);
		this.setPoint(300);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void info() {
		super.info();
		System.out.println("Company : "+company);
	}
}
