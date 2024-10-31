package javaBasic;

public enum EnumExample {
	ENUMEX1, ENUMEX2, ENUMEX3,ENUMEX4	
}

//Enumerations are group of named constants which implicitly extend java.lang.Enum class 
//Enum fields are implicitly static final 
// syntax: public enum enum_name { constant1, constant2, constant3, ..., constant n}
//Enums are considered as reference types like classes and interfaces in Java and hence the programmer can define constructors, methods and variables inside them 
//Static method called values() is automatically generated by the compiler for each enum, the values method returns an array of all the constant values defined inside the enum

