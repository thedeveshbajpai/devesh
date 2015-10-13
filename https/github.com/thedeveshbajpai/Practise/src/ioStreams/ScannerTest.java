/**
 *
 */
package ioStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author dbajpai
 *
 */
public class ScannerTest {


		public static void main(String args[]){
			Scanner s;
			Double d = 0.0;
			try {
				s=new Scanner(new FileReader(new File("infile.txt")));

				while(s.hasNext()){
					if(s.hasNextDouble())
						d=d+s.nextDouble();
					System.out.println("Sum= "+d);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

}
