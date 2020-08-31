
package projectcs111;


public class FeedBack 
{
 
    
    static int numOfFeed =0;
    private String comment;
    private double rate;// 5/5

    
    
    public FeedBack() {
        numOfFeed++;
    }

    public FeedBack( String comment, double rate) {
        numOfFeed++;
        this.comment = comment;
        this.rate = rate;
    }

    
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public static int getNumOfFeed() {
        return numOfFeed;
    }

    public static void setNumOfFeed(int numOfFeed) {
        FeedBack.numOfFeed = numOfFeed;
    }

    
    
    @Override
    public String toString() {
        return "FeedBack : " + "\nComment = " + comment + "\nRate = " + rate ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
