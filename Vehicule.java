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


 // Constucteur par defaut : initialise tous les attributs avec leur valeur par default
 // Nous pouvons également initialiser par nos propres valeurs en appelant le constructeur complet
 // Avec le mot clé this(...);
public Vehicule(){

}
// Constructeur spécifique : certains des attributs sont initialisés avec leur valeur par defaut
   public Vehicule(String name,String color,int nbrRoue,int place){
    this.name = name;
    this.color = color;
    this.nbrRoue = nbrRoue;
    this.place = place;
   }

   // Constructeur qui est complet : qui initialise tous les attributs de la classe
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
           "Nombre Roue "+getNbRoue()+"\n"+
           "Nombre de Places :"+getPlace()+"\n"+
           "Prix : "+getPrice()+"\n"+
           "Description : "+description;
   }

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


/*public static void main(String[] args) {
    Vehicule v1 = new Vehicule("vehicule 1", "color 1", 2, 4);
    System.out.println(v1.toString());

    Vehicule v2 = new Vehicule();
    System.out.println(v2.toString());

 
    Vehicule v3 = new Vehicule("Vehicule 3 ", "color3", 4, 23, 45, "Camion");
    System.out.println(v3.toString());

    Vehicule v4 = new Vehicule();
    System.out.println(v4.toString());
    Vehicule v5 = new Vehicule();

    Vehicule v6 = new Vehicule("Vehicule 6 ", "color3", 4, 23, 45, "Camion");


    List <Vehicule> listVehi = new ArrayList<>();
    listVehi.add(v1);
    listVehi.add(v2);
    listVehi.add(v3);
    listVehi.add(v4);
    listVehi.add(v6);
   

System.out.println(v1.sommeDesVehicules(listVehi));
v1.ajouterVehicule(listVehi,v5);
System.out.println(v1.rechercheUnVehicule(listVehi,v5));
//System.out.println(v1.getNomDesVehicules(listVehi));
List<String> listeNomsVehicules = v1.getNomDesVehicules(listVehi);

System.out.println("NOM DES VEHICULES");
for (String item : listeNomsVehicules) {
    System.out.println(item);
    
}
}*/








}
