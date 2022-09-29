package com.syntax.class12;
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors
public class PhoneH {
	String make;
	String model;
	boolean expensive;
	double size;
	boolean LongLifeBattery;
	int price;
	void recording() {
		System.out.println("excellent video recording....");
	}
	void browseTheInternet() {
		System.out.println("Watch a video before class....");
	}
	void DisplayWeather() {
		System.out.println("Is it going to rain later?");
	}
	public static void main(String[] args) {
PhoneH iPhone=new PhoneH();
iPhone.make="Apple";
iPhone.model="iphone 11 Pro";
iPhone.price=500;
iPhone.size=5.8;
iPhone.expensive=false;
iPhone.browseTheInternet();

PhoneH Pixel=new PhoneH();
Pixel.make="Google";
Pixel.model="Pixel 6";
Pixel.size=6.4;
Pixel.DisplayWeather();

PhoneH Samsung=new PhoneH();
Samsung.make="Samsung";
Samsung.model="S22 Ultra";
Samsung.price=1050;
Samsung.size=6.8;
Samsung.LongLifeBattery=false;
Samsung.recording();
	}
}
