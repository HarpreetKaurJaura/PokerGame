import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Card here.
 *
 * @Harpreet Kaur
 * @3116089
 */
public class Card

{
    public static ArrayList<String>ranks = new ArrayList<>(Arrays.asList("ACE","TWO","THREE","FOUR","FIVE","SIX",
    "SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING")); //ranks from one to 13
    public static ArrayList <String> suits = new ArrayList<>(Arrays.asList("CLUB","DIAMOND","HEART","SPADE")); //number of suits
    private String suit;
    private String rank;

    public Card(){
    }
    public Card(String suit, String rank){//constructor for card
        this.suit = suit;
        this.rank = rank;
    }

    public String getRank(){//getter for rank
        return rank;
    }

    public String getSuit(){//getter for suit
        return suit;
    }

    public String toString(){ //printing rank and suit
        return rank + " of " + suit; 
    }
}

