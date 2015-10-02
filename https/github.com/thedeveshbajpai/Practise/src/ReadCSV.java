import java.io.*;
import java.util.*;

public class ReadCSV{
public static void main(String args[]){
try{
int row = 0;
int col = 0;
String[][] numbers=new String[24][24];

File file = new File("c:/exports/data.csv");
if(file.exists()){
System.out.println("File Exists");
}
BufferedReader bufRdr;
bufRdr = new BufferedReader(new FileReader(file));
String line = null;

while((line = bufRdr.readLine()) != null){
StringTokenizer st = new StringTokenizer(line,",");
col=0;
while (st.hasMoreTokens()){
numbers[row][col] = st.nextToken();
System.out.print(numbers[row][col]+"\n");
col++;
}
System.out.println();
row++;
}
bufRdr.close();
}

catch (FileNotFoundException e)
{
e.printStackTrace();
}
catch(Exception e)
{
System.out.println("The following error accurred"+e);
}

}

}