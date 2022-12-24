/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import dbase.Bdd;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import utils.MD5;

/**
 *
 * @author DELL
 */
public class User {
    private int id = 0;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private String role;

    public User(int id, String nom, String prenom, String username, String password, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    
    public User(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    

    @Override
    public String toString() {
        return "user{" + "username=" + username + ", password=" + password + '}';
    }
    
    //Partie DAO
    private static final String TABLE_NAME = "user";
    
    public static User getById(int id){
        User user = null;
        
        List<User> list = rechercher("id = "+id+" LIMIT 1");
        if (list.size() == 1){
            user = list.get(0);
        }
        
        return user;
    }
    
    public static User getByUsername(String username){
        User user = null;
        
        List<User> list = rechercher("username like binary "+username+" LIMIT 1");
        if (list.size() == 1){
            user = list.get(0);
        }
        
        return user;
    }
    
    public boolean logIn() throws ClassNotFoundException, SQLException{
        return   Bdd.Chekuserandpass(username,  MD5.getMd5(password));
    }
    
    public static User logIn2(String username, String password){
        User user = null;
        
        List<User> list = rechercher(" username like binary '"+username+"'"
                +" AND password like binary '"+ MD5.getMd5(password) +"' LIMIT 1");
        
        if (list.size() == 1){
            user = list.get(0);
        }
        
        return user;
    }
    
    public boolean Ajouter() throws ClassNotFoundException {
        String requete="insert into "
                +TABLE_NAME+"(id, nom,prenom,username,password,role)"
                +"VALUES(NULL,'"+nom+"','"+prenom+"','"+username+"','"+password+"','"+role+"')";
       
        Bdd.runNonQuery(requete);
        
        Object valeur = Bdd.GetValeur("SELECT id FROM `"+TABLE_NAME+"` ORDER BY id DESC LIMIT 1");
        if (valeur != null){
            this.id = (Integer)valeur;
        }
        
        return true;
    }
     
    public boolean Supprimer() throws ClassNotFoundException {
         int rep = JOptionPane.showConfirmDialog (null,"Voullez-vous Supprimer ce Patients","Confirmation", JOptionPane.YES_NO_OPTION);
         String requete="delete from "+TABLE_NAME+" where id = '"+id+"'";
         
         if (rep == JOptionPane.OK_OPTION) {
            return  Bdd.runNonQuery(requete);
         }
         
         return false;
    }
     
    public boolean Modifier() throws ClassNotFoundException {
        String Req=("update "+TABLE_NAME+" set nom='"+nom+"', prenom='"+prenom+"', username='"+username+"', password='"+password+"' where id ='"+id+"'");
        return Bdd.runNonQuery(Req);
    }
    
    public static List<User> rechercher(){
        return rechercher("1");
    }
    
    public static List<User> rechercher(String condition){
        List<User> list = new Vector<>();
        
        String req = "select * from "+TABLE_NAME+" WHERE "+condition;
        List<List<Object>> data = Bdd.getData( req );
        for (List<Object> row : data){
            User user = new User();
            
            user.setId( (Integer)row.get(0) );
            user.setNom( (String)row.get(1) );
            user.setPrenom( (String)row.get(2) );
            user.setUsername( (String)row.get(3) );
            user.setPassword( (String)row.get(4) );
            user.setRole( (String)row.get(5) );
    
            list.add(user);
        }
        
        return list;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User){
            return this.id == ((User)obj).id;
        }
        
        return false;
    }
}
