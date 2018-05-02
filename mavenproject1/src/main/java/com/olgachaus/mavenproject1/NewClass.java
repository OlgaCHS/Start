/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olgachaus.mavenproject1;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.logging.Logger;



/**
 *
 * @author Администратор
 */
public class NewClass {
   private static final Logger log = Logger.getLogger(NewClass.class.getName());
   private static final Locale DEFAULT_LOCALE = Locale.getDefault();
        
    static public void main(String[] args) {
    
        String greeting;

        //ввод данных от пользователя
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the city name in English: ");
        String city = in.nextLine();
        System.out.println("Enter the time zone ID: ");
                
        // определение локали
        String locale = String.valueOf(Locale.getDefault());
        String mylocale = in.nextLine();
        
        //часовой пояс
        TimeZone timeZone = TimeZone.getTimeZone(mylocale);
        
        
        //определение времени суток
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int temp = calendar.get(Calendar.HOUR_OF_DAY);
        if (temp < 6) greeting = "night";
        else if (temp < 9) greeting = "morning";
        else if (temp < 19) greeting = "afternoon";
        else greeting = "evening";
        System.out.print("Good " + greeting + ", " + city + "!" + "\n");
    }
}
  

