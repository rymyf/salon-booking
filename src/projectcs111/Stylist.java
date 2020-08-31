
package projectcs111;
import java.util.ArrayList;


public class Stylist extends Person
{
   
   private String nationality;
   private String job;
   private double salary;
   private ArrayList<Booking> booking;
   private ArrayList<FeedBack> feedBack ;
   private double average;
   
   private int num;
   private double sum =0;
   
   public Stylist() {
    }

    public Stylist(String firstName, String lastName, String phoneNumber,String nationality, String job, double salary,ArrayList<Booking> booking,ArrayList<FeedBack> feedBack) {
        super(firstName,lastName,phoneNumber);
        this.nationality = nationality;
        this.job = job;
        this.salary = salary;
        this.booking=booking;
        this.feedBack = feedBack;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    
    public void setAverage(double average) {
        this.average = average;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Booking> getBooking() {
        return booking;
    }

    public void setBooking(ArrayList<Booking> booking) {
        this.booking = booking;
    }

    public ArrayList<FeedBack> getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(ArrayList<FeedBack> feedBack) {
        this.feedBack = feedBack;
    }

    
    @Override
    public String toString() {
        return super.toString() +"                 "+ nationality +"           "+  job +"         "+  salary +"             ";
    }

   
    
   public double evaluation(){
       for (int i = 0; i < feedBack.size(); i++)
       { sum = sum + feedBack.get(i).getRate();}
 
       num =  FeedBack.numOfFeed;
       
    return average = sum/num; 
   } 
    
    
    

 }
