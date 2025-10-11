package com.datatypes;

public class PrimitiveDataTypes 
{
	public static void main(String[] args) 
	{
		boolean a=true;
		char b='k';
		byte c=100;
		short d=30000;
		int e=123456789;
		long f=9515537631L;
		float g=76.2f;
		double h=78.28;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("The memory occupied by char data type is :"+Character.BYTES+" byte's");
		System.out.println("The memory occupied by byte data type is :"+Byte.BYTES+" byte's");
		System.out.println("The memory occupied by short data type is :"+Short.BYTES+" byte's");
		System.out.println("The memory occupied by int data type is :"+Integer.BYTES+" byte's");
		System.out.println("The memory occupied by long data type is :"+Long.BYTES+" byte's");
		System.out.println("The memory occupied by float data type is :"+Float.BYTES+" byte's");
		System.out.println("The memory occupied by double data type is :"+Double.BYTES+" byte's");
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("char data type can stores the value from the range "+Character.MIN_VALUE+" to "+Character.MAX_VALUE);
		System.out.println("byte data type can stores the value from the range "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
		System.out.println("short data type can stores the value from the range "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
		System.out.println("int data type can stores the value from the range "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
		System.out.println("long data type can stores the value from the range "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
		System.out.println("float data type can stores the value from the range "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
		System.out.println("double data type can stores the value from the range "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
	}

}
