package test;


public class Output {

	public static void main (String args[]){
		Output o=new Output();
		try {
			o.go();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void go() throws InterruptedException{
		int z = 0,y=0,k=0;
		for(int x=0;x<8;x++){
//			System.out.print("y+++++==="+ (y++));
			System.out.println("+++++z==="+ (++z) );

			  java.awt.Toolkit.getDefaultToolkit().beep();
			  Thread.sleep(1000);
			k=z;
			System.out.println(" k===z= "+k);
			/*if(x>4)
		System.out.print(++y + " ");
			
			if(y>14){System.out.print(" x = " +x);
			break;}
*/		}
	}
}
