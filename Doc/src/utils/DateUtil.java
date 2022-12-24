/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author redouane
 */
public final class DateUtil {
    private DateUtil(){
    }
    
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    
    public static String getCurrentDateTime(){
        LocalDateTime now = LocalDateTime.now();
   
        return dtf.format(now);
    }
    
    public static String getDateOfThisDay(){
        return getCurrentDateTime().split(" ")[0];
    }
    
    public static String getTimeOfThisMoment(){
        return getCurrentDateTime().split(" ")[1];
    }
    
    public static int getYear(){
        return Integer.parseInt(getCurrentDateTime().split("-")[0]);
    }
    
    public static String getDateAsString(java.util.Date date){
        return formatter.format(date);
    }
    
    public static java.util.Date getDateFromDateTimeStr(String strDateTime){
        return getDateFromString( strDateTime.split(" ")[0] );
    }
    
    public static java.util.Date getDateFromString(String strDate){
        try {
            return formatter.parse(strDate);
        } catch (Exception e) {
        }
        
        return null;
    }
}
