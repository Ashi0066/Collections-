package DeckOfCards;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch_Frequency_MinMax_Rotate
{

    public static void main(String[] args)
    {

        // Creating a list and printing
        List<Card> deck = Card.egtStandardDeck();
//        Card.printDeck(deck);
        Card tenOfHearts = Card.getNumericCard(Suit.HEART,10);

        var comparing = Comparator.comparing(Card::rank);

        Collections.sort(deck,comparing);
//        Card.printDeck(deck);


       int found =  Collections.binarySearch(deck,tenOfHearts,comparing);


        System.out.println("Found index = "+ found );


        System.out.println( binaryResearch(deck,tenOfHearts));

        Card card1 = Card.getNumericCard(Suit.CLUB,10);
        Collections.replaceAll(deck,card1,tenOfHearts);
        Card.printDeck(deck.subList(32,36),"Tens Row",1);


        System.out.println("Ten of Clubs Frequency ="+ Collections.frequency(deck,tenOfHearts));
        System.out.println("BEST = "+ Collections.max(deck,comparing));
        System.out.println("Worst Card = "+ Collections.min(deck,comparing ));


        System.out.println();
        System.out.println("New Deck ");

        List<Card> deck2 = Card.egtStandardDeck();
        Card.printDeck(deck2);

        Collections.rotate(deck2,2);
        System.out.println("Rotated  Deck ");
        Card.printDeck(deck2);




    }


    public static int binaryResearch(List<Card> j,Card value){
        int start = 0 ;
        int end = j.size()-1;

        while (start<=end){

            int mid = start+(end-start)/2;

            Card car = j.get(mid);

            if (car.rank()>value.rank()){
                end= mid+1;
            } else if (car.rank()<value.rank())
            {
                start= mid-1;
            }else {
                return mid;
            }


        }


        return -1;

    }
}
