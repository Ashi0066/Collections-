package DeckOfCards;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
//
//        List<Card> deck = Card.egtStandardDeck();
//        Card.printDeck(deck);
//
//        Collections.shuffle(deck);
//        Card.printDeck(deck,"Shuffeled Deck",4);
//
//        Collections.reverse(deck);
//        Card.printDeck(deck);
//
//        parrotTrouble(false ,21);

        System.out.println( parrotTrouble(false ,21));


    }
    public static  boolean parrotTrouble(boolean talking, int hour) {

        if(talking==true && (hour<7||hour>20)){
            return true;
        } else{
            return false;
        }

    }

}
