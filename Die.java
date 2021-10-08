/*

Ashish Surti
Student ID - A00244471
Program - MAPD - JAV1001, Lab - 01

*/

import java.util.Random;



public class Die{

    //declaring variables for the dice 
    private String type;
    private int numberOfSides;
    private int currentSideUp;


    //created a default constructor
    public Die(){

        type = "d6";
        numberOfSides = 6;
        diceRamdomGenerator();

    }

    //created a constructor with one argument 
    public Die(int nos){

        this.type = "d"+nos;
        this.numberOfSides = nos;
        diceRamdomGenerator();

    }

    //created a constructor with 2 arguments 
    public Die(int nos , String name){

        this.type = name ;
        this.numberOfSides = nos;
        diceRamdomGenerator();
    }

    //created a random number generator method
    public void diceRamdomGenerator(){
        Random r = new Random();

        currentSideUp = r.nextInt(numberOfSides)+1; 
    }

    //a method to get the type of the dice
    public String getType(){
        return type;
    }


    //a method to get the number of sides 
    public int  getNumOfSides(){
        return numberOfSides;
    }

    //a method to get the current side up of the dice
    public int getCurrentSideUp(){
        return currentSideUp;
    }

    //a method to set the current side up of the dice 
    public void setCurrentSideUp(int diceFace){
        this.currentSideUp = diceFace;
    }




}