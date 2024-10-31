package javaBasic;

public class StringNStringBuilder {

	
	public static void main(String[] args) {
		
		//3 ways to create string
		String s1 = new String();
		s1 = "Asim";
		String s2 = "Asim2";
		String s3 = new String("Asim3");
		System.out.println(s1+" "+s2+" "+s3);
		
		//Generally strings are immutable that means we have to store string modifications in a new variable
		s1.toUpperCase();
		System.out.println(s1);  //no changes occured
		String s1Modified = s1.toUpperCase(); //saved modified string in a new variable
		System.out.println(s1Modified);  
		
		System.out.println("---------------------------------------\nS T R I N G   B U I L D E R   C L A S S\n---------------------------------------");
		//StringBuilder class
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Asim4");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		//Strings created using string builder class are mutable that means if we modify a string we don't need to store the modified string in a new variable 
		sb1.append(" Asim");
		System.out.println(sb1);
		
		System.out.println("------------------------\nT E X T    B L O C K S\n------------------------");
		// String written within """ text """ Quote Behaves as text block and we don't need to write \n to make new line
		String textBlock1 = """
				Hello
				Asim
				Here""";
		
	}
}
