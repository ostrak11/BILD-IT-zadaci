package zadaci_23_08_2016;

/* (The Time class) Design a class named Time. The class contains:
 ■ The data fields hour, minute, and second that represent a time. 
 ■ A no-arg constructor that creates a Time object for the current time. 
 	(The values of the data fields will represent the current time.) 
 ■ A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. 
 	(The values of the data fields will represent this time.) 
 ■  A constructor that constructs a Time object with the specified hour, minute, and second. 
 ■ Three getter methods for the data fields hour, minute, and second, respectively. 
 ■ A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. 
 For example, if the elapsed time is 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10. 
 
 Draw the UML diagram for the class and then implement the class. Write a test program that creates two Time objects (using new Time() and new Time(555550000)) 
 and displays their hour, minute, and second in the format hour:minute:second. 
 
 (Hint: The first two constructors will extract the hour, minute, and second from the elapsed time. For the no-arg constructor, 
 the current time can be obtained using System.currentTimeMillis(), as shown in Listing 2.7, ShowCurrentTime.java.)*/

public class Zad1_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kreiranje objekata i pozivanje metoda
		Time time1= new Time();
		Time time2= new Time(555550000);
		
	
		System.out.println(time1.toString());
		System.out.println(time2.toString());
		
		
	}

}

class Time{
	//varijable	
	private long hour;
	private long minute;
	private long second;
	
	//konstruktor koji vraca trenutno vrijeme
	Time(){
		long totalMilliSeconds=System.currentTimeMillis();
        long totalSeconds=totalMilliSeconds/1000;
        second=(int)(totalSeconds%60);
        long totalMinutes=totalSeconds/60;
        minute=(int)(totalMinutes%60);
        long totalHours=totalMinutes/60;
        //+2 radi GMT zone
        hour=(int)(totalHours%24)+2;
	}
	
	//kontruktor za proteklo vrijeme
	Time(long elapsedTime){
		long totalSeconds = elapsedTime / 1000;
	    second = (int)(totalSeconds % 60);
	    long totalMinutes = totalSeconds / 60;
	    minute = (int)(totalMinutes % 60);
	    int totalHours = (int)(totalMinutes / 60);
	    hour = (totalHours % 24);
	}
	
	Time(int hour, int minute, int second){
		 this.hour = hour;
	     this.minute = minute;
	     this.second = second;
	}
	//getter metode
	public long getHour() {
	    return this.hour;
	}

	public long getMinute() {
	    return this.minute;
	}

	public long getSecond() {
		return this.second;
	}
	
	//metoda za setovanje proteklog vremena
	public void setTime(long elapseTime){
		second = (int) (elapseTime / 1000) % 60 ;
	    minute = (int) ((elapseTime / (1000*60)) % 60);
	    hour   = (int) ((elapseTime / (1000*60*60)) % 24);
	}
	
	//ispis vremena
	public String toString(){
	       return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	   }
}
