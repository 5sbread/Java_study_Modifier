package com.bh.main;

import com.bh.himart.Client;
import com.bh.himart.Computer;
import com.bh.himart.Phone;
import com.bh.himart.Tv;

public class Main {

	public static void main(String[] args) {
	
		Computer computer = new Computer();
		Tv tv = new Tv();
		Phone phone = new Phone();
		
		computer.info();
		tv.info();
		phone.info();
		
		
		Client client = new Client();
		client.buy(computer);
		
		
		
	}

}
