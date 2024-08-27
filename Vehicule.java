import java.util.ArrayList;
import java.util.List;
import enums.*;

public abstract class Vehicule  {
    protected String name;
    protected String color;
    protected double price;
    protected EtatVehicule etatVehicule;
     protected String description;

 // Constucteur par defaut : initialise tous les attributs avec leur valeur par default
 // Nous pouvons également initialiser par nos propres valeurs en appelant le constructeur complet
 // Avec le mot clé this(...);
public Vehicule(){

}
// Constructeur spécifique : certains des attributs sont initialisés avec leur valeur par defaut
   public Vehicule(String name,String color){
    this.name = name;
    this.color = color;

   }

   // Constructeur qui est complet : qui initialise tous les attributs de la classe
   public Vehicule(String name,String color,int place,double price, String description){
    this.name = name;
    this.color = color;
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




   public double getPrice(){
    return this.price;
   }

   public void setPrice(double prix){
    if (prix >0) {
        this.price = prix;
        
    }
   }
   public String getDescription(){
    return this.description;
   }

   public void setDescription(String desc){
    this.description = desc;
   }

   public String toString(){
    return "Nom : "+getNom()+"\n"+
           "Couleur : "+getColor()+"\n"+
           "Prix : "+getPrice()+"\n"+
           "Description : "+getDescription();
   }
//Permet de donner la dimension d'un vehicule(Longueur, Largeur, Hauteur)
   public abstract int dimension();

   public void ajouterVehicule(List<Vehicule> listeVehicule,Vehicule v){
    listeVehicule.add(v);   
   }

   // fonction qui retourne uniquement les noms des vehicules dans un tableau de type String
   public List<String> getNomDesVehicules(List<Vehicule> listeVehicule){
    List<String> nomsVehicules = new ArrayList<>();
    for(Vehicule unVehicule:listeVehicule){
        String nomVehicule = unVehicule.getNom();
        nomsVehicules.add(nomVehicule);
    }
    return nomsVehicules;
   }

   // fonction qui retourne la somme total de tous les vehicule d'une liste donnée.
   public double sommeDesVehicules(List<Vehicule> listeVehicule){
    double somme = 0.0;
    for(int i=0; i<listeVehicule.size();i++){
        if (!listeVehicule.isEmpty()) {
         somme = somme + listeVehicule.get(i).getPrice();
          
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
