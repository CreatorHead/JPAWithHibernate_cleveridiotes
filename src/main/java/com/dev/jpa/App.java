package com.dev.jpa;

import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserServices services = new UserServicesImpl();
//        services.createProfile(user);
    }
}
