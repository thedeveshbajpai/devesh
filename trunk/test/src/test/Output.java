/*
 * the program here is to test the increment/decrement operatpor
 * 
 * @
 * */
//@type name = new type(arguments);
package test;


public class Output {

	public static void main (String args[]){
		Output o=new Output();
		try {
			o.go();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void go() throws InterruptedException {
		int z = 0, y = 0, k = 0;
		for (int x = 0; x < 8; x++) {

			System.out.println("+++++z===" + (++z));
			System.out.println("zzzzz="+z);
			System.out.println("k++++++" + (k++));
			System.out.println("kkkkkk"+k);
//			System.out.println("y=z"+(y=z));
//			System.out.println("y=k"+(y=k));
			java.awt.Toolkit.getDefaultToolkit().beep();
			Thread.sleep(1000);
		}
	}
}
