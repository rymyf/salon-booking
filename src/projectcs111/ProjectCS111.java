
package projectcs111;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class ProjectCS111 
{
    static Date today = new Date();
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    
    
    Salons[] salonList1 = new Salons[3];
    Salons[] salonList2 = new Salons[3];
    City[] cityList = new City[2];
    int numberOfStylist = 2;
    
     ArrayList<FeedBack> feedbacksty1 = new ArrayList();
     ArrayList<FeedBack> feedbacksty11 = new ArrayList();
     ArrayList<Booking> bookingsty1 = new ArrayList();
     ArrayList<Booking> bookingsty11 = new ArrayList();
     // Stylist for first salon in Riyadh
     Stylist [] styList1 = new Stylist[numberOfStylist];
     styList1[0] = new Stylist("nor","soryani","0555","Filipeno","haircut stylist", 2000.0,bookingsty1,feedbacksty1);
     styList1[1] = new Stylist("hala","khan","0555","Indian","make up artist", 3000.0,bookingsty11,feedbacksty11);
     // Services for first salon in Riyadh
     Services [] srvList1 = new Services[5];
     srvList1[0] = new Services("haircut",20);
     srvList1[1] = new Services("bodycare",30);
     srvList1[2] = new Services("makeup",100);
     srvList1[3] = new Services("manycare",30);
     srvList1[4] = new Services("treatment",100);
     // Arraies of first salon in Riyadh
     ArrayList<Customer> customersalon1 = new ArrayList();
     ArrayList<Booking> bookingsalon1 = new ArrayList();
     ArrayList<FeedBack> feedbacksalon1 = new ArrayList();
     // first salon in Riyadh  
     salonList1[0] = new Salons("Dior","Exit 16","0950-04321","Rahaf","10am-11pm",numberOfStylist,styList1,srvList1,customersalon1,bookingsalon1,feedbacksalon1);
     
   
     ArrayList<FeedBack> feedbacksty2 = new ArrayList();
     ArrayList<Booking> bookingsty2 = new ArrayList();
     ArrayList<FeedBack> feedbacksty22 = new ArrayList();
     ArrayList<Booking> bookingsty22 = new ArrayList();
     // Stylist for Second salon in Riyadh
     Stylist [] styList2 = new Stylist[numberOfStylist];
     styList2[0] = new Stylist("hend","ahmed","0555","Kuwaiti","haircut stylist", 2000.0,bookingsty2,feedbacksty2);
     styList2[1] = new Stylist("mona","khalid","0555","Saudi","make up artist", 3000.0,bookingsty22,feedbacksty22);
     // Services for Second salon in Riyadh
     Services [] srvList2 = new Services[5];
     srvList2[0] = new Services("haircut",20);
     srvList2[1] = new Services("bodycare",30);
     srvList2[2] = new Services("makeup",100);
     srvList2[3] = new Services("manycare",30);
     srvList2[4] = new Services("treatment",100);
     // Arraies of Second salon in Riyadh
     ArrayList<Customer> customersalon2 = new ArrayList();
     ArrayList<Booking> bookingsalon2 = new ArrayList();// i will add appointments of customer here!
     ArrayList<FeedBack> feedbacksalon2 = new ArrayList();
     // Second salon in Riyadh
     salonList1[1] = new Salons("Shefon","Exit 10","070113-04618","Layan","10am-11pm",numberOfStylist,styList2,srvList2,customersalon2,bookingsalon2,feedbacksalon2);
     
     ArrayList<FeedBack> feedbacksty3 = new ArrayList();
     ArrayList<Booking> bookingsty3 = new ArrayList();
     ArrayList<FeedBack> feedbacksty33 = new ArrayList();
     ArrayList<Booking> bookingsty33 = new ArrayList();
     // Stylist for Third salon in Riyadh
     Stylist [] styList3 = new Stylist[numberOfStylist];
     styList3[0] = new Stylist("maha","fahad","0555","Lebanese","haircut stylist", 2000.0,bookingsty3,feedbacksty3);
     styList3[1] = new Stylist("sara","mohammed","0555","Kuwaiti","make up artist", 3000.0,bookingsty33,feedbacksty33);
     // Services for Third salon in Riyadh
     Services [] srvList3 = new Services[5];
     srvList3[0] = new Services("haircut",20);
     srvList3[1] = new Services("bodycare",30);
     srvList3[2] = new Services("makeup",100);
     srvList3[3] = new Services("manycare",30);
     srvList3[4] = new Services("treatment",100);
     // Arraies of Third salon in Riyadh
     ArrayList<Customer> customersalon3 = new ArrayList();
     ArrayList<Booking> bookingsalon3 = new ArrayList(); // i will add appointments of customer here!
     ArrayList<FeedBack> feedbacksalon3 = new ArrayList();
     // Third salon in Riyadh
     salonList1[2] = new Salons("Lubna","Exit 9","03562-05001","Duna","10am-11pm",numberOfStylist,styList3,srvList3,customersalon3,bookingsalon3,feedbacksalon3);
     
     cityList[0] = new City("Riyadh",salonList1);
     
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

     ArrayList<FeedBack> feedbacksty4 = new ArrayList();
     ArrayList<Booking> bookingsty4 = new ArrayList();
     ArrayList<FeedBack> feedbacksty44 = new ArrayList();
     ArrayList<Booking> bookingsty44 = new ArrayList();
     // Stylist for first salon in Jeddah
     Stylist [] styList4 = new Stylist[numberOfStylist];
     styList4[0] = new Stylist("ghada","yousef","0555","Saudi","haircut stylist", 2000.0,bookingsty4,feedbacksty4);
     styList4[1] = new Stylist("Atheer","omar","0555","Saudi","make up artist", 3000.0,bookingsty44,feedbacksty44);
     // Services for first salon in Jeddah
     Services [] srvList4 = new Services[5];
     srvList4[0] = new Services("haircut",20);
     srvList4[1] = new Services("bodycare",30);
     srvList4[2] = new Services("makeup",100);
     srvList4[3] = new Services("manycare",30);
     srvList4[4] = new Services("treatment",100);
     // Arraies of first salon in Jeddah
     ArrayList<Customer> customersalon4 = new ArrayList();
     ArrayList<Booking> bookingsalon4 = new ArrayList();
     ArrayList<FeedBack> feedbacksalon4 = new ArrayList();
     // first salon in Jeddah  
     salonList2[0] = new Salons("Farnor","Exit 16","06348-01992","Rahaf","10am-11pm",numberOfStylist,styList4,srvList4,customersalon4,bookingsalon4,feedbacksalon4);
     
   
     ArrayList<FeedBack> feedbacksty5 = new ArrayList();
     ArrayList<Booking> bookingsty5 = new ArrayList();
     ArrayList<FeedBack> feedbacksty55 = new ArrayList();
     ArrayList<Booking> bookingsty55 = new ArrayList();
     // Stylist for Second salon in Jeddah
     Stylist [] styList5 = new Stylist[numberOfStylist];
     styList5[0] = new Stylist("rana","khalid","0555","Omani","haircut stylist", 2000.0,bookingsty5,feedbacksty5);
     styList5[1] = new Stylist("rezan","saleh","0555","Turkey","make up artist", 3000.0,bookingsty55,feedbacksty55);
     // Services for Second salon in Jeddah
     Services [] srvList5 = new Services[5];
     srvList5[0] = new Services("haircut",20);
     srvList5[1] = new Services("bodycare",30);
     srvList5[2] = new Services("makeup",100);
     srvList5[3] = new Services("manycare",30);
     srvList5[4] = new Services("treatment",100);
     // Arraies of Second salon in Jeddah
     ArrayList<Customer> customersalon5 = new ArrayList();
     ArrayList<Booking> bookingsalon5 = new ArrayList();// i will add appointments of customer here!
     ArrayList<FeedBack> feedbacksalon5 = new ArrayList();
     // Second salon in Jeddah
     salonList2[1] = new Salons("Saraya","Exit 10","07143-05128","Layan","10am-11pm",numberOfStylist,styList5,srvList5,customersalon5,bookingsalon5,feedbacksalon5);
     
     ArrayList<FeedBack> feedbacksty6 = new ArrayList();
     ArrayList<Booking> bookingsty6 = new ArrayList();
     ArrayList<FeedBack> feedbacksty66 = new ArrayList();
     ArrayList<Booking> bookingsty66 = new ArrayList();
     // Stylist for Second salon in Jeddah
     Stylist [] styList6 = new Stylist[numberOfStylist];
     styList6[0] = new Stylist("Amal","Otaibi","0555","Saudi","haircut stylist", 2000.0,bookingsty6,feedbacksty6);
     styList6[1] = new Stylist("Rawan","Omari","0555","Saudi","make up artist", 3000.0,bookingsty66,feedbacksty66);
     // Services for Second salon in Jeddah
     Services [] srvList6 = new Services[5];
     srvList6[0] = new Services("haircut",20);
     srvList6[1] = new Services("Bodycare",30);
     srvList6[2] = new Services("makeup",100);
     srvList6[3] = new Services("manycare",30);
     srvList6[4] = new Services("treatment",100);
     // Arraies of Second salon in Jeddah
     ArrayList<Customer> customersalon6 = new ArrayList();
     ArrayList<Booking> bookingsalon6 = new ArrayList(); // i will add appointments of customer here!
     ArrayList<FeedBack> feedbacksalon6 = new ArrayList();
     // Second salon in Jeddah
     salonList2[2] = new Salons("Hayat","Exit 9","08832-02936","Duna","10am-11pm",numberOfStylist,styList6,srvList6,customersalon6,bookingsalon6,feedbacksalon6);
     
     cityList[1] = new City("Jeddah",salonList2);
     
     Country myCountry = new Country("KSA",cityList);   
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
 
   ArrayList<Booking> booking = new ArrayList();
   ArrayList<Services> services = new ArrayList();
   ArrayList<FeedBack> feedbacks = new ArrayList();
   
     String salonName =null;
     String cityName = null;
     String stylistName= null;
     String firstName = null;
     String lastName = null;
     String phoneNumber = null;
     String servName = null;
     String typeCust= null;
     String typePay = null;
     String witchOne = null;
     String comment = null;
     double rate ;
     Stylist st = null;
     int numOfBook;
     int snum ;
     double p = 0.0;
     Date d = null;
     int number;
     int choice;
     
        do {
            Menu();
           choice = input.nextInt();
           
            
           switch(choice){
               case 1:  
                       for (int i = 0; i < cityList.length; i++) 
                      {
                       System.out.println("\n       ~~ City "+(i+1)+" ~~\n"+cityList[i]);
                       System.out.println("---------------------------------------------------------------------------------------------------");
                      }
                    break; // end case 1 
               
               
               case 2:  
                           System.out.println("\nEnter the name of city :-");
                           cityName = input.next();
                           System.out.println("Enter the name of salon :-");
                           salonName = input.next();
                   
               for (City cityList1 : cityList) 
               { 
                  if (cityList1.getName().startsWith(cityName)) 
                  {
                       for (int j = 0; j < 3; j++)
                     {
                        if(salonList1[j].getSalonName().startsWith(salonName) )
                            System.out.println(salonList1[j]);
                        else if(salonList2[j].getSalonName().startsWith(salonName))
                            System.out.println(salonList2[j]);
                     }
                  }
               
               } //end for
                 break; // end case 2 
               
               
               
               
               case 3: 
                        System.out.println("\nWhat is your first name? ");
                        firstName = input.next();
                        System.out.println("What is your last name? ");
                        lastName = input.next();
                        System.out.println("What is your phone number? ");
                        phoneNumber = input.next();
                        System.out.println("Enter your appointment date (day/month/hour/minute) : ");
                        int day = input.nextInt();
                        int month = input.nextInt();
                        int hour = input.nextInt();
                        int minute = input.nextInt();
                        d = new Date(117,month,day,hour,minute); 
                        
                        
                        
                       for (int i = 0; i < 3; i++) 
                        {
                            if(salonList1[i].getSalonName().startsWith(salonName))
                            {
                                System.out.println("How many Service do you want? ");
                                snum = input.nextInt();
                               
                                for (int n = 0; n < snum; n++) 
                             {
                               System.out.println("What your service? ");
                               servName = input.next();
                               
                        
                                for (int j = 0; j < 5; j++) 
                                {
                                   if(srvList1[j].getName().startsWith(servName))
                                   {
                                        System.out.println(srvList1[j].getName()+"  "+srvList1[j].getPrice());
                                        p = p + srvList1[j].getPrice();
                                        services.add(srvList1[j]); 
                                   }
                                  else if(srvList2[j].getName().startsWith(servName))
                                   {
                                       System.out.println(srvList2[j].getName()+"  "+srvList2[j].getPrice());
                                       p = p + srvList2[j].getPrice();
                                       services.add(srvList2[j]); 
                                   }
                                  else if(srvList3[j].getName().startsWith(servName))
                                   {
                                      System.out.println(srvList3[j].getName()+"  "+srvList3[j].getPrice());
                                      p = p + srvList3[j].getPrice(); 
                                      services.add(srvList3[j]); 
                                   }
                                }
                              }
                            }//end if statement
                                
                            else if(salonList2[i].getSalonName().startsWith(salonName))
                            {
                                System.out.println("How many Service do you want? ");
                                snum = input.nextInt();
                               
                                for (int n = 0; n < snum; n++) 
                             {
                               System.out.println("What your service? ");
                               servName = input.next();
                                
                                for (int j = 0; j < 5; j++) 
                                {
                                   if(srvList4[j].getName().startsWith(servName))
                                   {
                                       System.out.println(srvList4[j]+"#4");
                                       p = p + srvList4[j].getPrice();
                                       services.add(srvList4[j]);
                                   }
                                  else if(srvList5[j].getName().startsWith(servName))
                                  {
                                       System.out.println(srvList5[j]+"#5");
                                       p = p + srvList5[j].getPrice();
                                       services.add(srvList5[j]); 
                                  }
                                  else if(srvList6[j].getName().startsWith(servName))
                                  {
                                       System.out.println(srvList6[j]+"#6");
                                       p = p + srvList6[j].getPrice();
                                       services.add(srvList6[j]); 
                                  }
                                }
                             }
                          }// end else statement
                        
                       System.out.println("Do you Want VIP services? yes/no");
                       typeCust = input.next();
                       System.out.println("How do you want to pay? crided card / cash");
                       typePay = input.nextLine();
                       input.nextLine();
                        
                       if(typeCust.equals("yes"))
                        {   
                           Customer c = new VIP(firstName,lastName,phoneNumber,services,typePay);
                           booking.add(new Booking(c,d));
                           VIP v1 = (VIP) c;
                           p = p + v1.calculatePrice(p);
                           System.out.println("Your number is: "+Booking.numberOfBook);
                           break;
                        }
                        else
                        {
                         booking.add(new Booking(new Regular(firstName,lastName,phoneNumber,services,typePay),d));
                         System.out.println("Your number is: "+Booking.numberOfBook);
                         break;
                        }
                     }// end for loop
                       System.out.println("The price is : "+checkDate(d,p));
                       p = 0.0;
                       
                       
                      break;//end case 3
               
               
               case 4:  
                        System.out.println("\nWhat is your first name? ");
                        firstName = input.next();
                        System.out.println("What is your last name? ");
                        lastName = input.next();
                        System.out.println("What is your phone number? ");
                        phoneNumber = input.next();
                        System.out.println("Enter your appointment date (day/month/hour/minute) : ");
                        day = input.nextInt();
                        month = input.nextInt();
                        hour = input.nextInt();
                        minute = input.nextInt();
                        d = new Date(117,month,day,hour,minute); 
                        
                        
                        
                       for (int i = 0; i < 3; i++) 
                        {
                            if(salonList1[i].getSalonName().startsWith(salonName))
                            {
                                System.out.println("How many Service do you want? ");
                                snum = input.nextInt();
                               
                                for (int n = 0; n < snum; n++) 
                             {
                               System.out.println("What your service? ");
                               servName = input.next();
                               
                        
                                for (int j = 0; j < 5; j++) 
                                {
                                   if(srvList1[j].getName().startsWith(servName))
                                   {
                                        System.out.println(srvList1[j].getName()+"  "+srvList1[j].getPrice());
                                        p = p + srvList1[j].getPrice();
                                        services.add(srvList1[j]); 
                                   }
                                  else if(srvList2[j].getName().startsWith(servName))
                                   {
                                       System.out.println(srvList2[j].getName()+"  "+srvList2[j].getPrice());
                                       p = p + srvList2[j].getPrice();
                                       services.add(srvList2[j]); 
                                   }
                                  else if(srvList3[j].getName().startsWith(servName))
                                   {
                                      System.out.println(srvList3[j].getName()+"  "+srvList3[j].getPrice());
                                      p = p + srvList3[j].getPrice(); 
                                      services.add(srvList3[j]); 
                                   }
                                }
                              }
                            }//end if statement
                                
                            else if(salonList2[i].getSalonName().startsWith(salonName))
                            {
                                System.out.println("How many Service do you want? ");
                                snum = input.nextInt();
                               
                                for (int n = 0; n < snum; n++) 
                             {
                               System.out.println("What your service? ");
                               servName = input.next();
                                
                                for (int j = 0; j < 5; j++) 
                                {
                                   if(srvList4[j].getName().startsWith(servName))
                                   {
                                       System.out.println(srvList4[j].getName()+"  "+srvList4[j].getPrice());
                                      p = p + srvList4[j].getPrice(); 
                                      services.add(srvList4[j]);
                                   }
                                  else if(srvList5[j].getName().startsWith(servName))
                                  {
                                       System.out.println(srvList5[j].getName()+"  "+srvList5[j].getPrice());
                                      p = p + srvList5[j].getPrice(); 
                                      services.add(srvList5[j]); 
                                  }
                                  else if(srvList6[j].getName().startsWith(servName))
                                  {
                                       System.out.println(srvList6[j].getName()+"  "+srvList6[j].getPrice());
                                      p = p + srvList6[j].getPrice(); 
                                      services.add(srvList6[j]); 
                                  }
                                }
                             }
                          }// end else statement
                        
                       
                       System.out.println("Witch Stylist Do You Want? ");
                       stylistName = input.next();
                        
                        
                            if(salonList1[i].getSalonName().startsWith(salonName) )
                            {
                                for (int j = 0; j < 2; j++) 
                                {
                                   if(styList1[j].getFirstName().startsWith(stylistName))
                                   {  System.out.println("Your appointment With Stylist " +styList1[j].getFirstName()+" is ready..");
                                      st = styList1[j];
                                      break;
                                   }
                                  else if(styList2[j].getFirstName().startsWith(stylistName))
                                  {
                                      System.out.println("Your appointment With Stylist " +styList2[j].getFirstName()+" is ready..");
                                      st = styList2[j];
                                      break;
                                  }
                                  else if(styList3[j].getFirstName().startsWith(stylistName))
                                  {
                                      System.out.println("Your appointment With Stylist " +styList3[j].getFirstName()+" is ready..");
                                      st = styList3[j];
                                      break;
                                  }
                                }
                            }//end if statment
                            
                            
                            else if(salonList2[i].getSalonName().startsWith(salonName))
                            {
                              for (int j = 0; j < 2; j++) 
                                {
                                   if(styList4[j].getFirstName().startsWith(stylistName))
                                   {
                                      System.out.println("Your appointment With Stylist " +styList4[j].getFirstName()+" is ready..");
                                      st = styList4[j];
                                      break;
                                   }
                                  else if(styList5[j].getFirstName().startsWith(stylistName))
                                  {
                                      System.out.println("Your appointment With Stylist " +styList5[j].getFirstName()+" is ready..");
                                      st = styList5[j];
                                      break;
                                  }
                                  else if(styList6[j].getFirstName().startsWith(stylistName))
                                  {
                                      System.out.println("Your appointment With Stylist " +styList6[j].getFirstName()+" is ready..");
                                      st = styList6[j];}
                                      break;
                                }
                            }//end else statment
                        
                       System.out.println("Do you Want VIP services? yes/no");
                       typeCust = input.next();
                       System.out.println("How do you want to pay? crided card / cash");
                       typePay = input.nextLine();
                       input.nextLine();
                       
                       if(typeCust.equals("yes"))
                        {   
                           Customer c = new VIP(firstName,lastName,phoneNumber,services,typePay);
                           booking.add(new Booking(c,d,st));
                           VIP v1 = (VIP) c;
                           p = p + v1.calculatePrice(p);
                           System.out.println("Your number is: "+Booking.numberOfBook);
                           break;
                        }
                        else
                        {
                         booking.add(new Booking(new Regular(firstName,lastName,phoneNumber,services,typePay),d));
                         System.out.println("Your number is: "+Booking.numberOfBook);
                        break;
                        }
                        
                     }//end for loop
                     
                       
                       System.out.println("The price is : "+checkDate(d,p));
                       p = 0.0;
                       st = null;
                        
                        
                   break;//end case 4
              
               
               
               case 5: 
                           System.out.println("Enter the name of salon :-");
                           salonName = input.next();
                           
                             for (int j = 0; j < 3; j++)
                             {
                                if(salonList1[j].getSalonName().startsWith(salonName) )
                                { 
                                    System.out.println("Write a comment >> ");
                                    comment = input.nextLine();
                                    input.nextLine();
                                    System.out.println("Write a rate >> ");
                                    rate = input.nextDouble();
                                    
                                    switch (j) {
                                        case 0:
                                            feedbacksalon1.add(new FeedBack(comment,rate));
                                            break;
                                        case 1:
                                            feedbacksalon2.add(new FeedBack(comment,rate));
                                            break;
                                        case 2:
                                            feedbacksalon3.add(new FeedBack(comment,rate));
                                            break;
                                        default:
                                            break;
                                    
                                   }// end switch
                                System.out.println("Thanks for giving us your feedback.. ");
                                }//end if
                                  
                               else if(salonList2[j].getSalonName().startsWith(salonName))
                               {
                                    System.out.println("Write a comment >> ");
                                    comment = input.nextLine();
                                    input.nextLine();
                                    System.out.println("Write a rate >> ");
                                    rate = input.nextDouble();
                                   
                               
                                   switch (j) {
                                        case 0:
                                            feedbacksalon4.add(new FeedBack(comment,rate));
                                            break;
                                        case 1:
                                            feedbacksalon5.add(new FeedBack(comment,rate));
                                            break;
                                        case 2:
                                            feedbacksalon6.add(new FeedBack(comment,rate));
                                            break;
                                        default:
                                            break;
                               }//end switch
                             
                              System.out.println("Thanks for giving us your feedback.. ");     
                           }//end else
                        }//end for loop
                          
                    break;//end case 5
                    
               
               
               case 6:
                            System.out.println("Enter the name of salon :-");
                            salonName = input.next();
                            System.out.println("Witch Stylist Do You Want? ");
                            stylistName = input.next();
                            
                        for (int i = 0; i < 3; i++) {
                                
                            if(salonList1[i].getSalonName().startsWith(salonName) )
                            {   
                                System.out.println("Write a comment >> ");
                                comment = input.nextLine();
                                input.nextLine();
                                System.out.println("Write a rate >> ");
                                rate = input.nextDouble();
                                
                                
                                for (int n = 0; n < 2; n++) 
                                {
                                   if(styList1[n].getFirstName().startsWith(stylistName))
                                   {  
                                        if(n==0)
                                          feedbacksty1.add(new FeedBack(comment,rate));
                                        else if (n==1)
                                          feedbacksty11.add(new FeedBack(comment,rate)); 
                                          break;
                                   }
                                  
                                   else if(styList2[n].getFirstName().startsWith(stylistName))
                                   {
                                      if(n==0)
                                          feedbacksty2.add(new FeedBack(comment,rate));
                                       else if (n==1)
                                          feedbacksty22.add(new FeedBack(comment,rate)); 
                                      break;
                                    }
                                  else if(styList3[n].getFirstName().startsWith(stylistName))
                                  {
                                      if(n==0)
                                          feedbacksty3.add(new FeedBack(comment,rate));
                                        else if (n==1)
                                          feedbacksty33.add(new FeedBack(comment,rate)); 
                                      break;
                                  }
                                }//end for
                             System.out.println("Thanks for giving us your feedback.. ");
                            }//end if statment
                            
                            
                            else if(salonList2[i].getSalonName().startsWith(salonName))
                            {
                                System.out.println("Write a comment >> ");
                                comment = input.nextLine();
                                input.nextLine();
                                System.out.println("Write a rate >> ");
                                rate = input.nextDouble();
                                
                                
                                for (int n = 0; n < 2; n++) 
                                {
                                   if(styList4[n].getFirstName().startsWith(stylistName))
                                   {
                                      if(n==0)
                                          feedbacksty4.add(new FeedBack(comment,rate));
                                        else if (n==1)
                                          feedbacksty44.add(new FeedBack(comment,rate)); 
                                      break;
                                   }
                                  else if(styList5[n].getFirstName().startsWith(stylistName))
                                  {
                                      if(n==0)
                                          feedbacksty5.add(new FeedBack(comment,rate));
                                        else if (n==1)
                                          feedbacksty55.add(new FeedBack(comment,rate)); 
                                      break;
                                  }
                                  else if(styList6[n].getFirstName().startsWith(stylistName))
                                  {
                                      if(n==0)
                                          feedbacksty6.add(new FeedBack(comment,rate));
                                        else if (n==1)
                                          feedbacksty66.add(new FeedBack(comment,rate)); 
                                      break;
                                }
                            }// end for
                           System.out.println("Thanks for giving us your feedback.. ");
                          }//end else statment 
                        }// end for loop
                    break;
               
               
               
               case 7: 
                        System.out.println("What is your  first name? ");
                        firstName = input.next();
                        System.out.println("What is your number? ");
                        numOfBook = input.nextInt();
                        for (int i = 0; i < booking.size(); i++) 
                        {
                           if(Booking.numberOfBook == numOfBook)
                           {
                               booking.remove(i);
                               System.out.println("Ok your appointment "+d+" are cancelled!!");
                           }
                       }
                break;//end case 6
               
               
               case 8:
                   break;
               
               
               default: System.out.println(" Invalid Choice! ");
               
               
               
               
           }//end switch
           
           
       } while (choice!=8);

        
    
    }//end main
    

