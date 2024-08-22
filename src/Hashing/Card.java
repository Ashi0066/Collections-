package Hashing;

import java.util.Objects;

public class Card
{

    private String suit;
    private String face;
    private int internalHash;

    public Card(String suit, String face)
    {
        this.suit = suit;
        this.face = face;
        this.internalHash=1;
    }


    @Override
    public String toString(){
        return suit+ " "+ face;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;
        return Objects.equals(suit, card.suit) && Objects.equals(face, card.face);
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hashCode(suit);
        result = 31 * result + Objects.hashCode(face);
        return result;
    }
}
