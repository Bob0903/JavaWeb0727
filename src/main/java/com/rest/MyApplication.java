/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author User
 */



@ApplicationPath("/rest")
public class MyApplication extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        return super.getClasses(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
