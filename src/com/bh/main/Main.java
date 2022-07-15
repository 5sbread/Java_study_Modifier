package com.bh.main;

import com.bh.terran.Marine;

public class Main {

	public static void main(String[] args) {
	//  super(); 있는데 생략ㅓㅣㅁ
		Marine m1 = new Marine();
		m1.setHp(30);
		m1.info(); //완성된 메소드라서 사용가능
		m1.move(); //오버라이딩 해서 사용 가능
	}

}
