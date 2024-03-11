package com.demo;

public class StaticVar {

	String name;//instance variables
	String address;
	static String city; //class variables
	
	StaticVar(String name,String address,String city)
	{
		this.name =name;
		this.address = address;
	}
	public void getAddress()
	{
		System.out.println(address+""+city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj = new StaticVar("Bob","Marthali","Bangalore");
		StaticVar obj1 = new StaticVar("Ram","Jayangar","Bangalore");
		obj.getAddress();
		obj1.getAddress();
	}

}
