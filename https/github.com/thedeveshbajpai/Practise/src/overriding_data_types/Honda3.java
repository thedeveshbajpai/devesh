package overriding_data_types;
 class Honda3 extends Bike {
	protected int speedlimit = 150;

	protected void overridingMethod(){
		//TODO:nothing heress
		System.out.println("Honda3.overridingMethod()");
	}
	public static void main(String args[]) {
		Bike obj = new Bike();
		System.out.println(obj.speedlimit);// 90

	}
}