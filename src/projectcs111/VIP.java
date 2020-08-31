
package projectcs111;
import java.util.ArrayList;

public class VIP extends Customer implements Bill
{

    public VIP() {
    }

    public VIP(String firstName, String lastName, String phoneNumber,ArrayList<Services> services, String paymentType) {
        super(firstName, lastName, phoneNumber,services, paymentType);
    }

    
    public VIP(String firstName, String lastName,String phoneNumber,double price, ArrayList<Services> services, String paymentType) {
        super(firstName,lastName,phoneNumber,price, services, paymentType);
    }

    public VIP(String firstName, String lastName,String phoneNumber,double price, ArrayList<Services> services, FeedBack[] feedBack, String paymentType) {
        super(firstName,lastName,phoneNumber,price, services, feedBack, paymentType);
    }

    
    @Override
    public double calculatePrice(double p) {
        
        return  (p*15/100);
      //price+(price*15/100);
    }

   
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
  
}
