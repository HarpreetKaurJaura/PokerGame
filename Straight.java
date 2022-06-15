
/**
 * Write a description of class Straight here.
 *
 * @Harpreet kaur
 * @3116089
 */
//5 cards in sequence
public class Straight implements Handler
{
    private Handler nextHandler;
    Hand hand = new Hand();

    public void setNext(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public int evaluate(Hand hand){
        int firstIndex=Card.ranks.indexOf(hand.getHand().get(0).getRank());
        int secondIndex=Card.ranks.indexOf(hand.getHand().get(1).getRank());
        int thirdIndex=Card.ranks.indexOf(hand.getHand().get(2).getRank());
        int fourthIndex=Card.ranks.indexOf(hand.getHand().get(3).getRank());
        int fifthIndex=Card.ranks.indexOf(hand.getHand().get(4).getRank());
        if((secondIndex == firstIndex+1 && thirdIndex == firstIndex+2 && fourthIndex == firstIndex+3
        && fifthIndex == firstIndex+4 ) || (firstIndex == 9 && secondIndex == firstIndex+1 &&
        thirdIndex == firstIndex+2 && fourthIndex == firstIndex+3
        && fifthIndex == 0 )){ //is straight or is broadway straight
            return Constants.STRAIGHT;

        }
        return  nextHandler.evaluate(hand);
    }
}
    



