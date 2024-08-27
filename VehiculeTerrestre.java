public abstract class VehiculeTerrestre extends Vehicule {

    public VehiculeTerrestre (String name,String color,int nbrRoue,int place,double price, String description){
        super(name, color, nbrRoue, place, price, description);
    }

    public VehiculeTerrestre(){
        super();
        description = "Uniquement les vehicules terrestres!";
    }
    
}
