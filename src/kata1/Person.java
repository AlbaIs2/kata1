
package kata1;

import java.util.Calendar;    
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private static final long MILISECOND_PER_YEAR = (long)(1000*60*60*24*365.25) ;

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
  public int getAge(){
      Calendar today = GregorianCalendar.getInstance();
      return (int)(miliSecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
  }
  private long miliSecondsToYear(long milles){
      return milles / MILISECOND_PER_YEAR;
  }
}
