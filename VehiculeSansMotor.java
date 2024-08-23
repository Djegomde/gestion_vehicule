public class VehiculeSansMotor  extends VehiculeTerrestre{

    private int nbrPedale;

    public VehiculeSansMotor(int nbrp){
        super();
        this.nbrPedale = nbrp;

    }

    public int getNbrPedale(){
        return this.nbrPedale;
    }

    public void setNbrPedale(int nbr){
        this.nbrPedale = nbr;
    }
    
    
}
