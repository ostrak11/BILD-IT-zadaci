package zadaci_23_08_2016;

/* (The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains:
 ■ The data fields x and y that represent the coordinates with getter methods. 
 ■ A no-arg constructor that creates a point (0, 0). 
 ■ A constructor that constructs a point with specified coordinates. 
 ■ A method named distance that returns the distance from this point to a specified point of the MyPoint type. 
 ■ A method named distance that returns the distance from this point to another point with specified x- and y-coordinates. 
 
 Draw the UML diagram for the class and then implement the class. Write a test program that creates the two points (0, 0) and (10, 30.5) 
 and displays the distance between them. */

public class Zad3_MyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kreiranje objekata
		MyPoint point1= new MyPoint(0,0);
		MyPoint point2= new MyPoint(10, 30.5);
		
		//ispis rezultata
		System.out.println("Distance between point1(" + point1.getX() + ", " + point1.getY() + ") and point2 "
				+ "(" + point2.getX() + ", " + point2.getY() + ") is "+ point1.distance(point2));
	}

}

class MyPoint{
	
	//varijable
	double x;
	double y;
	
	//no-arg konstruktor sa default vrijednostima
	MyPoint(){
		x=0;
		y=0;
	}
	
	//kostruktor sa vrijednostima x i y
	MyPoint(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	//getteri za koordinate
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	//metoda za racunanje udaljenosti između tacaka
	public double distance(double x2, double y2) {
		return Math.sqrt((Math.pow((x - x2), 2) + Math.pow((y - y2), 2)));
	}
	
	
	//Metoda koja vraca udaljenost izmedju posmatrane tacke i objekta
	public double distance(MyPoint obj) {
		return Math.sqrt(Math.pow(this.x - obj.getX(), 2) + Math.pow(this.y - obj.getY(), 2));
}
	
	
	
}
