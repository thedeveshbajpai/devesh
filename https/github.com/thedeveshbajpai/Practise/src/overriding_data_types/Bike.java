package overriding_data_types;

import java.io.FileNotFoundException;
 class Bike {
	protected int speedlimit = 90;

	public Bike() throws IndexOutOfBoundsException, FileNotFoundException{
		System.out.println("This is Bike Constructor!");
	}

	protected void overridingMethod() throws RuntimeException, Exception{
		//TODO:nothing heress
		System.out.println("Bike.overridingMethod()");
	}
	void logging(){}
	void fun(){}
	public int java(){
		return 2;
	}
}

