package DeckOfCards;

import java.util.ArrayList;
import java.util.List;

public  record  Card(Suit suit, String face , int rank)
{

  @Override
  public String toString(){
    int length = face.equals("10")?2:1;
    String faceString=face.substring(0,length);
    return String.format("%s%c(%d)",faceString,suit.getImage(),rank);
  }

  public static Card getNumericCard(Suit suit,int number){

    if (number>=2&&number<=10){
      return new Card(suit,String.valueOf(number),number-2);
    }
    System.out.println("Invalid Card Number");
    return null;

  }

  public static Card getFaceCard(Suit suit, char abbreviation){

    int index = "JQKA".indexOf(abbreviation);

    if (index!=-1){
      return new Card(suit,String.valueOf(abbreviation),index+9);
    }
    System.out.println("Invalid Face Card Selected");
    return null;

  }

  public static List<Card> egtStandardDeck(){
    List<Card> deck = new ArrayList<>(52);

    for (Suit suit:Suit.values())
    {
      for (int i = 2; i <=10 ; i++)
      {
        Card card=getNumericCard(suit,i);
        if (card!=null){
          deck.add(card);
        }
      }
      for (char c: "JQKA".toCharArray())
      {

        Card card = getFaceCard(suit,c);
        if (card!=null){
          deck.add(card);
        }
        
      }
      
    }
    return deck;
  }
  public static void printDeck(List<Card> deck){
    printDeck(deck,"Card Deck",4);

  }

  public static void printDeck(List<Card> deck , String Description,int rows){

    System.out.println("-".repeat(30));
    if (Description!=null)
    {
      System.out.println(Description);
    }
    int cardsInRow = (int) Math.ceil((double) deck.size() / rows);

    for (int i = 0 ; i<rows;i++){
      int startIndex = i * cardsInRow;
      int endIndex = Math.min(startIndex + cardsInRow, deck.size());
      deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
      System.out.println();
    }

  }









}
