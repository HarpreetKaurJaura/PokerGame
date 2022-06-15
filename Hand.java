import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a description of class Hand here.
 *
 * @Harpreet kaur
 * @3116089
 */
public class Hand
{
    private ArrayList<Card> hand;//arraylist of card hand
    public Hand(){
        hand = new ArrayList<>();
    }

    public ArrayList<Card>getHand(){//getter
        return hand;
    }

    public void addCard(Card card){//adding cards to hand
        hand.add(card);
    }

    public void printHand(){//printing hand
        for(int i=0; i<hand.size(); i++){
            System.out.print(hand.get(i) + " , ");
        }

    }

    public String handAsString(){//printing with value
        String value = "";
        for(int i=0; i<hand.size(); i++){
            value+= hand.get(i) + " , ";
        }
        return value;
    }
}

