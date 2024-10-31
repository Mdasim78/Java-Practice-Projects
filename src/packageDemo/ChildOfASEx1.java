package packageDemo;

import javaBasic.accessSpecifierExample2;

public class ChildOfASEx1 extends accessSpecifierExample2 {
	public static void main(String[] args) {
	
		ChildOfASEx1 e1 = new ChildOfASEx1();  //**** to access the protected variable we have to create object of child class
		System.out.println(e1.height); 
		
		//System.out.println(e1.name);  
	    //System.out.println(e1.age);
		System.out.println(e1.religion); 
		
	}
}
