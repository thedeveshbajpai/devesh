package reflection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
/*
 * First, to find the main() method the code searches for a class with the name "main" with a single parameter that is an
 * array of String Since main() is static, null is the first argument to Method.invoke(). The second argument is the array
 * of arguments to be passed.

$ java InvokeMain Deet Deet ja JP JP
invoking Deet.main()
invoking testDeet()
Locale = Japanese (Japan,JP),
ISO Language Code = jpn
testDeet() returned true*/
public class InvokeMain {
    public static void main(String... args) {
	try {
	    Class<?> c = Class.forName(args[0]);
	    Class[] argTypes = new Class[] { String[].class };
	    Method main = c.getDeclaredMethod("main", argTypes);
  	    String[] mainArgs = Arrays.copyOfRange(args, 1, args.length);
	    System.out.format("invoking %s.main()%n", c.getName());
	    main.invoke(null, (Object)mainArgs);

        // production code should handle these exceptions more gracefully
	} catch (ClassNotFoundException x) {
	    x.printStackTrace();
	} catch (NoSuchMethodException x) {
	    x.printStackTrace();
	} catch (IllegalAccessException x) {
	    x.printStackTrace();
	} catch (InvocationTargetException x) {
	    x.printStackTrace();
	}
    }
}