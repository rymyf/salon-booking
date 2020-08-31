
package projectcs111;
import java.util.ArrayList;

public abstract class Customer extends Person
{
   
    
    private double price ;
    private ArrayList<Services> services;
    private FeedBack[] feedBack;
    private String paymentType; // cridet card / cash
   
    
    
    public Customer() {
    }

    public Customer(String firstName, String lastName, String phoneNumber,ArrayList<Services> services, String paymentType) {
        super(firstName, lastName, phoneNumber);
        this.services = services;
        this.paymentType = paymentType;
    }

    
    public Customer(String firstName, String lastName, String phoneNumber,double price, ArrayList<Services> services,String paymentType) {
        super(firstName, lastName, phoneNumber);
        this.price = price;
        this.services = services;
        this.paymentType=paymentType;
    }

    public Customer(String firstName, String lastName, String phoneNumber,double price, ArrayList<Services> services, FeedBack[] feedBack,String paymentType) {
        super(firstName, lastName, phoneNumber);
        this.price = price;
        this.services = services;
        this.feedBack = feedBack;
        this.paymentType=paymentType;
    }

    
    
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

   
    public FeedBack[] getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(FeedBack[] feedBack) {
        this.feedBack = feedBack;
    }
    
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
    
    public ArrayList<Services> getServices() {
        return services;
    }

    public void setServices(ArrayList<Services> services) {
        this.services = services;
    }

   /* 
    public double totalPrice(){
        for (Services service : services) 
        {
            price = price + service.getPrice();
        }
       
       return price;
    }

    */
    
    @Override
    public String toString() {
        return "--- Customer ---" + "Price = " + price + "Services = " + services + "FeedBack = " + feedBack + "PaymentType = " + paymentType ;
    }
    
    
    
     
}
