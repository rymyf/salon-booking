
package projectcs111;


public class City 
{
    
   private String name;
   private Salons [] salons;

    public City(String name, Salons[] salons) {
        this.name = name;
        this.salons = salons;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salons[] getS() {
        return salons;
    }

    public void setS(Salons[] salons) {
        this.salons = salons;
    }

    
     public String returnSalons(){
         
  
         String s =" ";
       for(int i = 0 ; i < salons.length ; i++) 
           s = s+"\n\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"|                                             "+"Salon #"+(i+1)+"                                                        |\n"
                +""+salons[i];
           
       return s;  
     }
        
    
    
    
    @Override
    public String toString() {
        return "\n   City   < " + name +" >\n"+ returnSalons();
    }
   
     
}
