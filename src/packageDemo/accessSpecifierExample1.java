
package packageDemo;
import javaBasic.accessSpecifierExample2; //You have to import to import classes from other packages if you need to do classes on public you must have to use import statement 
public class accessSpecifierExample1 {
	public static void main(String[] args) {
		accessSpecifierExample2 e1=new accessSpecifierExample2();
		System.out.println(e1.height); 
		
		//Below attributes are not available because of the access issue 
/*		System.out.println(e1.name);  
		System.out.println(e1.age);
		System.out.println(e1.religion);  */
		
	}
}
