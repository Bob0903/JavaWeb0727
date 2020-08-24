/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.model;

import com.bigdata.Sales;
import com.google.gson.Gson;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author User
 */
public class SalesModel {
    
    private static Sales[] saleses;
    static {
        //json file
        String path = "C:\\Users\\User\\Documents\\NetBeansProjects\\JavaWeb0727\\src\\main\\java\\com\\bigdata\\model\\csvjson.json";
        File file = new File(path);
        try {
            String json = new Scanner(file).useDelimiter("\\A").next();
             saleses = new Gson().fromJson(json, Sales[].class);
        }
        catch (Exception ex) {
            
        }
        
    }
    public static Sales[] getSaleses() {
        return saleses;
    }
    
    public static List<Sales> getSaleses(String countryName)
    {
       return Arrays.stream(saleses)
                .filter(s -> s.getCountry().contains(countryName))
                .collect(toList());
    }
    
    
}
