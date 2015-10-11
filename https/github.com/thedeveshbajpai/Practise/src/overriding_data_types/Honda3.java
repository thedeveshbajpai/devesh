package overriding_data_types;
import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.cos;

import java.io.FileNotFoundException;
 class Honda3 extends Bike {

	public Honda3() throws FileNotFoundException {
		System.out.println("This is Bike Constructor!");
	}
	protected int speedlimit = 150;

	protected void overridingMethod(){
		//TODO:nothing heress
		System.out.println("Honda3.overridingMethod()");
		super.overridingMethod();
	}
	public static void main(String args[]) throws Exception {
		Bike obj =  new Honda3();
		System.out.println(obj.speedlimit);// 90
		System.out.println("PI*Exp="+cos(PI * E));
		obj.overridingMethod();
		throw new Exception();
	}
}