
package projectcs111;

import java.util.ArrayList;


public class Regular extends Customer implements Bill
{

    public Regular() {
    }

    public Regular(String firstName, String lastName, String phoneNumber,double price, ArrayList<Services> services, String paymentType) {
        super(firstName,lastName,phoneNumber,price, services, paymentType);
    }

    public Regular(String firstName, String lastName, String phoneNumber,double price, ArrayList<Services> services, FeedBack[] feedBack, String paymentType) {
        super(firstName,lastName,phoneNumber,price, services, feedBack, paymentType);
    }

    public Regular(String firstName, String lastName, String phoneNumber, ArrayList<Services> services, String paymentType) {
        super(firstName, lastName, phoneNumber, services, paymentType);
    }

    
    
    @Override
    public double calculatePrice(double p) {
       
        return p;
    }
  
    @Override
    public String toString() {
        return super.toString();
    } 

}