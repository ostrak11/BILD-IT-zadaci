package zadaci_26_08_2016;

import java.util.Date;

/*(The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee. 
 * Make Faculty and Staff subclasses of Employee. 
 * A person has a name, address, phone number, and email address. 
 * A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. 
 * An employee has an office, salary, and date hired. 
 * 
 * Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired.
	A faculty member has office hours and a rank. 
	A staff member has a title. 

Override the toString method in each class to display the class name and the person’s name. 

raw the UML diagram for the classes and implement them. Write a test program that creates a Person, Student, Employee, Faculty, and Staff, 
and invokes their toString() methods. */

public class Zad2_Stuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				// kreiranje i printanje obejekata raznih klasa
				Person p1 = new Person("Mujo", "negdje", "557-255",
						"mujonamjesecu@yahooo.com");
				System.out.println(p1);
				
				Student s1 = new Student("Fata", "Pofalici", "058-559",
						"fatima@hotmail.com", 2);
				System.out.println(s1);
			
				Employee e1 = new Employee("Suljo", "Meše", "123-856",
						"suljke@yahoo.com", "Goli Otok", 8000);
				System.out.println(e1);
				
				Faculty f1 = new Faculty("Meho", "ggmu", "013-415",
						"mehac@gmail.com", "fff", 1700, 20, "gggn");
				System.out.println(f1);
				
				Staff staff1 = new Staff("Nikos", "Bezvezes", "053-741",
						"nikos@hotmail.com", "Zutla", 1100, "mssger");
				System.out.println(staff1);

				
	}

}

class Person{
	
	//varijable
	private String name;
	private String adress;
	protected static String phone;
	protected static String mail;
	
	
	//konstruktori
	Person() {
	}

	public Person(String name) {
		this.name= name;
	}

	Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.adress = address;
		this.phone = phoneNumber;
		this.mail = email;
	}

	
	// getter i setter metode za varijable
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String address) {
		this.adress = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phone = phoneNumber;
	}

	public String getEmail() {
		return mail;
	}
	
	public void setEmail(String email) {
		this.mail = email;
	}

	// to String metoda
	public String toString() {
		return String.format
				( "\tName: %s\n"
				+ "\tEmail: %s\n"
				+ "\tPhone: %s\n"
				+ "\tAdress: %s\n"
				, this.name
				, this.mail
				, this.phone
				, this.adress
				);
	}
}

class Student extends Person{
	
	//varijabla status sa konstantnim vrijednostima
	private final static String[] STATUS = { "freshman", "sophomore",
		"junior", "senior" };
	private String status = STATUS[0];

	//konstruktori
	Student() {

	}

	public Student(String name, String address, String phoneNumber,
			String emailAddress, int status) {
	super(name, address, phoneNumber, emailAddress);
	this.status = STATUS[status];
	}

	// getteri i setteri
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//to String metoda
	public String toString() {
		return String.format
				( "%s"
				+ "\tStudent status: %s\n"
				, super.toString()
				, this.status
				);
	}
	
}

class Employee extends Person{
	
	//varijable
	String office;
	int salary;
	Date dateHired;

	//konstruktori
	Employee() {

	}

	public Employee(String name, String address, String phoneNumber,
			String emailAddress, String office, int salary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}

	// getteri i setteri
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = new Date();
	}
	
	//to string metoda
	public String toString() {
		return String.format
				( "%s"
				+ "\tOffice: %s\n"
				+ "\tSalary: %s\n"
				+ "\tDate hired: %s\n"
				, super.toString()
				, this.office
				, this.salary
				, this.dateHired.toString()
				);
		}
	
}

class Faculty extends Employee{
	
	int officeHours;
	String rank;

	Faculty() {

	}

	public Faculty(String name, String address, String phoneNumber,
			String emailAddress, String office, int salary, int officeHours,
			String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public int getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	// toString metoda
	public String toString() {
		return String.format
				( "%s"
				+ "\tOffice hours: %d\n"
				+ "\tRank: %s\n"
				, super.toString()
				, this.officeHours
				, this.rank
				);
	}
}

class Staff extends Employee{
	
	String title;

	Staff() {

	}

	
	public Staff(String name, String adress, String phoneNumber,
			String emailAddress, String office, int salary, String title) {
		super(name, adress, phone, mail, office, salary);
		this.title = title;
	}

	
	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	// toString metoda
	public String toString() {
		return String.format
				( "%s"
				+ "\tTitle: %s\n"
				, super.toString()
				, this.title
				);
	}
	
}