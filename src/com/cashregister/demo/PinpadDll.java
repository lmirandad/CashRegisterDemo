package com.cashregister.demo;

import com.sun.jna.Library;



public interface PinpadDll extends Library{

	int fiOpenPort(String ConfigFileName);

}
