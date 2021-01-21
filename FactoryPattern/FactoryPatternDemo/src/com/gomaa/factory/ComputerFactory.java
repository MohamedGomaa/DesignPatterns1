package com.gomaa.factory;

import com.gomaa.model.Computer;
import com.gomaa.model.PC;
import com.gomaa.model.Server;

public class ComputerFactory {
	
	public static Computer getComputer(String type,String ram,String hdd,String cpu) {
		
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram,hdd,cpu);
		
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram,hdd,cpu);
		
		return null;
	}
	
}
