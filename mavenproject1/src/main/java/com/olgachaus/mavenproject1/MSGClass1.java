/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olgachaus.mavenproject1;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Администратор
 */
public class MSGClass1 {
   private Locale current;
    private ResourceBundle rl;
        
    
    public String viewString(String str) {
        
        rl = ResourceBundle.getBundle("resources.msg");
        String sv = rl.getString(str);
        try {
            return new String(sv.getBytes(java.util.ResourceBundle.getBundle("msg_ru_RU").getString("ISO-8859-1")), java.util.ResourceBundle.getBundle("msg_ru_RU").getString("UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            return java.util.ResourceBundle.getBundle("msg_ru_RU").getString("ERROR");
        }
   }
}
 
