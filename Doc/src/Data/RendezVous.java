/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import dbase.Bdd;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class RendezVous {
    //Mapping ORM : Object Relationnal Mapping
    private int id = 0;
    private String datePR;
    private String dateRD;
    private String observation;
    private int idPatient;
    private int idSecretaire;

    public RendezVous(int id, String datePR, String dateRD, String observation, int idPatient, int idSecretaire) {
        this.id = id;
        this.datePR = datePR;
        this.dateRD = dateRD;
        this.observation = observation;
        this.idPatient = idPatient;
        this.idSecretaire = idSecretaire;
    }
    
    public RendezVous() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatePR() {
        return datePR;
    }

    public void setDatePR(String datePR) {
        this.datePR = datePR;
    }

    public String getDateRD() {
        return dateRD;
    }

    public void setDateRD(String dateRD) {
        this.dateRD = dateRD;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public int getIdSecretaire() {
        return idSecretaire;
    }

    public void setIdSecretaire(int idSecretaire) {
        this.idSecretaire = idSecretaire;
    }
    
    //Partie DAO
    private static final String TABLE_NAME = "rendez_vous";
    
    public static RendezVous getById(int id){
        RendezVous rendezVous = null;
        
        List<RendezVous> list = rechercher("id = "+id+" LIMIT 1");
        if (list.size() == 1){
            rendezVous = list.get(0);
        }
        
        return rendezVous;
    }
    
    public boolean Ajouter() throws ClassNotFoundException {
        String requete = "INSERT INTO `"+TABLE_NAME
                +"` (`id`, `datePR`, `dateRD`, `observation`, `idPatient`, `idSecretaire`) VALUES "
                +"("+id+", '"+datePR+"', '"+dateRD+"', '"+observation+"', '"+idPatient+"', '"+idSecretaire+"');";
        
        Bdd.runNonQuery(requete);
        
        Object valeur = Bdd.GetValeur("SELECT id FROM `"+TABLE_NAME+"` ORDER BY id DESC LIMIT 1");
        if (valeur != null){
            this.id = (Integer)valeur;
        }
        
        return true;
    }
    
    public boolean Supprimer() throws ClassNotFoundException {
        String requete="delete from `"+TABLE_NAME+"` where id = '"+id+"' LIMIT 1";
        Bdd.runNonQuery(requete);
        
        return true;
    }
    
    public boolean Modifier() throws ClassNotFoundException {
        String Req=("update "+TABLE_NAME+" set datePR='"+datePR+"', dateRD='"+dateRD+"', observation='"+observation+"', idPatient='"+idPatient+"', idSecretaire='"+idSecretaire+"' where id ='"+id+"'");
        Bdd.runNonQuery(Req);
        
        return true;
    }
    
    public static List<RendezVous> rechercher(){
        return rechercher("1");
    }
    
    public static List<RendezVous> rechercher(String condition){
        List<RendezVous> list = new Vector<>();
        
        String req = "select * from "+TABLE_NAME+" WHERE "+condition;
        List<List<Object>> data = Bdd.getData( req );
        for (List<Object> row : data){
            RendezVous rendezVous = new RendezVous();
            
            rendezVous.setId( (Integer)row.get(0) );
            rendezVous.setDatePR( row.get(1).toString() );
            rendezVous.setDateRD( row.get(2).toString() );
            rendezVous.setObservation( (String)row.get(3) );
            rendezVous.setIdPatient( (Integer)row.get(4) );
            rendezVous.setIdSecretaire( (Integer)row.get(5) );
    
            list.add(rendezVous);
        }
        
        return list;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RendezVous){
            return this.id == ((RendezVous)obj).id;
        }
        
        return false;
    }
}
