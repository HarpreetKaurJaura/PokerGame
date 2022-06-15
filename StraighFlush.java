
/**
 * Write a description of class StraighFlush here.
 *
 * @Harpreet kaur
 * @3116089
 */
//5 cards in sequence all of one suit
public class StraighFlush implements Handler
{
    private Handler nextHandler;
    Hand hand = new Hand();

    public void setNext(Handler nextHandler){
        
        this.nextHandler = nextHandler;
    }

    public int evaluate(Hand hand){
        boolean isInSequence = true;
        boolean isSameSuit = true;
        String suitOfFirstCard=hand.getHand().get(0).getSuit();
        for(int i = 0; i< hand.getHand().size(); i++){

            String suit = hand.getHand().get(i).getSuit();
            if(!suit.equals(suitOfFirstCard)){
                isSameSuit=false;
                break;
            }
        }

        if(isSameSuit){
            int firstIndex=Card.ranks.indexOf(hand.getHand().get(0).getRank());
            int secondIndex=Card.ranks.indexOf(hand.getHand().get(1).getRank());
            int thirdIndex=Card.ranks.indexOf(hand.getHand().get(2).getRank());
            int fourthIndex=Card.ranks.indexOf(hand.getHand().get(3).getRank());
            int fifthIndex=Card.ranks.indexOf(hand.getHand().get(4).getRank());
            if(secondIndex == firstIndex-1 && thirdIndex == firstIndex-2 && fourthIndex == firstIndex-3
            && fifthIndex == firstIndex-4 ){
                return Constants.STRAIGHT_FLUSH;

            }
        }
        return  nextHandler.evaluate(hand);
    }
}

