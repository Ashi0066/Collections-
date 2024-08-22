package Hashing;

import java.util.*;

public class starter
{
    public static void main(String[] args)
    {



        // Two String similar to each other.
        String aText = "Hello";
        String b = "Hello";
        // A different String
        String c = "hello";

        List<String > list = new ArrayList<>(List.of(aText,b,c));


        list.forEach(s -> System.out.println( s +":"+ s.hashCode()));

        List<Integer> integers = new ArrayList<>(List.of(1,2,2,3,4));

        Set<Integer> integerSet = new HashSet<>(integers);
        System.out.println(integerSet
        );


        System.out.println();

        // implementing a set
        // Sets does not allow duplicate at all
        Set<String> myset = new HashSet<>(list);
        System.out.println(myset);


        for (String values:myset){
            System.out.print(values+":");
            for (int i = 0; i < list.size(); i++)
            {
                if (values==list.get(i)){
                    System.out.print(i + ",");
                }

            }
            System.out.println();
        }


        Card aceOfHeart = new Card("Hearts","Ace");
        Card kingClubs = new Card("Club","King");
        Card queenOfSpades = new Card("Spade","Queen");

        List<Card> cards = new ArrayList<>(Arrays.asList(aceOfHeart,kingClubs,queenOfSpades));





        Set<Card> deck = new HashSet<>();

        for (Card card:cards){
            if (!deck.add(card)){
                System.out.println("Found dupicate for "+ card);
            };
        }

        System.out.println(deck);

    }
}
