package Data;

import dbase.Bdd;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class LigneOrdonannce {
    //Mapping ORM : Object Relationnal Mapping
    private int id = 0;
    private int idConsultation;
    private String medicament;
    private int qte;
    private int nbPriseJour;
    private int nbJours;
    private String observation;

    public LigneOrdonannce(int id, int idConsultation, String medicament, int qte, int nbPriseJour, int nbJours, String observation) {
        this.id = id;
        this.idConsultation = idConsultation;
        this.medicament = medicament;
        this.qte = qte;
        this.nbPriseJour = nbPriseJour;
        this.nbJours = nbJours;
        this.observation = observation;
    }
    
    public LigneOrdonannce(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getNbPriseJour() {
        return nbPriseJour;
    }

    public void setNbPriseJour(int nbPriseJour) {
        this.nbPriseJour = nbPriseJour;
    }

    public int getNbJours() {
        return nbJours;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    //*******************************
    //Partie DAO
    private static final String TABLE_NAME = "ligne_ordonnance";
    
    public static LigneOrdonannce getById(int id){
        LigneOrdonannce ligneOrdonance = null;
        
        List<LigneOrdonannce> list = rechercher("id = "+id+" LIMIT 1");
        if (list.size() == 1){
            ligneOrdonance = list.get(0);
        }
        
        return ligneOrdonance;
    }
    
    public boolean Ajouter() throws ClassNotFoundException {
        String requete = "INSERT INTO `"+TABLE_NAME
                +"` (`id`, `idConsultation`, `medicament`, `qte`, `nbre_prise_jour`, `nb_jours`, `observation`) VALUES "
                +"("+id+", '"+idConsultation+"', '"+medicament+"', '"+qte+"', '"+nbPriseJour+"', '"+nbJours+"', '"+observation+"');";
        
        Bdd.runNonQuery(requete);
        
        Object valeur = Bdd.GetValeur("SELECT id FROM `"+TABLE_NAME+"` ORDER BY id DESC LIMIT 1");
        if (valeur != null){
            this.id = (Integer)valeur;
        }
        
        return true;
    }
    
    public boolean Supprimer() throws ClassNotFoundException {
        String requete="delete from `"+TABLE_NAME+"` where id = '"+id+"' LIMIT 1";
        if (JOptionPane.showConfirmDialog (null,"Veillez Supprimer cette ligne d'ordonnance","Confirmation",
            JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
               
            return  Bdd.runNonQuery(requete); 
        }
           
        return false;
    }
    
    public boolean Modifier() throws ClassNotFoundException {
        int rep = JOptionPane.showConfirmDialog (null,"confirmer la modification","modification", JOptionPane.YES_NO_OPTION);
        
        if ( rep == JOptionPane.OK_OPTION) {
            String Req=("update "+TABLE_NAME+" set idConsultation='"+idConsultation+"', medicament='"+medicament+"', qte='"+qte+"', nbre_prise_jour='"+nbPriseJour+"', nb_jours='"+nbJours+"', observation='"+observation+"' where id ='"+id+"'");
            return Bdd.runNonQuery(Req);
        }
        
        return false;
    }
    
    public static List<LigneOrdonannce> rechercher(){
        return rechercher("1");
    }
    
    public static List<LigneOrdonannce> rechercher(String condition){
        List<LigneOrdonannce> list = new Vector<>();
        
        String req = "select * from "+TABLE_NAME+" WHERE "+condition;
        List<List<Object>> data = Bdd.getData( req );
        for (List<Object> row : data){
            LigneOrdonannce ligneOrdonance = new LigneOrdonannce();
            
            ligneOrdonance.setId( (Integer)row.get(0) );
            ligneOrdonance.setIdConsultation((Integer)row.get(1) );
            ligneOrdonance.setMedicament( (String)row.get(2) );
            ligneOrdonance.setQte((Integer)row.get(3) );
            ligneOrdonance.setNbPriseJour((Integer)row.get(4) );
            ligneOrdonance.setNbJours((Integer)row.get(5) );
            ligneOrdonance.setObservation((String)row.get(6) );
            
            list.add(ligneOrdonance);
        }
        
        return list;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LigneOrdonannce){
            return this.id == ((LigneOrdonannce)obj).id;
        }
        
        return false;
    }
}
