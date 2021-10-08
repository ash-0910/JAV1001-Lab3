/*

Ashish Surti
Student ID - A00244471
Program - MAPD - JAV1001, Lab - 01

*/


public class DiceGame {
    public static void main(String[] args){

        //creating instances of the default dice 
        Die dice1 = new Die();
        //creating instances of the dice with one argument
        Die dice2 = new Die(30);
        //creating instances of the dice with 2 argument 
        Die dice3 = new Die(12 , "Skippy");

        System.out.println('\n'+"creating a default: " + dice1.getType());

        System.out.println("creating a "+ dice2.getType()+"..");

        System.out.println("creating a " + dice3.getType()+" Die (a special d"+dice3.getNumOfSides()+")..");

        //generating a random number for all the dices
        dice1.diceRamdomGenerator();
        dice2.diceRamdomGenerator();
        dice3.diceRamdomGenerator();

        //printing the current side up for all dices
        System.out.println("The current side up for "+ dice1.getType()+" is "+ dice1.getCurrentSideUp());

        System.out.println("The current side up for "+ dice2.getType()+" is "+ dice2.getCurrentSideUp());

        System.out.println("The current side up for "+ dice3.getType()+" is "+ dice3.getCurrentSideUp());

        System.out.println('\n'+"Testing The Roll method"+'\n');

        //again generating a random number for all the dice 
        dice1.diceRamdomGenerator();
        dice2.diceRamdomGenerator();
        dice3.diceRamdomGenerator();

        //again printing the random numbers generated for all dices 
        System.out.println("Rolling the "+ dice1.getType()+"...");
        System.out.println("The new value is "+ dice1.getCurrentSideUp());

        System.out.println("Rolling the "+ dice2.getType()+"...");

        System.out.println("The new value is "+ dice2.getCurrentSideUp());

        System.out.println("Rolling "+ dice3.getType()+"...");

        System.out.println("The new value is "+ dice3.getCurrentSideUp());

        System.out.println('\n'+"Setting the "+dice2.getType()+" to show " + dice2.getNumOfSides() + "...");

        //setting the current side up with the number of sides of the dice as that will be the highest
        dice2.setCurrentSideUp(dice2.getNumOfSides());

        //printing the current side up 
        System.out.println("The side up is now "+dice2.getCurrentSideUp()+ " . Finally. "+ '\n');

        
        System.out.println("Creating 5 d6...");

        // creating 5 d6 dices for yahtzee game 
        Die[] dices = new Die[5];
        
        //creating 5 instances of the default constructor as that is the d6 
        for(int i = 0; i < dices.length; i++){
            dices[i] = new Die();
        }


        boolean isallequal=false;
        int count = 0;

        //looping through each dice
        while(!isallequal){
            //generating a random number for each dice 
            dices[0].diceRamdomGenerator();
            dices[1].diceRamdomGenerator();
            dices[2].diceRamdomGenerator();
            dices[3].diceRamdomGenerator();
            dices[4].diceRamdomGenerator();
            //checking if all the current side up has the same number 
            if(dices[0].getCurrentSideUp() == dices[1].getCurrentSideUp() && dices[0].getCurrentSideUp() == dices[2].getCurrentSideUp() &&
            dices[0].getCurrentSideUp() == dices[3].getCurrentSideUp() && dices[0].getCurrentSideUp() == dices[4].getCurrentSideUp()){

                //if yes then print the number of times the dice was rolled 
                isallequal = true;
                System.out.println("YAHTZEE! It took "+count+ " rolls");

            }

            count++;

        }

        System.out.println('\n'+"************************Thank you for using the program************************");

    


    }
    
}
