package com.demo;

	//function overloading
	//either argument count should be different or
	//argument data type should be different
	public class childlevel extends childclassdemo {

	public void getData(int a)
	{
	System.out.println(a);
	}
	public void getData(String a)
	{
	System.out.println(a);
	}
	public void getData(int a,int b)
	{
	System.out.println(b);
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	childlevel cl=new childlevel();
	cl.getData(2);
	cl.getData("hello");
	cl.getData(2, 5);

	}
}
