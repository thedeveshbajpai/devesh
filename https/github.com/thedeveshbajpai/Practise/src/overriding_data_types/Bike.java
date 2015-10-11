package overriding_data_types;

import java.io.FileNotFoundException;
 class Bike {
	protected int speedlimit = 90;

	public Bike() throws IndexOutOfBoundsException, FileNotFoundException{
		System.out.println("This is Bike Constructor!");
	}

	protected void overridingMethod() throws RuntimeException{
		//TODO:nothing heress
		System.out.println("Bike.overridingMethod()");
	}
}

