import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);

        System.out.println ("1 - coin flip ;");
        System.out.println ("2 - dice roll ;");
        System.out.print ("input number : ");
        int flipOrRoll = userInput.nextInt();
        switch (flipOrRoll) {
            case 1 :
                System.out.print ("How many coins would you like to flip : ");
                int coinRollAmount = userInput.nextInt();
                for (int i = 0 ; i < coinRollAmount ; i++) {
                    switch (rand.nextInt(2)) {
                        case 0 -> System.out.println("Heads");
                        case 1 -> System.out.println("Tails");
                    }
                }
            case 2 :
                int diceTag = 1;
                System.out.print ("How many faces would you like your dice to have : ");
                int diceFaceAmount = userInput.nextInt();
                System.out.print ("How many dices you would like to roll :");
                int diceRollAmount = userInput.nextInt();
                for (int j = 0 ; j < diceRollAmount ; j++) {
                    System.out.println ("Dice " + diceTag + " : Rolled " + rand.nextInt(diceFaceAmount));
                    diceTag++;
                }
            default :
                System.out.println ("Invalid Option");
        }
    }
}