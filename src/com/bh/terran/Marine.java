package com.bh.terran;

import com.bh.unit.Attacker;
import com.bh.unit.Unit;

public class Marine extends Unit implements Attacker{ //import없이 이렇게 쓰기 가능 com.bh.unit.Unit
	//unit의 내용을 상속받는다는 뜻
	
	
	private String weapon;

	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
//--------------------------------	
	public Marine() {
		System.out.println("Marine 생성자");
	}

//오버라이딩
	public void info() {
		super.info(); //부모영역에 있는 info
		System.out.println("Marine Info");
	}
	
//오버라이딩	
	public void move() {
		System.out.println("뛰어다님");
	}

	public void attack() {
		this.shoot();
	}
		
	private void shoot() {
		System.out.println("총쏘기");
	}
	
	
}
