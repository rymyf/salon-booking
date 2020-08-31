
package projectcs111;
import java.util.Date;

public class Booking 
{
    
 static long numberOfBook= 111;
 private Customer customers;
 private Stylist stylist;
 private Date d;
 
 
    public Booking() {
       numberOfBook++;
    }

    public Booking(Customer customers, Date d) {
        numberOfBook++;
        this.customers = customers;
        this.d = d;
    }

    
    public Booking(Customer customers ,Date d , Stylist stylist) {
        numberOfBook++;
        this.customers = customers;
        this.stylist=stylist;
        this.d = d;
    }

    public Stylist getStylist() {
        return stylist;
    }

    public void setStylist(Stylist stylist) {
        this.stylist = stylist;
    }

   
    public static long getNumberOfBook() {
        return numberOfBook;
    }

    public static void setNumberOfBook(long numberOfBook) {
        Booking.numberOfBook = numberOfBook;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public Customer getC() {
        return customers;
    }

    public void setC(Customer customers) {
        this.customers = customers;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Booking{" + "customers=" + customers + ", stylist=" + stylist + ", d=" + d + '}';
    }

    
}
