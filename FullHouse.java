import java.util.HashMap;
/**
 * Write a description of class FullHouse here.
 *
 * @Harpreet kaur
 * @3116089
 */
//3 cards of one kind, 2 cards of another kind
public class FullHouse implements Handler
{
    private Handler nextHandler;
    Hand hand = new Hand();

    public void setNext(Handler nextHandler){
        this.nextHandler= nextHandler;
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
        boolean isFullHouse = false;
        boolean isForFirstPair = false;
        boolean isForSecondPair = false;

        for (String i: ranks.keySet()){
            if(ranks.get(i)==3){
                isForFirstPair= true;
            }else if(ranks.get(i)==2){
                isForSecondPair= true;
            }
        }


        if(isForFirstPair== true && isForSecondPair==true){
            isFullHouse = true;
            return Constants.FULL_HOUSE;
        }

        return nextHandler.evaluate(hand);

        }
    }


   