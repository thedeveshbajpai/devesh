package overriding_data_types;
import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.cos;
 class Honda3 extends Bike {
	protected int speedlimit = 150;

	protected void overridingMethod(){
		//TODO:nothing heress
		System.out.println("Honda3.overridingMethod()");
		super.overridingMethod();
	}
	public static void main(String args[]) {
		Bike obj = (Honda3) new Honda3();
		System.out.println(obj.speedlimit);// 90
		System.out.println("PI*Exp="+cos(PI * E));
		obj.overridingMethod();
	}
}