package activities;

public class Car {	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	public Car(String color,String transmission,int make)
	{
		this.color=color;
		this.transmission=transmission;
		this.make=make;
		this.tyres=4;
	    this.doors=4;
	}
public void displayCharacteristics() {
	System.out.println("The Toyota Car color is:" + color);
	System.out.println("The Toyota Car transmission is:" + transmission);
	System.out.println("The Toyota Car Model is:" + make);
	System.out.println("The Toyota Car tyres is:" + tyres);
	System.out.println("The Toyota Car tyres is:" + doors);
}
public void accelarate() {
   System.out.println("Car is moving forward");
}
public void brake() {
	System.out.println("Car is stopped");
}
}
