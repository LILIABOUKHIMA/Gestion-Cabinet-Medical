/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import dbase.Tools;
import dbase.Bdd;
import static dbase.Bdd.runNonQuery;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Patient {
     private int id = 0;
     private String nom;
     private String prenom;
     private String adresse;
     private int age;
     private String tel;
     private String GS;
     private int poids;
     private int taill;

    public Patient( String nom, String prenom,String adresse, int age, String tel, String GS, int poids, int taill) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.tel = tel;
        this.GS = GS;
        this.adresse=adresse;
        this.poids = poids;
        this.taill = taill;
    }

    public Patient() {
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getDate_Ne() {
        return age;
    }

    public void setDate_Ne(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTaill() {
        return taill;
    }

    public void setTaill(int taill) {
        this.taill = taill;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
            
             
    
   //Partie DAO
    private static final String TABLE_NAME = "patient";
    
    public static Patient getById(int id){
        Patient patient = null;
        
        List<Patient> list = rechercher("id = "+id+" LIMIT 1");
        if (list.size() == 1){
            patient = list.get(0);
        }
        
        return patient;
    }
    
    public boolean Ajouter() throws ClassNotFoundException {
        String requete="insert into "+TABLE_NAME+"(nom,prenom,adresse,age,tel,gs,taill,poids)VALUES('"+nom+"','"+prenom+"','"+adresse+"','"+age+"','"+tel+"','"+GS+"','"+taill+"','"+poids+"')";
       
        Bdd.runNonQuery(requete);
        
        Object valeur = Bdd.GetValeur("SELECT id FROM `"+TABLE_NAME+"` ORDER BY id DESC LIMIT 1");
        if (valeur != null){
            this.id = (Integer)valeur;
        }
        
        return true;
    }
     
    public boolean Supprimer() throws ClassNotFoundException {
         int rep = JOptionPane.showConfirmDialog (null,"Veillez Supprimer ce Patients","Confirmation", JOptionPane.YES_NO_OPTION);
         String requete="delete from "+TABLE_NAME+" where id = '"+id+"'";
         if (rep == JOptionPane.OK_OPTION) {
            return  Bdd.runNonQuery(requete);
         }
         return false;
    }
     
    public boolean Modifier() throws ClassNotFoundException {
        int rep = JOptionPane.showConfirmDialog (null,"confirmer la modification","modification", JOptionPane.YES_NO_OPTION);
        
        if ( rep == JOptionPane.OK_OPTION) {
            String Req=("update "+TABLE_NAME+" set nom='"+nom+"',prenom='"+prenom+"',adresse='"+adresse+"',age='"+age+"',tel='"+tel+"',gs='"+GS+"',taill='"+taill+"',poids='"+poids+"' where id ='"+id+"'");
            return Bdd.runNonQuery(Req);
        }
        return false;
    }
    
    public static Patient rechercher(String nom, String prenom){
        Patient patient = null;
        
        List<Patient> list = rechercher("nom='"+nom+"' AND prenom='"+prenom+"' limit 1");
        if (list.size() == 1){
            patient = list.get(0);
        }
        
        
        return patient;
    }
    
    public static List<Patient> rechercher(){
        return rechercher("1");
    }
    
    public static List<Patient> rechercher(String condition){
        List<Patient> list = new Vector<>();
        
        String req = "select * from "+TABLE_NAME+" WHERE "+condition;
        List<List<Object>> data = Bdd.getData( req );
        for (List<Object> row : data){
            Patient patient = new Patient();
            
            patient.setId( (Integer)row.get(0) );
            patient.setNom( (String)row.get(1) );
            patient.setPrenom( (String)row.get(2) );
            patient.setAdresse( (String)row.get(3) );
            patient.setAge( (Integer)row.get(4) );
            patient.setGS((String)row.get(5) );
            patient.setTel((String)row.get(6) );
            patient.setTaill((Integer)row.get(7) );
            patient.setPoids((Integer)row.get(8) );
            
            list.add(patient);
        }
        
        return list;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Patient){
            return this.id == ((Patient)obj).id;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.getNom().toUpperCase()+" "+this.getPrenom();
    }
    
    
}