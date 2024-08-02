package DeckOfCards;

import java.util.List;

public class Main
{

    public static void main(String[] args)
    {

        List<Card> deck = Card.egtStandardDeck();
        Card.printDeck(deck);


    }
}
