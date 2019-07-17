package com.dev.app;

import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;

public class App {
	public static void main(String[] args) {
		UserServices services = 
					new UserServicesImpl();
		
		System.out.println(services.getUser(2));
		services.updatePassword(2, "toor");
		System.out.println(services.getUser(2));
		
	}
}
