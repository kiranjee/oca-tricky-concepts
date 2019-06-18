import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Diamond extends BaseClass implements BaseInterface//,Interface1, Interface2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//new Diamond().foo();
		new Diamond().foo2();
	}
}

/*interface Interface1 {
	default public void foo() { System.out.println("Interface1's foo"); }
}
interface Interface2 {
	default public void foo() { System.out.println("Interface2's foo"); }
}*/

class BaseClass {
	public void foo2() { System.out.println("BaseClass's foo"); }
}
interface BaseInterface {
	default public void foo2() { System.out.println("BaseInterface's foo"); }
}
