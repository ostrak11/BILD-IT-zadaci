package zadaci_23_08_2016;

/* (The MyInteger class) Design a class named MyInteger. The class contains:
 ■ Anint data field named value that stores the int value represented by this object. 
 ■ A constructor that creates a MyInteger object for the specified int value. 
 ■ A getter method that returns the int value. 
 ■ The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively. 
 ■ The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively. 
 ■ The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively. 
 ■ The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value. 
 ■ A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
 ■ A static method parseInt(String) that converts a string into an int value. 
 
 Draw the UML diagram for the class and then implement the class. Write a client program that tests all methods in the class*/

public class Zad2_MyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kreiranje objekata
		MyInteger my= new MyInteger(66);
		MyInteger my2= new MyInteger(21);
		int num1=17;
		
		
		
		//testiranje metoda na vrijednosti broj (17)
		System.out.println("Number 17 is even: "+ MyInteger.isEven(num1));
		System.out.println("Number 17 is odd: "+ MyInteger.isOdd(num1));
		System.out.println("Number 17 is prime: " + MyInteger.isPrime(num1));
	   
		
		char[] chars = {'5', '6', '9', '1'};
	    System.out.println(MyInteger.parseInt(chars));
	    
	    String s = "7887";
	    System.out.println(MyInteger.parseInt(s));
	    
		
	    //testiranje metoda na objektu
		System.out.println(my.getValue()+" is even: " + my.isEven());
		System.out.println(my.getValue()+ " is odd: "+ my.isOdd());
		System.out.println(my.getValue()+ " is prime: " + my.isPrime());
		System.out.println("Numbers "+my.getValue()+" and " + my2.getValue()+" are equals: "+ my.equals(my2));
		
		
		
		
		
		
	}

}

class MyInteger{
	
	int value;
	
	//kontruktor koji uzima vrijednost
	MyInteger(int value){
		this.value=value;
	}
	
	//getter
	public int getValue(){
		return value;
	}
	
	
	
	//metode za paranu, neparanu ili prostu vrijednost
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return !isEven();
	}
	
	public boolean isPrime() {
		
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	
	
	
	//metode koje uzimaju vrijedost i ispituju da li je parna neparna ili prosta
	public static boolean isEven(int value){
		if (value%2==0){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static boolean isOdd(int value){
		if (value%2!=0){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static boolean isPrime(int value){
		for(int i=2; i<value;i++){
			if (value%i==0){
				return false;
			}
		}
		return true;
		
	}
	
	
	//metode koje ispituju obejkat
	public static boolean isEven(MyInteger MyInt){
		return MyInt.isEven();
	}
	
	
	public static boolean isOdd(MyInteger MyInt){
		return MyInt.isOdd();
	}
	
		
	public static boolean isPrime(MyInteger MyInt){
		return MyInt.isPrime();
	}
	
	
	//metoda za jednakost vrijednosti
	public boolean equals(int value) {
		return this.value == value;
	}

	//metoda za jednakost objekta
	public boolean equals(MyInteger myInteger) {
		return this.value == myInteger.value;
	}

	
	
	//pretvara niz u int
	public static int parseInt(char[] value) {

		double valueDouble = 0;
		int toPower = value.length - 1;
		for (char aValue : value) {

			valueDouble += Math.pow(10, toPower--) * (aValue - '0');
		}

		return (int) valueDouble;
	}

	public static int parseInt(String value) {

		return MyInteger.parseInt(value.toCharArray());
}
	
}
