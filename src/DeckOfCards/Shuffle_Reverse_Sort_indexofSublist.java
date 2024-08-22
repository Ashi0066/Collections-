package DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class Shuffle_Reverse_Sort_indexofSublist
{

    public static void main(String[] args)
    {

        // Creating a list and printing
        List<Card> deck = Card.egtStandardDeck();
        Card.printDeck(deck);

        // Shuffling the deck and printing
        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffeled Deck ",4);

        // revers on the list

        Collections.reverse(deck);
        Card.printDeck(deck,"reversed Deck ",4);



       // sorting method can be used to compare objects against each other
        var sorting = Comparator.comparing(Card::rank);


        Collections.sort(deck,sorting);
        Card.printDeck(deck,"reversed Deck ",4);


        List<Card> Kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(Kings,"Kings in a deck ",1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens,"Tens in a deck ", 1 );




    }
}
