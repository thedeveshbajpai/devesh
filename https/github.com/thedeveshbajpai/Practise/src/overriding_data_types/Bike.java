package overriding_data_types;
import java.lang.*;
import java.lang.*;
class Bike {
	int speedlimit = 90;
}

class Honda3 extends Bike {
	int speedlimit = 150;

	public static void main(String args[]) {
		Bike obj = new Honda3();
		System.out.println(obj.speedlimit);// 90
	}
}