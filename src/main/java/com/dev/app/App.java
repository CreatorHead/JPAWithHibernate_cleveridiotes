package com.dev.app;

import java.util.Scanner;

import com.dev.beans.User;
import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;

public class App {
	public static void main(String[] args) {
		User user = null;
		Scanner in = new Scanner(System.in);
		user = new User();
		
		user.setUserId(Integer.parseInt(in.nextLine()));
		user.setFirstName(in.nextLine());
		user.setLastName(in.nextLine());
		user.setPassword(in.nextLine());
		
		in.close();
		
		UserServices services = new UserServicesImpl();
		Boolean state = services.createProfile(user);
		if(state){
			System.out.println("Succesful in profile creation");
		}else{
			System.out.println("Failed in profile creation");
		}
	}
}
