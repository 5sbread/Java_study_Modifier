package com.bh.main;

import com.bh.terran.Marine;
import com.bh.terran.Scv;
import com.bh.unit.Unit;

public class Main {

	public static void main(String[] args) {
	//  super(); 있는데 생략ㅓㅣㅁ
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		
		m1.setHp(30);
		m1.info(); //완성된 메소드라서 사용가능
		m1.move(); //오버라이딩 해서 사용 가능
		
		//Marine is a unit
		//Scv is a unit / SCv는 유닛 타입이다
		
		Unit unit = m1;
		
		System.out.println(unit.getColor());
		System.out.println(unit.getHp());
		System.out.println(unit.getName());
		//System.out.println(unit.getw); //Marine의 weapon은 불러올수없음 -> unit이 아는 정보는 name까지
		
		//m1 = unit; 불가능
		m1 = (Marine)unit; //유닛을 마린타입으로 형변환해서 넣기
		
		System.out.println(m1.getWeapon()); //weapon 불러오기 가능해짐 (상속과 다형성)
		
	}

}
