
/**
 * Write a description of class HighCard here.
 *
 * @Harpreet kaur
 * @3116089
 */
public class HighCard implements Handler{
    
    private Handler nextHandler;
    Hand hand = new Hand();
    public void setNext(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public int evaluate(Hand hand){
         return Constants.HIGH_CARD;
        }
    }




