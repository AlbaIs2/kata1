package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
       Person person = new Person("Gabriel",new Date(95,0,14)) ; 
       System.out.println(person.get + "tiene" + person.getAge()+ "años");
       
    }
}
