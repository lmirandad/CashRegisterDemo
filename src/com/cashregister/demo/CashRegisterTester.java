package com.cashregister.demo;

import java.io.IOException;

import com.sun.jna.Native;

public class CashRegisterTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CashRegisterController crc = new CashRegisterController();
		crc.TestConnectionPinPad();
		
		
	}

}
