/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbase;


import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Tools extends JOptionPane{

    
    public static void fontMsgBox()
    {
           UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Garamond", Font.BOLD, 18)));       
          //JOptionPane.showMessageDialog(null,"MESSAGE","ERROR",JOptionPane.WARNING_MESSAGE); 
         
    }
    public static void msgBox(String message){
        JOptionPane.showMessageDialog(null, message);
        
    }
    public static boolean cinfirmmsg(String msg){
      int msgc=JOptionPane.showConfirmDialog(null, msg);
      if(msgc==JOptionPane.YES_OPTION){
          return true;
      }
      else
      {
          return false;
      }
    }
    
    
    
    
    public static void CreateFolder(String folderName, String path){
        File f = new File(path + "/" + folderName);
        f.mkdir();
    }
    
    public static void CreateFolder(String folderName){
        File f = new File(folderName);
        f.mkdir();     
    }
    
    public static void openForm(JFrame form){            
        form.setLocationRelativeTo(null);
        //  Image img = ImageIO.read(Tools.class.getResource("emp.png"));
        //  form.setIconImage(img);
        form.setDefaultCloseOperation(2);
        //form.getContentPane().setBackground(Color.white);
        form.setResizable(false);
       // form.setTitle("Welcome To Library Managment System");
        form.setVisible(true);
    }
    
    public static void clearText(Container form){
        for(Component c : form.getComponents()){
            if(c instanceof JTextField){
                JTextField txt = (JTextField)c;
                txt.setText("");
            }
            else if(c instanceof Container){
                clearText((Container)c);
            }
        }
    }
    
    public static void createEmptyFile(String fileName){
        try {
            File f = new File(fileName + ".txt");
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void createEmptyFiles(String fileNames[]){
        for(String str : fileNames){
            createEmptyFile(str);
        }
    }
    
    public static void createFile(String fileName, Object data[]){
        try {
            PrintWriter p = new PrintWriter(fileName);
            for(Object obj : data){
                p.println(obj);
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    public static Object InputBox(String title){
        Object myObj = JOptionPane.showInputDialog(title);
        return myObj;
    }
    
    public static String getNumber(String text){
        String val = "";
        for(char c : text.toCharArray()){
            if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'){
                val += c;
            }            
        }
        return val;
    }
    
    public static int getNumberToInteger(String text){
        String val = "";
        for(char c : text.toCharArray()){
            if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'){
                val += c;
            }            
        }
        return Integer.parseInt(val);
    }
    
    
    public static String removeNumber(String text){
        String val = "";
        for(char c : text.toCharArray()){
            if(  !(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')  ){
                val += c;
            }            
        }
        return val;
    }
    public class StringTools{

    String text;
    private String inverseText;
    String texts[];
    String textArray;
    
    public StringTools(String text){
        this.text = text;
    }
    
    public StringTools(String texts[]){
        this.texts = texts;
        textArray = "";
    }
    
    public void printCharByChar(){
        for(char c : text.toCharArray()){
            System.out.println(c);
        }
    }
    
    public void printCharByCharInverse(){
        StringBuilder sb = new StringBuilder(text);
        inverseText = sb.reverse().toString();
        for(char c : inverseText.toCharArray()){
            System.out.println(c);
        }
    }
    
    public void printStringArray(){
        for(String s : texts){
            System.out.println(s);
        }
    }
    
    public String getStringArrayElement(){
        for(String s : texts){
            textArray += s + " ; ";
        }
        return textArray;
    }
    
}
    


public class Table{
    public int columns;
    public Object[][] Items;
    
    public Table(int columns){
        this.columns = columns;
        Items = new Object[0][columns];
    }
    
    public void addNewRow(Object row[]){
        //الاحتفاظ بالعناصر القديمة داخل متغير مؤقت
        Object TempItems[][] = Items;
        //زيادة المتغير الاساسي بعنصر اضافي
        Items = new Object[Items.length + 1][columns];
        //تعبئة العناصر القديمة في العنصر الاساسي
        for(int x = 0; x < TempItems.length ; x++){
            Items[x] = TempItems[x];
        }
        //اضافة الصف الجديد للعنصر الاساسي
        Items[Items.length - 1] = row;
    }
    
    public void printItems(){
        for(Object objs[] : Items){
            for(Object obj : objs){
                System.out.print(obj + " ; ");
            }
            System.out.println();
        }
    }
    
    public void editRow(int rowIndex, int columnIndex, Object newData){
        Items[rowIndex][columnIndex] = newData;
    }
    
    public void deleteRow(int rowIndex){
        Object TempItems[][] = Items;
        Items = new Object[Items.length - 1][columns];
        int y = 0;
        for(int x = 0 ; x < TempItems.length ; x++){            
            if(x != rowIndex){
                Items[y] = TempItems[x];
                y++;
            }
        }
    }
    
    public Object getValue(int rowIndex, int columnIndex){
        return Items[rowIndex][columnIndex];
    }

    public Object[] getRow(int rowIndex){
        return Items[rowIndex];
    }
    
}
public class MergeArray{

    public Object[] array1;
    public Object[] array2;
    
    public MergeArray(Object[] array1, Object[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }
    
    public Object[] mergeTwoArrays(){
        int a1 = array1.length;
        int a2 = array2.length;
        Object[] arrayR = new Object[a1 + a2];
        System.arraycopy(array1, 0, arrayR, 0, a1);
        System.arraycopy(array2, 0, arrayR, a1, a2);
        return arrayR;
    }
    
}
    public static void setreport(JTable table){
        table.getTableHeader().setBackground(new Color(0,0,100));
       table.getTableHeader().setForeground(Color.white);
    }
    public static void printreport(JTable table,String title){
         try{
           MessageFormat header=new MessageFormat(title);
           MessageFormat footer=new MessageFormat("Page - {0}");
           table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
          }
       catch(Exception ex)
          {
           Tools.msgBox(ex.getMessage());
           }
    }
    
    
}
