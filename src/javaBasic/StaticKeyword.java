package javaBasic;

import org.w3c.dom.css.Counter;

public class StaticKeyword {
	
/*
Static keyword it used to make a member belong to class note to any individual objects 
We can have static variables, static methods and static blocks 
Starting variables are class level variables that are used to keep a value across all the instances of a class they are initialized when the class gets loaded 
Static methods are class level methods that can be called without any instance of the class they can be called into class name or simply by method name 
 */


	
	//instance and static variable
	 int counter1 = 0;
	 static int counter2 = 0;  //this value will be replaced by static block counter2 value see at the bottom
	
	 //constructor
	public StaticKeyword(){
		counter1++;   //will always remain 1 for each object created because it's not static
		counter2++;	  //will increase by one for each new object created because it's static and shared by all the objects
	}
	
	//non static method
	void displayCounters1() {
		System.out.println("counter1 : "+counter1+" counter2 : "+ counter2);  //non static method can access both static and non static variable 
	}
	
	//static method
	static void displayCounters2() {
		//System.out.println("counter1 :"+counter1);	//We cannot access non static variable in static method because Static method does not belong to any object and it does not know a member of which object we are trying to access 
		System.out.println("counter2 : "+ counter2);	
	}
	
	public static void main(String[] args) {
		System.out.println("Main method execution started");
		StaticKeyword sk1 = new StaticKeyword();
		sk1.displayCounters1();  //We cannot call non-static method without creating object of the class 
		StaticKeyword sk2 = new StaticKeyword();
		sk2.displayCounters1();
		StaticKeyword sk3 = new StaticKeyword();
		sk3.displayCounters1();
		
		displayCounters2(); //Static method can be called without creating object of the class 
		displayCounters2();
	}
/*
 	Static block is special type of block in Java which gets executed in the class is loaded in JVM.
 	static block is used for initializing static variables. Compilation error of course we try to initialize non-static variable in static block 
 	Static block will get executed when an object is created or when first time a static member of the class is accessed 
 	A class can have multiple static blocks and they are executed in the sequence they are written 
 	Static block cannot return a value 
 	Keywords like this and Super cannot be used inside static block 
 	
 */
	static {
		//counter 1 = 2	  //can't initialize non-static variable in static block
		counter2 = 3;
		System.out.println("static blocks get executed even before main method");
	}
	
}
