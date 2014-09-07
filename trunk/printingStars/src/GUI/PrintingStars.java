/**
 *
 */
package GUI;

/**
 * @author dbajpai
 *
 */
public class PrintingStars {

	/**
	 * @param args
	 */
	static int z=0;
	public static void main(String[] args) {
		for(int i=5;i>0;i--){
			z=i;
			for(int j=0;j<i;j++){
				while(z-5<0){
					System.out.print(" ");
					z++;
				}
				System.out.print("*");
			}System.out.println("\n");
		}
	}

}
