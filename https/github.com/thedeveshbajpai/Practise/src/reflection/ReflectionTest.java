package reflection;

import java.util.HashSet;
import java.util.Set;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		byte[] bytes = new byte[1024];
		Class c = bytes.getClass();
		System.out.println("ReflectionTest.main()"+c.getClass());

		Set<String> s = new HashSet<String>();
		System.out.println("ReflectionTest.main()"+ s.getClass());

		Class d = int[][][].class;
		@SuppressWarnings("rawtypes")
		Class e = int[][][].class;

		Class cDoubleArray = Class.forName("[D");

		Class cStringArray = Class.forName("[[Ljava.lang.String;");
		System.out.println(cDoubleArray.getName().getClass()+"\n"+cStringArray.getName().getClass());
	}

}
