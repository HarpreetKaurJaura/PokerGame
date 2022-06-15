import java.util.HashMap;
/**
 * Write a description of class Pair here.
 *
 * @Harpreet kaur
 * @3116089
 */
//2 cards of one kind
public class Pair implements Handler
{
    private Handler nextHandler;
    Hand hand = new Hand();

    public void setNext(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public int evaluate(Hand hand){
        HashMap<String, Integer> ranks= new HashMap<String, Integer>();
        for ( int i=0;i< hand.getHand().size(); i++){
            String rank=hand.getHand().get(i).getRank();
            if(ranks.containsKey(rank)){
                ranks.put(rank,ranks.get(rank)+1);
            }else{
                ranks.put(rank,1);
            }
        }
        boolean isPair = false;
        for (String i: ranks.keySet()){
            if(ranks.get(i)==2){
                return Constants.PAIR;
            }
        }

        return  nextHandler.evaluate(hand);

    }
}


