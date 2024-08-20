import java.util.ArrayList;
import java.util.List;

public class Vehicule {
    protected String name;
    protected String color;
   // protected String mark; dans vehicule terreste
   protected int nbrRoue;
   protected int place;
   protected double price;
   protected String description;
 List<Vehicule> listeVehicule = new ArrayList<>();

   public Vehicule(String name,String color,int nbrRoue,int place){
    this.name = name;
    this.color = color;
    this.nbrRoue = nbrRoue;
    this.place = place;
   }

   public Vehicule(String name,String color,int nbrRoue,int place,double price, String description){
    this.name = name;
    this.color = color;
    this.nbrRoue = nbrRoue;
    this.place = place;
    this.price = price;
    this.description = description;

   }

   
   public String getNom(){
    return this.name;
   }

   public void setNom(String nom){
    this.name = nom;

   }

   public String getColor(){
    return this.color;
   }

   public void setColor(String color){
    this.color = color;

   }

   public int getNbRoue(){
    return this.nbrRoue;
   }

   public void setNbRoue(int nb){
    if (nb>0) {
        this.nbrRoue = 0;
        
    }
   }

   public int getPlace(){
    return this.place;
   }

   public void setPlace(int pl){
    if (pl > 0) {
    this.place = pl;      
    }

   }

   public String toString(){
    return "Nom : "+getNom()+"\n"+
           "Couleur : "+getColor()+"\n"+
           "Nombre Roue "+getNbRoue()+"\n"+
           "Nombre de Places :"+getPlace()+"\n"+
           "Prix : "+"\n"+
           "Description : "+description;
   }

   public void ajouterVehicule(Vehicule v){
    listeVehicule.add(v);   
   }

   // fonction qui retourne uniquement les noms des vehicules dans un tableau de type String
   public String [] getNomDesVehicules(List<Vehicule> listv){
     String [] tabNom = new String[0];
    for(int i = 0; i<listv.size();i++){
        Vehicule unVehicule = listv.get(i);
        String nomVehicule = unVehicule.getNom();
        tabNom[i] = nomVehicule;
    }
    return tabNom;
   }

   // fonction qui retourne la somme total de tous les vehicule d'une liste donnée.
   public double sommeDesVehicules(List<Vehicule> listv){
    double somme = 0.0;
    for(int i=0; i<listv.size();i++){
        if (listv.isEmpty()) {
            System.out.println("La liste des vehicules est VIDE!");
            somme +=0; 
        } else {
            Vehicule unVehicule = listv.get(i);
            somme+= unVehicule.price;
        }

    }
    return somme;
   }

   //fonction qui permet de rechercher un vehicule donnée dans une liste donnée
   public Boolean rechercheUnVehicule(List<Vehicule> listv, Vehicule v){
    int i=0;
    while (i<listv.size() && !listv.get(i).equals(v)) {
        i++; 
    }
    return  i<listv.size();

   }
   // fonction qui permet de retirer un Vehicule  de la liste donnée
  /* public void supprimerUnVehicule(List<Vehicule> listv, Vehicule v){
       for(int i=0;i<listv.size();i++){
        if (listv.get(i)==v) {
            listv.remove(i);
        }
       
       }

       public void supprimerUnVehicule(List<Vehicule> listv, Vehicule v) {
    Iterator<Vehicule> iterator = listv.iterator();
    while (iterator.hasNext()) {
        if (iterator.next().equals(v)) {
            iterator.remove();
            break; // On peut sortir de la boucle dès que l'élément est trouvé
        }
    }
}

   }*/ 











}
