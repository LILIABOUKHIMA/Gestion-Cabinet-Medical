
package dbase;


import java.sql.*;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Bdd {   
    public static String url;
    
    public static String dbname="cabinet_medical_db";
    public static String user="root";//"root";
    public static String password="";//"";
    
    public static Connection con;
    public static void SetUrl(){
        url="jdbc:mysql://localhost/"+dbname+"?user="+user+"&password="+password;
    }
    public static void Setconnection()
    {
        try{
        SetUrl();
        con=DriverManager.getConnection(url);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    
    public static boolean Chekuserandpass(String user,String pass) throws ClassNotFoundException, SQLException
    {
        try
        {
            Setconnection();
            Statement stmt=con.createStatement();
            String check="select * from user where username='"+user+"' and password='"+pass+"'";
            ResultSet rs=stmt.executeQuery(check);
            while(rs.next())
            {
                con.close();
                return true;
            }
            
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
                con.close();

        return false;
    }
    public static boolean runNonQuery(String sqlstatement) throws ClassNotFoundException
    {
        try
        {
            System.out.println("dbase.Bdd.runNonQuery() : "+sqlstatement);
            
            Setconnection();
            Statement stmt=con.createStatement();
            
            stmt.execute(sqlstatement);
            
          
           con.close();
            return true;
            
        }
        catch(SQLException ex)
        {
        }
        return false;
    }
    public static void forgot(JTextField user,JTextField t1,JTextField t2) throws ClassNotFoundException
    {
        try
        {
            Setconnection();
            Statement stmt=con.createStatement();
            String select ="select * from acount where user='"+user.getText()+"'";
            ResultSet rs=stmt.executeQuery(select);
            if(rs.next()){
                t1.setText(rs.getString(2)+" "+rs.getString(3));
                t2.setText(rs.getString(7));
            }
            else
            {
                Tools.msgBox("Incorrect UserName");
                t1.setText("");
                t2.setText("");
                user.setText("");
                user.requestFocus();
            }
            con.close();
            
            
        }
        catch(SQLException ex)
        {
            Tools.msgBox(ex.getMessage());
                   
        }
        
    }
    public static void retrive(JTextField t1,JTextField t2,JTextField t3) throws ClassNotFoundException
    {
        try
        {
            Setconnection();
            Statement stmt=con.createStatement();
            String select="select * from acount where user='"+t1.getText()+"'";
            ResultSet rs=stmt.executeQuery(select);
            while(rs.next())
            {
               if( rs.getString(8).equals(t2.getText()))
               {
                   t3.setText(rs.getString(6));
               }
               else
               {
                   Tools.msgBox("Incorrect Answer !!");
                   t2.setText("");
                   t3.setText("");
                   t2.requestFocus();
               }
            }
            
            
        }
        catch(SQLException ex)
        {
            Tools.msgBox(ex.getMessage());
        }
        
    }
    public static void search(JTextField t1,JTextField t2,JTextField t3) throws ClassNotFoundException
    {
        try
        {
            int num=Integer.parseInt(t1.getText());
            Setconnection();
            Statement stmt=con.createStatement();
            String select="select * from book where bookid="+num;
            ResultSet rs=stmt.executeQuery(select);
            while(rs.next())
            {
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(4));
            }
            con.close(); 
        }
        catch(SQLException ex)
        {
            Tools.msgBox(ex.getMessage());
        }
        
    }
    
    public static String GetAutoNumber(String tablename,String columnname) throws ClassNotFoundException
    {
        try
        {
            Setconnection();
            Statement stmt=con.createStatement();
            String select="select max("+columnname+")+1 as autonumber  "
                    +" from "+tablename;
            ResultSet rs=stmt.executeQuery(select);
            String num="";
            while(rs.next())
            {
                num=rs.getString("autonumber");
            }
            con.close();
            if(num==null || "".equals(num))
            {
                return "1";
            }
            else
            {
                return num;
            } 
        }catch(SQLException ex)
        {
            Tools.msgBox(ex.getMessage());
           return "0";
        }
         
    }
    
    
    public static Object GetValeur(String requete) throws ClassNotFoundException
    {
        Object valeur=null;
        
        try
        {
            Setconnection();
            Statement stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery(requete);
            
            if(rs.next())
            {
                valeur=rs.getObject(1);
            }
            con.close();
        }catch(SQLException ex)
        {
            Tools.msgBox(ex.getMessage());
        }
         
        return valeur;
    }
    
    
    public static void fillCombo(String tablename,String columnname,JTextField t1,JComboBox combo) throws ClassNotFoundException
    {
        try{
            Setconnection();
            Statement stmt=con.createStatement();
            ResultSet rs;
            String strselect="select "+columnname+" from "+tablename
                    +" where studentid="+t1.getText();
            rs=stmt.executeQuery(strselect);
            rs.last();
            int c=rs.getRow();
            rs.beforeFirst();
            String values[]=new String[c];
            int i=0;
            while(rs.next())
            {
                values[i]=rs.getString(1);
                i++;  
            }
            con.close();
            combo.setModel(new DefaultComboBoxModel(values));
        }
        catch(SQLException ex)
        {
            Tools.msgBox(ex.getMessage());
        }
    }
    
    
    public static void fillToJtable(String tablename_or_selectstatement,JTable table) throws ClassNotFoundException{
        try
        {
            int nbr=table.getColumnCount();
            Setconnection();
            Statement stmt=con.createStatement();
            ResultSet rs;
            String strselect;
            if("select ".equals(tablename_or_selectstatement.substring(0, 7).toLowerCase())){
                strselect=tablename_or_selectstatement;
                
            }
            else{
                strselect="select * from "+tablename_or_selectstatement;
                
            }
            rs=stmt.executeQuery(strselect);
            ResultSetMetaData rsmd=rs.getMetaData();
            int c=rsmd.getColumnCount();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                Vector row=new Vector(nbr);
                for(int i=1;i<=nbr;i++)
                {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if(table.getColumnCount()!=c){
                Tools.msgBox("JTable Culomns Count Not Equal To Query Columns Count\nJTable Culomns :"+table.getColumnCount()+"\nQuery Columns :"+c);
            }
            con.close();
        }
        catch(SQLException ex)
        {
            Tools.msgBox(ex.getMessage());
        }
    }
    
    public static List<List<Object>> getData(String requete) {
        List<List<Object>> data = new Vector<List<Object>>();
        
        try
        { 
            Setconnection();
            Statement stmt=con.createStatement();
            ResultSet rs;
            
            rs=stmt.executeQuery(requete);
            
            ResultSetMetaData rsmd=rs.getMetaData();
            int nbColumns=rsmd.getColumnCount();
            
            while(rs.next()){
                Vector<Object> row=new Vector();
                
                for(int i=1;i<=nbColumns;i++){
                    row.add(rs.getObject(i));
                }
                
                data.add(row);
            }
            
            con.close();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("dbase.Bdd.getData() : "+data.size());
        return data;
    }
}
