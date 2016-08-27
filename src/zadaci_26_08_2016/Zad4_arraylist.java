package zadaci_26_08_2016;

import java.util.ArrayList;

/* (UseArrayList) Write a program that creates an ArrayList and adds a Loan object, a Date object, a string, and a Circle object to the list
 * , and use a loop to display all the elements in the list by invoking the object’s toString() method. */

public class Zad4_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//kreiranje objekata razlicitih klasa
				Loan loan = new Loan (10);
				Date date = new Date();
				Circle circle = new Circle(5.5);
				
				
				ArrayList <Object> list = new ArrayList<>();
				
				//dodavanje objekata
				list.add(loan);
				list.add(date);
				list.add(circle);
				
				//printanje objekata
				for (int i=0; i<list.size(); i++){
					
					System.out.println(list.get(i).toString());
				}
		
		}

}


class Loan{

	private double interest;
	
	//konstruktori
	Loan(){
		
	}
	
	Loan(double interest){
		this.interest=interest;
	}

	//print objekta
	@Override
	public String toString() {
		return "Loan [interest=" + interest + "]";
	}
	
}

class Date{
	
	private java.util.Date date;
	//konstruktor
	Date(){
		date = new java.util.Date(); 
	}
	
	//getter
	public java.util.Date getDate() {
		return date;
	}

	
	//print objekta
	@Override
	public String toString() {
		return "Date [date=" + getDate() + "]";
	}
}


class Circle{
	
	private double radius;
	
	//konstruktori
	Circle(){
		
	}
	
	Circle(double radius){
		this.radius=radius;
	}
	
	//getter i setter
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//print objekta
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}