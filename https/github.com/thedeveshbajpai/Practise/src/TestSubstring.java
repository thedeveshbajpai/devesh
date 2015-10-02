import java.util.Locale;

public class TestSubstring{
 public static void main(String args[]){
   String s="0123456789";
    s="Sachin Tendulkar";
    String j=String.format(Locale.GERMANY, "the total amount is %+3.5f", 10.123,12);
    System.out.println("Format== "+j);
   System.out.println(s.substring(7));//Tendulkar
   System.out.println(s.substring(0,6));//Sachin
 }
}