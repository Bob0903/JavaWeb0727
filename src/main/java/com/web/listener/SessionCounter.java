/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author User
 */


@WebListener()
public class SessionCounter implements HttpSessionListener{

    private static int count;
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ++count;
        System.out.println("目前連線數量" + count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        --count;
        System.out.println("目前連線數量" + count);
    }
    
    
    
    
}
