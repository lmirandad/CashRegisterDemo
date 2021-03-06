package com.cashregister.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

import com.sun.jna.Native;



public class CashRegisterController {

	public SocketChannel SocketConnection() throws IOException{
		
		CashRegisterConstants crc = new CashRegisterConstants();
		SocketChannel sc = SocketChannel.open();
		sc.connect(new InetSocketAddress(crc.IP_HOST, crc.IP_PORT));
		//test socket connection
		System.out.println("Connection (true/false): " + sc.isConnected());
		return sc;
	}
	
	public void SocketDisconnection(SocketChannel socket_channel) throws IOException{
		socket_channel.close();
	}
	
	public void TestConnectionPinPad() throws IOException{
		//Open Socket Connection
		SocketChannel sc = SocketConnection();		
		
		PinpadDll pdll = (PinpadDll)Native.loadLibrary("CAJA_PINPAD", PinpadDll.class);
		System.out.println(pdll.fiOpenPort("DLL3500.ini"));
		
		//Close Socket Connection;
		SocketDisconnection(sc);
	}
	
	
		
}