public static void Menu(){
    
    System.out.print("\n***********************************************************"
                    + "\n**   What do you want to do?\t\t\t\t **"
                    +"\n**   1. Display all salons\t\t\t\t **"
                    +"\n**   2. Search for salon by name of salon and city.\t **"
                    +"\n**   3. Make an appointment.\t\t\t\t **"
                    +"\n**   4. Make an appointment with your favourite stylist. **"
                    +"\n**   5. write a feedback about salon.\t\t\t **"
                    +"\n**   6. write a feedback about stylist.\t\t\t **"
                    +"\n**   7. Cancel an appointment.\t\t\t\t **"
                    +"\n**   8. Nothing.. thank you.\t\t\t\t **"
                    + "\n***********************************************************"
                    +"\n>>   Your choic is: ");
 }


public static double checkDate( Date d, double price){
    double dif =(d.getTime()-today.getTime())/(1000*60*60*24);  
    
        if (dif >= 2) 
       { System.out.println("Your date "+d+" is successful.."); 
           return price;
       } 
       else if (dif >= 0 && dif < 2) 
       { System.out.println("Sorry You are late. So Should Pay More.. "); 
        return price + (price*30/100);
       } 
       else if (dif < 0) 
       { System.out.println("Opps! We Can't reserve your appointment.");}

  return price;     
}

public static void addCustomer(){
}
}
