public class VehiculeMotor  extends VehiculeTerrestre{
    private String carburant;// Type Enum plutard
    private int vitesse;
    private String  numeroPlaque;
    private boolean buttonAllumer;
     

    public VehiculeMotor(String name,
                        String color,
                        int nbrRoue,
                        int place,
                        double price, 
                        String description,
                        String carburant,
                        int vitesse,
                        String numeroPlaque
                        ){
super(name, color, nbrRoue, place, price, description);
this.carburant = carburant;
this.vitesse = vitesse;
this.numeroPlaque = numeroPlaque;

    }
public VehiculeMotor(){
    super();
    this.carburant = "Essence";
    this.vitesse = 4;
}
public String toString(){
    return "Nom : "+getNom()+"\n"+
            "Description : "+getDescription()+"\n"+
            "Carburant : "+ getCarburant()+"\n"+
            "Vitesse : "+ getVitesse();
}
    public String getCarburant(){
        return this.carburant;
    }

    public void setCarburant(String carbu){
        this.carburant = carbu;
    }

    public int getVitesse(){
        return this.vitesse;
    }

    public void setVitesse(int v){
        this.vitesse = v;

    }
    public boolean getButton(){
        return this.buttonAllumer;
    }
    public void setButton(boolean commande){
        this.buttonAllumer = commande;
    }

    public String getNumeroPlaq(){
        return this.numeroPlaque;
    }

    public void setNumeroPlaq(String numP){
        this.numeroPlaque  = numP;
    }

    public void allumer(){
        if (!getButton()) {
            System.out.println("vehicule alluuuumer");            
        }else{
            System.out.println("vehicule eteindre ");
        }
    }

    public void deplacer(){
        int vitessEngage = getVitesse();
        if (vitessEngage > 0) {
            System.out.println("vehicule en deplacement!");
            
        }
    }

    
}
