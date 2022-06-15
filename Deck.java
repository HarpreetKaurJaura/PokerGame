import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Deck here.
 *
 * @3116089
 * @Harpreet kaur
 */
public class Deck{
    private ArrayList<Card> deck;
    Hand hand = new Hand();
    public Deck(){//adding the all 52 cards with suits and ranks of each by 13
        this.deck = new ArrayList<>();
       
        for( int i=0; i<Card.ranks.size(); i++){
            for(int j=0; j<Card.suits.size();j++){
                this.deck.add(new Card(Card.suits.get(j), Card.ranks.get(i)));

            }
        }
    }

    public void shuffle(){//shuffle the cards
        Collections.shuffle(this.deck);
    }

    public Hand dealHand(){//removing 5 cards from deck and add them into hand
        this.shuffle();
        Hand hand = new Hand();
        for( int i=0; i<5; i++){
            hand.addCard(deck.remove(deck.size()-1));
        }
        return hand;
    }
}
 