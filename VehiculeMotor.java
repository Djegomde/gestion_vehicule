public abstract class VehiculeMotor  extends VehiculeTerrestre{

    protected String carburant;// Type Enum plutard
    protected int vitesse;
    protected String  numeroPlaque;
    protected double poids;
    protected String boiteVitesse;// Automatique ou manuelle

     

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
 

    public String getNumeroPlaq(){
        return this.numeroPlaque;
    }

    public void setNumeroPlaq(String numP){
        this.numeroPlaque  = numP;
    }

    

    public void deplacer(){
        int vitessEngage = getVitesse();
        if (vitessEngage > 0) {
            System.out.println("vehicule en deplacement!");
            
        }
    }

    
}
