
/**
 * Write a description of class RoyalFlush here.
 *
 * @Harpreet kaur
 * @3116089
 */
//Ace high straight flush

public class RoyalFlush implements Handler

{
    private Handler nextHandler;
    Hand hand = new Hand();

    public void setNext(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public int evaluate(Hand hand){
        
        boolean isSameSuit = true;
        String suitOfFirstCard=hand.getHand().get(0).getSuit();
        for(int i = 0; i< hand.getHand().size(); i++){
            String suit = hand.getHand().get(i).getSuit();
            if(!suit.equals(suitOfFirstCard)){
                isSameSuit=false;
                break;
            }
        }
        String rank1=hand.getHand().get(0).getRank();
        String rank2=hand.getHand().get(1).getRank();
        String rank3=hand.getHand().get(2).getRank();
        String rank4=hand.getHand().get(3).getRank();
        String rank5=hand.getHand().get(4).getRank();
        if(isSameSuit==true&&rank1.equals("A")&&rank2.equals("K")&&rank3.equals("Q")&&rank3.equals("J")&&rank4.equals("10")){
            return Constants.ROYAL_FLUSH;
        }

        return  nextHandler.evaluate(hand);

    }
}
