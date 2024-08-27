public class VehiculeAerien extends Vehicule {
    private String type;

    public VehiculeAerien(String name,String color,int nbrRoue,int place,double price, String description,String type){
        super(name,color,nbrRoue,place,price,description);
        this.type = type;
    }

    public VehiculeAerien(){
        
    }
    

    public String getType(){
        return this.type;
    }

    public void setType(String typ){
        this.type = typ;
    }

    @Override
    public String toString(){
        return "Nom : "+getNom()+"\n"+
               "Prix : "+ getPrice()+"\n"+
               "Type :" +getType() +"\n"; 

    }


    
}
