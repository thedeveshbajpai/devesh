
public class stringEqualityTest {

	public stringEqualityTest() {
		super();
	}

	public static void main(String[] args) {

		String str1="chekIt";
		String str2=new String("chekIt");
		String str3="chekIt";
		System.out.println("str1==str2 =  "+(str1==str2.intern()));
		System.out.println("str1.equals.str2 = "+(str1.equals(str2)));
		System.out.println("str1==str3 =  "+(str1==str3));
		System.out.println("str1.equals.str3 = "+(str1.equals(str3)));
	}

}
