
package projectcs111;
import java.util.ArrayList;



public class Salons  
{
    
   private String salonName;
   private String address;
   private String phoneNumber; 
   private String salonOwner;
   private String timeOfWork;
   private int numberOfStylist;
   private Stylist [] stylistList = new Stylist[numberOfStylist];
   private Services [] servicesList;
   private ArrayList<Customer> customers;
   private ArrayList<Booking> booking;
   private ArrayList<FeedBack> feedBacks;
   private double average;
   private int num;
   private  double sum=0;
   
   
    public Salons() {
    }

    public Salons(String salonName, String address, String phoneNumber, String salonOwner, String timeOfWork, int numberOfStylist, Stylist[] stylistList, Services[] servicesList, ArrayList<Customer> customers, ArrayList<Booking> booking, ArrayList<FeedBack> feedBacks ) {
        this.salonName = salonName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salonOwner = salonOwner;
        this.timeOfWork = timeOfWork;
        this.numberOfStylist = numberOfStylist;
        this.stylistList = stylistList;
        this.servicesList = servicesList;
        this.customers = customers;
        this.booking = booking;
        this.feedBacks = feedBacks;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
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

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSalonOwner() {
        return salonOwner;
    }

    public void setSalonOwner(String salonOwner) {
        this.salonOwner = salonOwner;
    }

    public String getTimeOfWork() {
        return timeOfWork;
    }

    public void setTimeOfWork(String timeOfWork) {
        this.timeOfWork = timeOfWork;
    }

    public int getNumberOfStylist() {
        return numberOfStylist;
    }

    public void setNumberOfStylist(int numberOfStylist) {
        this.numberOfStylist = numberOfStylist;
    }

    public Stylist[] getStylistList() {
        return stylistList;
    }

    public void setStylistList(Stylist[] stylistList) {
        this.stylistList = stylistList;
    }

    public Services[] getServicesList() {
        return servicesList;
    }

    public void setServicesList(Services[] servicesList) {
        this.servicesList = servicesList;
    }

    public ArrayList<Customer>  getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Booking> getBooking() {
        return booking;
    }

    public void setBooking(ArrayList<Booking> booking) {
        this.booking = booking;
    }

    public ArrayList<FeedBack> getFeedBacks() {
        return feedBacks;
    }

    public void setFeedBacks(ArrayList<FeedBack> feedBacks) {
        this.feedBacks = feedBacks;
    }

  
     public String returnServices(){
          String s =" ";
       for(int i = 0 ; i < servicesList.length ; i++) 
         s = s+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|                                             "+"Service #"+(i+1)+"                                                      |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|                         Name                        |                         Price                         |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"                      "+servicesList[i];
       return s;  
     }
    
    public String returnStylists(){
          String s =" ";
       for(int i = 0 ; i < stylistList.length ; i++) 
           s = s+"\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|                                             "+"Stylist #"+(i+1)+"                                                      |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|      Stylist Name      |      PhoneNumber      |      Nationality      |        Job        |      Salary    |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"       "+stylistList[i]
                +"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
       return s;  
     }
    
     public String returnCustomers(){
          String s =" ";
       for(int i = 0 ; i < customers.size() ; i++) 
           s = s+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|                                             "+"Customer #"+(i+1)+"                                                      |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|      Stylist Name      |      PhoneNumber      |      Nationality      |        Job        |      Salary    |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"       "+customers.get(i)
                +"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
       return s;  
     }
     
   public String returnFeedBacks(){
          String s =" ";
       for(int i = 0 ; i < customers.size() ; i++) 
           s = s+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|                                             "+"Customer #"+(i+1)+"                                                      |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|      Stylist Name      |      PhoneNumber      |      Nationality      |        Job        |      Salary    |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"       "+customers.get(i)
                +"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
       return s;  
     }  
     
    public String returnBooking(){
          String s =" ";
       for(int i = 0 ; i < customers.size() ; i++) 
           s = s+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|                                             "+"Customer #"+(i+1)+"                                                      |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|      Stylist Name      |      PhoneNumber      |      Nationality      |        Job        |      Salary    |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"       "+customers.get(i)
                +"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
       return s;  
     }
    
    
    public double evaluation(){
      
       for (int i = 0; i < feedBacks.size(); i++)
        { sum = sum + feedBacks.get(i).getRate();}
         
       num =  FeedBack.numOfFeed;
       
    return average = sum/num; 
   } 
    
    
    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|   Salon Name   |   Address   |   Phone Number   |   Salon Owner   |   Time Of Work   |   Number Of Stylist  |\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+"      "+ salonName +"      |    "+ address +"   |    "+ phoneNumber +"   |      "+  salonOwner +"       |     "+ timeOfWork +"    |        "+  numberOfStylist 
                + returnServices() + returnStylists() +returnCustomers() ;
    }

    
   
   
    
}
