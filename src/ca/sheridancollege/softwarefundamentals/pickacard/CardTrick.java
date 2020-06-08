/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        int decider = 0;
        Card[] magicHand = new Card[7];
        String[] wholeMagicHand = new String[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            //card c = new card();
            magicHand[i] = new Card();
            magicHand[i].setValue((int)(Math.random()*13+1));
            //System.out.print(magicHand[i].getValue());
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random()*4)]);
            //System.out.println(magicHand[i].getSuit());
     //converting whole magicHand into String

      wholeMagicHand[i] = String.valueOf(magicHand[i].getValue())+magicHand[i].getSuit();


        }
     Scanner input = new Scanner(System.in);
    System.out.print("Enter the Value and type of the card example, 5Hearts: ");
     String user = input.nextLine();

//Comparing the card in magicHannd
for(int i = 0 ; i<magicHand.length ; ++i){
 

 if(wholeMagicHand[i].equals(user)){
   decider = 1;
break;

}
}
if(decider == 1 ){
 System.out.println("Found,The card you chose is in the magic hand");
}else{

 System.out.println("Not Found!,the card you chose is not in the magic hand");

}
    }

}

