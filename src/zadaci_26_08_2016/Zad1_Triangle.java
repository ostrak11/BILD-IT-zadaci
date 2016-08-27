package zadaci_26_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:
 ■ Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
  ■ A no-arg constructor that creates a default triangle. 
  ■ A constructor that creates a triangle with the specified side1, side2, and side3. 
  ■ The accessor methods for all three data fields. 
  ■ A method named getArea() that returns the area of this triangle. 
  ■ A method named getPerimeter() that returns the perimeter of this triangle. 
  ■ A method named toString() that returns a string description for the triangle. For the formula to compute the area of a triangle, 
  see Programming Exercise 2.19. The toString() method is implemented as follows:
	return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; 
	
Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes. Write a test program that prompts the user to enter three sides 
of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. The program should create a Triangle object with these sides and 
set the color and filled properties using the input. The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not. */

public class Zad1_Triangle {
	
	static Scanner unos= new Scanner(System.in);
	
	public static double provjera() {
		
		double broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera 
			try {
				broj = unos.nextDouble();	
				//uslov je da broj mora biti 0,1 ili 2
				
				provjera = false;									
				
			}
			//hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {	
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unos stranica trougla i kreiranje objekta
		System.out.println("Unesite stranice trougla: ");
		System.out.println("Unesite vrijednost prve stranice: ");
		double side1=provjera();
	    
		System.out.println("Unesite vrijednost druge stranice: ");
		double side2=provjera();
		
		System.out.println("Unesite vrijednost trece stranice: ");
		double side3=provjera();
	        	
	    Triangle trougao = new Triangle(side1, side2, side3);
		
	   //postavka da li je trugao ispunjen ili ne i postavka
	   System.out.println("Unesite 'true' ako je trougao ispunjen!!!");
	   String isFilledString = unos.next();
	   boolean isFilled = (isFilledString.equals("true"));
	   trougao.setFilled(isFilled);
		
		//unos boje trugla i postavka
	   System.out.println("Unesite boju trougla: ");
	   String color = unos.next();
	   trougao.setColor(color);

	   //ispis
	   System.out.println("Trougao ima slijedece karakteristike: ");
	   System.out.println("Povrsina: " + trougao.getArea());
	   System.out.println("Obim: " + trougao.getPerimeter());
	   System.out.println("Boja: " + trougao.getColor());
	   System.out.println("Ispunjenost?: " + trougao.isFilled());
	
	   unos.close();
	}

}

class Triangle extends GeometricObject{
	
	//varijable
	double side1;
	double side2;
	double side3;
	
	//konstruktori
	Triangle(){
		 side1=1;
		 side2=1;
		 side3=1;
	}
	Triangle(double a, double b, double c){
		side1=a;
		side2=b;
		side3=c;
	}
	
	
	//getteri
	double getSide1(){
		return side1;
	}

	double getSide2(){
		return side2;
	}
	
	double getSide3(){
		return side3;
	}
	
	//metoda za izracunavanje povrsine
	double getArea(){
		double s = getPerimeter()/2;
		return Math.sqrt(s * (s - side1)*(s - side2)*(s - side3));
	}
	
	//metoda za izracunavanje obima
	double getPerimeter(){
		return side1+side2+side3;
	}
	
	//toString metoda
	public String toString() {
		return "Triangle:side1= " + side1 + " side2= " + side2 + "side3= " + side3;

	}
	
}

class GeometricObject {
	
	//klasne varijable
	private String color;
	private boolean filled = false;
	private java.util.Date dateCreated;
	
	//konstruktori
	public GeometricObject() {
		this("white");
	}
	
	public GeometricObject(String color) {
		dateCreated = new java.util.Date();
		this.color = color;
	}
	
	//getteri i setteri
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}
	
	@Override
	public String toString() {
		return "Kreirano " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
}
	
}