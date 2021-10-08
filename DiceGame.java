/*

Ashish Surti
Student ID - A00244471
Program - MAPD - JAV1001, Lab - 01

*/


public class DiceGame {
    public static void main(String[] args){

        Die dice1 = new Die();
        Die dice2 = new Die(20);
        Die dice3 = new Die(12 , "Skippy");

        System.out.println('\n'+"creating a default: " + dice1.getType());

        System.out.println("creating a "+ dice2.getType()+"..");

        System.out.println("creating a " + dice3.getType()+" Die (a special d"+dice3.getNumOfSides()+")..");

        dice1.diceRamdomGenerator();
        dice2.diceRamdomGenerator();
        dice3.diceRamdomGenerator();

        System.out.println("The current side up for "+ dice1.getType()+" is "+ dice1.getCurrentSideUp());

        System.out.println("The current side up for "+ dice2.getType()+" is "+ dice2.getCurrentSideUp());

        System.out.println("The current side up for "+ dice3.getType()+" is "+ dice3.getCurrentSideUp());

        System.out.println('\n'+"Testing The Roll method"+'\n');

        dice1.diceRamdomGenerator();
        dice2.diceRamdomGenerator();
        dice3.diceRamdomGenerator();

        System.out.println("Rolling the "+ dice1.getType()+"...");
        System.out.println("The new value is "+ dice1.getCurrentSideUp());

        System.out.println("Rolling the "+ dice2.getType()+"...");

        System.out.println("The new value is "+ dice2.getCurrentSideUp());

        System.out.println("Rolling "+ dice3.getType()+"...");

        System.out.println("The new value is "+ dice3.getCurrentSideUp());

        System.out.println('\n'+"Setting the "+dice2.getType()+" to show " + dice2.getNumOfSides() + "...");

        dice2.setCurrentSideUp(dice2.getNumOfSides());

        System.out.println("The side up is now "+dice2.getCurrentSideUp()+ " . Finally. "+ '\n');

        System.out.println("Creating 5 d6...");

        Die[] dices = new Die[5];
        
        for(int i = 0; i < dices.length; i++){
            dices[i] = new Die();
        }

        boolean isallequal=false;
        int count = 0;

        while(!isallequal){
            dices[0].diceRamdomGenerator();
            dices[1].diceRamdomGenerator();
            dices[2].diceRamdomGenerator();
            dices[3].diceRamdomGenerator();
            dices[4].diceRamdomGenerator();
            if(dices[0].getCurrentSideUp() == dices[1].getCurrentSideUp() && dices[0].getCurrentSideUp() == dices[2].getCurrentSideUp() &&
            dices[0].getCurrentSideUp() == dices[3].getCurrentSideUp() && dices[0].getCurrentSideUp() == dices[4].getCurrentSideUp()){

                isallequal = true;
                System.out.println("YAHTZEE! It took "+count+ " rolls");

            }

            count++;

        }

    


    }
    
}
