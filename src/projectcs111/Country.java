
package projectcs111;


public class Country 
{
    
 private String name ;
 private City [] city ;

    public Country(String name, City[] city) {
        this.name = name;
        this.city = city;
    }

    public Country() {
    }
    
    
    
    public City[] getCity() {
        return city;
    }

    public void setCity(City[] city) {
        this.city = city;
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", city=" + city + '}';
    }
 
 

}
