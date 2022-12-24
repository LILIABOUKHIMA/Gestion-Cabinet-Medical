package Data;

import dbase.Bdd;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Consultation {
    //Mapping ORM : Object Relationnal Mapping
    private int id = 0;
    private String numConsultation;
    private int idMedecin;
    private int idPatient;
    private String date;
    private int dureeConsultation;
    private String observation;
    
    public Consultation(int id, String numConsultation, int idMedecin, int idPatient, String date, int dureeConsultation, String observation) {
        this.id = id;
        this.numConsultation = numConsultation;
        this.idMedecin = idMedecin;
        this.idPatient = idPatient;
        this.date = date;
        this.dureeConsultation = dureeConsultation;
        this.observation = observation;
    }

    public Consultation(){        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumConsultation() {
        return numConsultation;
    }

    public void setNumConsultation(String numConsultation) {
        this.numConsultation = numConsultation;
    }

    public int getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(int idMedecin) {
        this.idMedecin = idMedecin;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDureeConsultation() {
        return dureeConsultation;
    }

    public void setDureeConsultation(int dureeConsultation) {
        this.dureeConsultation = dureeConsultation;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    
    //Partie DAO
    private static final String TABLE_NAME = "consultation";
    
     public static Consultation getById(int id){
        Consultation consultation = null;
        
        List<Consultation> list = rechercher("id = "+id+" LIMIT 1");
        if (list.size() == 1){
            consultation = list.get(0);
        }
        
        return consultation;
    }
    
    public boolean Ajouter() throws ClassNotFoundException {
        String requete = "INSERT INTO `"+TABLE_NAME
                +"` (`id`, `numConsultation`, `idMedecin`, `idPatient`, `date`, `dureeConsultation`, `observation`) VALUES "
                +"("+id+", '"+numConsultation+"', '"+idMedecin+"', '"+idPatient+"', '"+date+"', '"+dureeConsultation+"', '"+observation+"');";
        
        Bdd.runNonQuery(requete);
        
        Object valeur = Bdd.GetValeur("SELECT id FROM `"+TABLE_NAME+"` ORDER BY id DESC LIMIT 1");
        if (valeur != null){
            this.id = (Integer)valeur;
        }
        
        return true;
    }
    
    public boolean Supprimer() throws ClassNotFoundException {
        String requete="delete from `"+TABLE_NAME+"` where id = '"+id+"' LIMIT 1";
        return  Bdd.runNonQuery(requete);
    }
    
    public boolean Modifier() throws ClassNotFoundException {
        String Req=("update "+TABLE_NAME+" set numConsultation='"+numConsultation+"', idMedecin='"+idMedecin+"', idPatient='"+idPatient+"', date='"+date+"', dureeConsultation='"+dureeConsultation+"', observation='"+observation+"'  where id ='"+id+"'");
        return Bdd.runNonQuery(Req);
    }
    
    public static List<Consultation> rechercher(){
        return rechercher("1");
    }
    
    public static List<Consultation> rechercher(String condition){
        List<Consultation> list = new Vector<>();
        
        String req = "select * from "+TABLE_NAME+" WHERE "+condition;
        List<List<Object>> data = Bdd.getData( req );
        
        System.out.println("Data.Consultation.rechercher() SQL : "+req);
        System.out.println("Data.Consultation.rechercher() : "+data);
        
        for (List<Object> row : data){
            Consultation consultation = new Consultation();
            
            consultation.setId( (Integer)row.get(0) );
            consultation.setNumConsultation( (String)row.get(1) );
            consultation.setIdMedecin((Integer)row.get(2) );
            consultation.setIdPatient((Integer)row.get(3) );
            consultation.setDate( row.get(4).toString() );
            consultation.setDureeConsultation((Integer)row.get(5) );
            consultation.setObservation((String)row.get(6) );
            
            list.add(consultation);
        }
        
        return list;
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Consultation){
            return this.id == ((Consultation)obj).id;
        }
        
        return false;
    }
    
    public static boolean existNumConsultation(String numConsultation){
        Object valeur = null;
        
        try {
            valeur = dbase.Bdd.GetValeur("SELECT id FROM `"+TABLE_NAME+"` WHERE numConsultation = '"+numConsultation+"' LIMIT 1");
        } catch (Exception e) {
        }
        
        return valeur != null;
    }
    
    public static String generateNumConsultation(){
        String numConsultation = "";
        
        int year = utils.DateUtil.getYear();
        
        do{
            numConsultation = year+"/"+utils.Util.randomNumber(5);
            if ( ! existNumConsultation(numConsultation) ){
                break;
            }
        }
        while (true);
        
        return numConsultation;
    }
}
