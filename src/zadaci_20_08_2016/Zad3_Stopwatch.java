package zadaci_20_08_2016;

/* Design a class named StopWatch. The class contains:
 ■ Private data fields startTime and endTime with getter methods. 
 ■ A no-arg constructor that initializes startTime with the current time.
 ■ A method named start() that resets the startTime to the current time. 
 ■ A method named stop() that sets the endTime to the current time.
 ■ A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.  
   Draw the UML diagram for the class and then implement the class. Write a test program that measures 
   the execution time of sorting 100,000 numbers using selection sort. */

public class Zad3_Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kreiranje objekta
		Stropwatch stopWatch = new Stropwatch();

		// kreiranje niza od 100000 generisanih brojeva
		int[] randomArray = getArray();

		// početak mjerenja vremena, sortiranje i kraj mjerenja
		stopWatch.start();
		selectionSort(randomArray);
		stopWatch.stop();

		// ispis rezultata
		System.out.println("Vrijeme potrebno da se sortira generisani niz od  100,000 je: " + stopWatch.getElapsedTime() +	" milisekundi.");
		
		
	}
	
	//generisanje niza
	public static int[] getArray() {
		
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}
	
	//sortiranje niza
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
} 

}
 class Stropwatch {

	private long startTime;
	private long endTime;
	
	Stropwatch(){
		startTime=System.currentTimeMillis();
	};
	
	//geteri i seteri
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	//pocetno vrijeme
	void start(){
		startTime=0;
	};
	
	//konacno vrijeme
	void stop(){
		endTime=System.currentTimeMillis();
	};
	
	//metoda za potrebno vrijeme
	long getElapsedTime(){
		return endTime-startTime;
	}
}
