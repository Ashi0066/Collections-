package DeckOfCards;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
    List<Card> deck = Card.egtStandardDeck();
     Card.printDeck(deck);


     // Creating an array of Cards.
     Card[] cards = new Card[13];

     // creating a card which is Ace of Hearts.
     Card aceOfHeart = Card.getFaceCard(Suit.HEART,'A');

     // using arrays fill method to fill the array with ace of hears card
     Arrays.fill(cards,aceOfHeart);


     System.out.println("Array of Cards");
     System.out.println(Arrays.toString(cards));

     // using the special print method on the deck
     Card.printDeck(Arrays.asList(cards),"Ace Of Hearts",1);


     //
        List<Card> cardList = new ArrayList<>(52);
        cardList.add(aceOfHeart);


        // used to fill a collection which is already filled basically replacing elements
        Collections.fill(cardList,aceOfHeart);
        System.out.println(cardList);


        // ncompies is used to create the number of copies we want to add in a list
        List<Card> aceCards = Collections.nCopies(13,aceOfHeart);
        Card.printDeck(aceCards,"Ace of haerts with ncompies",2);


        Card kingofKlubs = Card.getFaceCard(Suit.CLUB,'Q');

        List<Card> kingsOfClubs = Collections.nCopies(13,kingofKlubs);


        // This methods is used to add data into the list which can be individual data or using an array it will copy all the data to the new list
        Collections.addAll(cardList,cards);
//
//        Card.printDeck(cardList,"Cards List using the add all ",2);



        Collections.copy(cardList,kingsOfClubs);




        // testing












    }


}
