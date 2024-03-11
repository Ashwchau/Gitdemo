package com.demo;


public class AustralianTrafic implements CentralTraffic,ContinentalTraffic {

public static void main(String[] args) {
// TODO Auto-generated method stub
CentralTraffic a= new AustralianTrafic();
a.redStop();
a.FlashYellow();
a.greenGo();

AustralianTrafic at=new AustralianTrafic();
ContinentalTraffic ct=new AustralianTrafic();
at.walkonsymbol();
ct.Trainsymbol();


}

@Override
public void redStop() {
// TODO Auto-generated method stub
System.out.println(" redstop implementation");
}
public void walkonsymbol()
{
System.out.println("walking");
}
@Override
public void FlashYellow() {
// TODO Auto-generated method stub
System.out.println(" flash yellow implementation");
//code
}

@Override
public void greenGo() {
// TODO Auto-generated method stub
System.out.println(" Green go implementation");
}

@Override
public void Trainsymbol() {
// TODO Auto-generated method stub

}

}