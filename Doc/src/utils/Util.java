/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Random;

/**
 *
 * @author redouane
 */
public class Util {
    private static Random random = new Random();
    
    public static String randomNumber(){
        return randomNumber(5);
    }
    
    public static long getMaxNumber(int nbDegits){
        long nb = 9;
        
        while ((nb+"").length() < nbDegits){
            nb = Long.parseLong(nb+"9");
        }
        
        return nb;
    }
    
    public static String randomNumber(int nbDegits){
        long nb = random.nextInt( (int)getMaxNumber(nbDegits) );
        
        String str = nb+"";
        while (str.length() < nbDegits){
            str = "0"+str;
        }
        
        return str;
    }
}
