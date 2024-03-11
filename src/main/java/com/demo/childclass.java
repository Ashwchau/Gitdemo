package com.demo;

public class childclass extends parentclass{

String name ="QAClickAcademy";


public childclass()
{
	super();// this should be always be at first line
	System.out.println("child class construtor");

}
public void getStringdata()
{
	System.out.println(name);
	System.out.println(super.name);
}

public void getData()
{
	super.getData();
	System.out.println("I am in child class");
}
public static void main(String[] args) {
// TODO Auto-generated method stub

childclass cd = new childclass();

cd.getStringdata();
cd.getData();
}

}