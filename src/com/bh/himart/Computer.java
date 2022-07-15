package com.bh.himart;

public class Computer extends Product{
	 //cpu, 브랜드, 가격, point
	 //메서드 : info -> 모든 멤버변수 정보 출력
	
	private String cpu;

	//생성자
	public Computer() {
		this.cpu="i7-12000";
		this.setBrand("SSB");
		this.setMoney(2000000);
		this.setPoint(100);
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public void info() {
		super.info();
		System.out.println("CPU : "+this.cpu);
	}
}
