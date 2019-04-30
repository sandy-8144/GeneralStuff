package com.programming.general.stuff;

public enum EnumWithoutConstant  {

	;
	
	public static String myName() {
		return "sandeep";
	}
	
	public static void main(String [] args) {
	
		System.out.println(EnumWithoutConstant.myName());
		
		EnumStuff e = null;
		if(e==EnumStuff.DEV)
			System.out.println("hi....");
	}
}
