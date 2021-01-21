package com.gomaa.test;

import com.gomaa.factory.ComputerFactory;
import com.gomaa.model.Computer;

public class TestFactory {

		public static void main(String[] args) { 
			Computer pc = ComputerFactory.getComputer("PC", "2 Gb", "500 Gb", "2.4 GHz");
			Computer server = ComputerFactory.getComputer("Server","16 GB","1 TB","2.9 GHz");
			
			System.out.println("Factory PC Config::"+pc);
			System.out.println("Factory Server Config::"+server);

	}

}
