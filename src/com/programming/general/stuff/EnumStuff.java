package com.programming.general.stuff;

import java.util.EnumSet;
import java.util.Set;

public enum EnumStuff {
  
	TEST("test"){
		
		public String getCustomName() {
			
			return "testing..";
		}
	},
	DEV("dev") {
      public String getCustomName() {
			
	return "dev integration..";
		}
		
	},
	
	PROD("prod") {
	      public String getCustomName() {
				
		return "prod integration..";
			}
			
		};
	
	private final String desc;
	
	// by default enum constructor is private 
	private EnumStuff(String desc)
	{
		this.desc=desc;
	}
	
	
	public String getDesc() {
		
		return desc;
	}
	
	public static void printValues() {
		
		for(EnumStuff e : values()) {
			System.out.println(e.name());
		}
		
	}
	
	
public static void printOrdinal() {
		
		
			System.out.println(PROD.ordinal());
		
		
	}
	
	public abstract String getCustomName();
	
	public static EnumStuff getValue(String e) {
		
		return EnumStuff.valueOf(e);
	}
	
	public static void main(String [] args) {
		
		EnumStuff.printValues();
		System.out.println(EnumStuff.getValue("TEST").getCustomName());
		Set<EnumStuff> enumSet = EnumSet.of(EnumStuff.TEST, EnumStuff.DEV);
		for(EnumStuff set : enumSet) {
			System.out.println(set.name());
		}
		
		EnumStuff.printOrdinal();
		
	}
}
