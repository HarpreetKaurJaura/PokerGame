
/**
 * Write a description of class Handler here.
 *
 * @Harpreet kaur
 * @3116089
 */
public interface Handler
{
    public void setNext(Handler next);

    public int evaluate(Hand hand);
}