package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car Toyota=new Car("Blue","Fast",2020);
		Car BMW=new Car("Grey","Awesome", 2021);
		Toyota.displayCharacteristics();
		Toyota.accelarate();
		Toyota.brake();
		BMW.displayCharacteristics();
		BMW.accelarate();
		BMW.brake();
	}

}
