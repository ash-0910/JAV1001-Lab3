import java.util.Random;

public class Die{

    private String type;
    private int numberOfSides;
    private int currentSideUp;

    public Die(){

        type = "d6";
        numberOfSides = 6;
        diceRamdomGenerator();

    }

    public Die(int nos){

        this.type = "d"+nos;
        this.numberOfSides = nos;
        diceRamdomGenerator();

    }

    public Die(int nos , String name){

        this.type = name ;
        this.numberOfSides = nos;
        diceRamdomGenerator();
    }

    public void diceRamdomGenerator(){
        Random r = new Random();

        currentSideUp = r.nextInt(numberOfSides)+1;
    }

    public String getType(){
        return type;
    }

    // public void setType(String newType){
    //     this.type = newType;
    // }

    public int  getNumOfSides(){
        return numberOfSides;
    }

    // public void setNumOFSides(int newNOS){
    //     this.numberOfSides = newNOS;
    // }

    public int getCurrentSideUp(){
        return currentSideUp;
    }

    public void setCurrentSideUp(int diceFace){
        this.currentSideUp = diceFace;
    }




}