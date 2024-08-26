import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // Vehicule Aerien 1  avec Type Vehicule Aerien
        VehiculeAerien vAerien1 = new VehiculeAerien("Boeing 720", "blanche", 5, 150, 250, "speciale pour le commerce","AVION");
        System.out.println(vAerien1.toString());
        System.out.println("");
        // Vehicule Aerien 2 avec Type Vehicule
        Vehicule vAerien2 = new VehiculeAerien();
        System.out.println(vAerien2.toString());
        System.out.println("");
        // Vehicule Terrestre 1 avec type Vehicule Terrestre
        VehiculeTerrestre vTerrestre1 = new VehiculeTerrestre();
        System.out.println(vTerrestre1.toString());
        System.out.println("");
        // Vehicule Terrestre 2 avec Type Vehicule
        Vehicule vTerrestre2 = new VehiculeTerrestre("vehicule ter", "noir", 2, 4, 245, "vehicule du terre");
        System.out.println(vTerrestre2);
        System.out.println("");

        // vehicule terre avec Moteur sans paramètre et type Vehicule terrestre
        VehiculeTerrestre vTM = new VehiculeMotor();
        System.out.println(vTM.toString());
        System.out.println("");

        // vehicule terre avec Moteur avec paramètre et  type Vehicule
        Vehicule vTM2 = new VehiculeMotor("Honda", "rouge"  , 2, 2, 100, "une moto puissant", "essence", 5, "18M 2343");
        System.out.println(vTM2.toString());
        System.out.println("");

        // vehicule terre avec moteur sans paramètre et spécifique
        VehiculeMotor  vTM3 =  new VehiculeMotor();
         System.out.println(vTM3.getButton());
         vTM3.allumer();
         vTM3.setButton(false);
         System.out.println(vTM3.getButton());
         vTM3.allumer();
         System.out.println("");

         //Vehicule terre sans moteur avec Type vehicule
         Vehicule velo1 = new VehiculeSansMotor(2);
         System.out.println(velo1.toString());
         System.out.println(velo1.description);

/* La partie des listes des vehicules 
Dans cette partie nous allons creer un objet de type VEHICULE MERE 
et une liste du même type pour  mettre tous types de vehicules à l'interieur
et faire toutes les opérations necessaires: 
 */        
Vehicule vehiculeMere = new Vehicule();
List<Vehicule> listesVehicules = new ArrayList<>();
vehiculeMere.ajouterVehicule(listesVehicules, vAerien1);
vehiculeMere.ajouterVehicule(listesVehicules, vAerien2);
vehiculeMere.ajouterVehicule(listesVehicules, vTerrestre1);
vehiculeMere.ajouterVehicule(listesVehicules, vTM);
vehiculeMere.ajouterVehicule(listesVehicules, vTM2);
vehiculeMere.ajouterVehicule(listesVehicules, vTM3);
vehiculeMere.ajouterVehicule(listesVehicules, velo1);

    System.out.println("SOMME TOTAL = "+vehiculeMere.sommeDesVehicules(listesVehicules));
    System.out.println(vehiculeMere.rechercheUnVehicule(listesVehicules, velo1));

    System.out.println("Affichage de tous les noms des vehicules");

    List<String> nomVehicules = vehiculeMere.getNomDesVehicules(listesVehicules);

    for (String nom : nomVehicules) {
        System.out.println(nom);
        
    }
/*
 * Dans cette partie nous allons utiliser l'objet du type Vehicule terrestre pour 
 * creer la liste des vehicules uniquement vehicules terrerestre
 * reste à savoir si vehicule terrestre ayant un Type vehicule pour s'ajouter dans la liste
 */

 List<Vehicule> listevehiculeTerrestres = new ArrayList<>();
vTerrestre1.ajouterVehicule(listevehiculeTerrestres, vTerrestre2);
vTerrestre1.ajouterVehicule(listevehiculeTerrestres, vTM);
vTerrestre1.ajouterVehicule(listevehiculeTerrestres, vTM2);
vTerrestre1.ajouterVehicule(listevehiculeTerrestres, vTM3);
vTerrestre1.ajouterVehicule(listevehiculeTerrestres, velo1);
vTerrestre1.ajouterVehicule(listevehiculeTerrestres, vAerien1);

for (Vehicule vehicule : listevehiculeTerrestres) {
    System.out.println(vehicule.description);
    
}

System.out.println("SOMME TOTAL TERRESTRE = "+vTerrestre1.sommeDesVehicules(listevehiculeTerrestres));

List<String> listeNomVehiculeAerien = new ArrayList<>();
List<String> listeNomVehiculeTerrestre = new ArrayList<>();
List<String> listeNomVehiculeMotor = new ArrayList<>();
List<String> listeNomVehiculeSansMotor = new  ArrayList<>();

for (int i = 0; i < listesVehicules.size(); i++) {
    String nomClasse = listesVehicules.get(i).getClass().getName();
    //System.out.println(nomClasse);
    
    switch (nomClasse) {
        case "VehiculeAerien":
        listeNomVehiculeAerien.add(nomClasse);
            break;
        case "VehiculeTerrestre":
        listeNomVehiculeTerrestre.add(nomClasse);
            break;
        case "VehiculeMotor":
        listeNomVehiculeTerrestre.add(nomClasse);
        listeNomVehiculeMotor.add(nomClasse);
        break;
        case "VehiculeSansMotor":
        listeNomVehiculeTerrestre.add(nomClasse);
        listeNomVehiculeSansMotor.add(nomClasse);
        break;
        default:
            System.out.println("pas liste");
            break;
    }
    
}
 System.out.println("");
 System.out.println("NOM DES CLASSES VEHICULEAERIENS");
 System.out.println("");
 for (String string : listeNomVehiculeAerien) {
    System.out.println(string);
 }

 System.out.println("NOM DES CLASSES VEHICULETERRESTRES");
 System.out.println("");
 for (String string : listeNomVehiculeTerrestre) {
    System.out.println(string);
    
 }
 System.out.println("NOM DES CLASSES VEHICULEMOTOR");
 System.out.println("");

 for (String string : listeNomVehiculeMotor) {
    System.out.println(string);
 }
 System.out.println("NOM DES CLASSES VEHICULESANSMOTOR");
 for (String string : listeNomVehiculeSansMotor) {
    System.out.println(string);
    
 }


 

    








    }
    
}
