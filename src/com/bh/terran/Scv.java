package com.bh.terran;

import com.bh.unit.Unit;

public class Scv extends Unit {

//오버라이딩
	public void move() {
		System.out.println("이동");
	}
	
	public void attack() {
		System.out.println("공격");
	}
}