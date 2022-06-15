
/**
 * Write a description of class Flush here.
 *
 * @Harpreet kaur
 * @3116089
 */
//5 cards of one suit
public class Flush implements Handler
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

        if(isSameSuit==true){
            return Constants.FLUSH;
        }

        return nextHandler.evaluate(hand);

    }
}

