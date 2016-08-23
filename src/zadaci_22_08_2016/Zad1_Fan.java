package zadaci_22_08_2016;

/* Design a class named Fan to represent a fan. The class contains:  
 * ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed. 
 * ■ A private int data field named speed that specifies the speed of the fan (the default is SLOW). 
 * ■ A private boolean data field named on that specifies whether the fan is on (the default is false). 
 * ■ A private double data field named radius that specifies the radius of the fan (the default is 5). 
 * ■ A string data field named color that specifies the color of the fan (the default is blue). 
 * ■ The accessor and mutator methods for all four data fields. 
 * ■ A no-arg constructor that creates a default fan. 
 * ■ A method named toString() that returns a string description for the fan. If the fan is on, the method returns the fan speed, color, and radius in one combined string. 
 * 			If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string. 
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test program that creates two Fan objects.
 * Assign maximum speed, radius 10, color yellow, and turn it on to the first object. Assign medium speed, radius 5, color blue, and turn it off to the second object. 
 * Display the objects by invoking their toString method. */

public class Zad1_Fan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kreiranje objekata
		Fan fan1= new Fan();
		Fan fan2= new Fan();
		
		//dodjeljivanje svojstava objektima
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		
		//ispis
		System.out.println("Karakteristike objekta fan1: "+ fan1.toString());
		System.out.println("Karakteristike objekta fan2: "+ fan2.toString());
		
	}

}

class Fan{
	//kreiranje varijabli
	final int SLOW=1;
	final int MEDIUM=2;
	final int HIGH =3;
	
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	String color= "blue";
	
	//geteri seter metode
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int newspeed) {
		if(newspeed!=1 || newspeed!=2 || newspeed!=3){
			System.out.println("Morate unijeti vrijednosti 1, 2 ili 3!!!");
		}else{
				speed=newspeed;
		}
	}
	
	public boolean getOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newradius) {
		 if(newradius < 0){
	            System.out.println("Radius mora biti veci od 0!!!!");
		 }else {
			 radius = newradius;
		}
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//defoltni konstruktor
	Fan(){
		 speed=SLOW;
		 on=false;
		 radius=5;
		 color= "blue";
	}
	
	//metoda tostring
	public String toString(){
		if(getOn()){
			return "Fan speed is: " + getSpeed() +
					". Fan color is: "+getColor()+ 
					". Fan radius is: " + getRadius();
		}else{
			return "Fan color is: "+getColor()+
					". Fan radius is: " + getRadius() +
					". Fan is off .";
		}
	}
}
