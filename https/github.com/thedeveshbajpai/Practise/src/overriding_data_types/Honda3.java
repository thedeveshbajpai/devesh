package overriding_data_types;
import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.cos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
 class Honda3 extends Bike {

	public Honda3() throws FileNotFoundException {
		System.out.println("This is Bike Constructor!");
	}
	protected int speedlimit = 150;

	protected void overridingMethod(){
		//TODO:nothing heress
		System.out.println("Honda3.overridingMethod()");
		try {
			super.overridingMethod();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]) throws Exception {
		Bike obj =  new Honda3();
		System.out.println(obj.speedlimit);// 90
		System.out.println("PI*Exp="+cos(PI * E));
		obj.overridingMethod();
       		obj.logging();
	}
	public void logging(){
	try {
	    Handler handler = new FileHandler("OutFile.log");
	    Logger.getLogger("").addHandler(handler);
	    throw new IOException();

	} catch (IOException e) {
	    Logger logger = Logger.getLogger("package.name");
	    StackTraceElement elements[] = e.getStackTrace();
	    for (int i = 0, n = elements.length; i < n; i++) {
	        logger.log(Level.INFO, elements[i].getMethodName());
	    }
	}
	}
}