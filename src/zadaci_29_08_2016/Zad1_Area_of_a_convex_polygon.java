package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* A polygon is convex if it contains any line segments that connects two points of the polygon.
 *  Write a program that prompts the user to enter the number of points in a convex polygon, 
 *  then enter the points clockwise, and display the area of the polygon. */

public class Zad1_Area_of_a_convex_polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		ArrayList<Double> coordinates = new ArrayList<>();
		
		boolean isTrue = true;
		
		/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
		do{
			//try blok koji provjerava unos
			try{
		
				// unos broja tacaka koordinata
				System.out.println("Unesite broj koordinata koje predstavljaju vrhove poligona:");
				int numPoints = in.nextInt();
		
				System.out.println("Unesite koordinate:");
				// for petlja ide za unos koordinata tacaka (numPoints*2)
				for (int i=0; i<numPoints*2; i++){
					coordinates.add(in.nextDouble());
				}
				isTrue=false;
				System.out.println("Povrsina poligona je: "+ areaOfPolygon(coordinates));
			}
			catch (InputMismatchException e) {
			    System.out.println("Pogresan unos, pokusajte ponovo!!!"); 
			    in.nextLine();
			
			}
		}while(isTrue);
			
		in.close();
		
	}

	public static double areaOfPolygon(ArrayList<Double> coordinates){
		
		double sum1=0;	
		double sum2=0;	
	 
		//formula za racunanje poligona
		// 1/2 * | [ (x1*y2 +x2*y3 + ..+xn*y1) - (y1*x2 + y2*x3+...+yn*x1)] |
		
		for (int i=0; i<coordinates.size()-3; i+=2){
			
			sum1+= coordinates.get(i)*coordinates.get(i+3); //i -0 element [x1] , i+3 -3 element [y2]
		    sum2+= coordinates.get(i+1)*coordinates.get(i+2); //i+1 -1 elemenat [y1], i+2- 2 elemenat [x2]
		}
	  
		// dodavanje zadnjeg Xn koji mnozi prvi Y1
		sum1+=(coordinates.get(coordinates.size()-2) *coordinates.get(1) );
		//dodavanje zadnjeg Yn koji mnozi prvi X1
		sum2+=(coordinates.get(coordinates.size()-1) *coordinates.get(0) );
	
	  // povrsina je 1/2 * |sum1-sum2|
	  double area =(Math.abs(sum1-sum2))/2;
	  
	  
	  return area;
			
}
}
