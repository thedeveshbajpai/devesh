package overriding_data_types;

import java.io.IOException;
 class Bike {
	protected int speedlimit = 90;

	public Bike() throws IOException{
		System.out.println("This is Bike Constructor!");
	}

	protected void overridingMethod() throws RuntimeException{
		//TODO:nothing heress
		System.out.println("Bike.overridingMethod()");
	}
}

