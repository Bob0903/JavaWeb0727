/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author User
 */

@Path("/hello")

public class HelloService {
    @Path("hi")
    @GET
    @Produces("text/plain")
    public String sayHi()
    {
        return "Hi RestApp!";
    }
}
