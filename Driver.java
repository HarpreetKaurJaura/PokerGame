/**
 * Write a description of class Driver here.
 *
 * @Harpreet kaur
 * @3116089
 */
public class Driver
{
    public static void main(String[]args){
        Deck d = new Deck();
        
        //instances
        Handler royalFlush = new RoyalFlush();
        Handler straighFlush= new StraighFlush();
        Handler fourOfKind = new FourOfKind();
        Handler fullHouse = new FullHouse();
        Handler flush = new Flush();
        Handler straight = new Straight();
        Handler threeOfKind = new ThreeOfKind();
        Handler twoPair = new TwoPair();
        Handler pair= new Pair();
        Handler highCard = new HighCard();
        
        
        //chain of responsibility
        royalFlush.setNext(straighFlush);
        straighFlush.setNext(fourOfKind);
        fourOfKind.setNext(fullHouse);
        fullHouse.setNext(flush);
        flush.setNext(straight);
        straight.setNext(threeOfKind);
        threeOfKind.setNext(twoPair);
        twoPair.setNext(pair);
        pair.setNext(highCard);
        
        
        //10 hand and printing
        for(int i =1; i<11; i++){
            Hand h1= new Hand();
            h1 = d.dealHand();
            int value=royalFlush.evaluate(h1);
            System.out.println( "Hand = " + i +"   " + "Value =  " +  value  + "   " + h1.handAsString()); 
        }
    }
}

