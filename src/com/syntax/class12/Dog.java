package com.syntax.class12;
/*Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador
with specific  attributes and behaviors.
*/
public class Dog {
String name;
char gender;
String color;
int age;
boolean trained=false;
double weight;

void play() {
			System.out.println("dogs love to play");
	}
void predictTheWeater() {
System.out.println("dogs have a strong sense of smell and hearing");
}
void assistPolice() {
	if(trained) {
	System.out.println("the dog can help you find drugs and explosive");
}else {
	System.out.println("the dog want to eat and sleep");
}
}
	public static void main(String[] args) {
		Dog Husky=new Dog();
		Husky.name="Lucy";
		Husky.gender='F';
		Husky.weight=50.5;
		Husky.assistPolice();
		
		Dog Bulldog=new Dog();
		Bulldog.name="Rocky";
		Bulldog.gender='M';
		Bulldog.age=5;
		Bulldog.play();
		
		Dog Labrador=new Dog();
		Labrador.name="Max";
		Labrador.gender='M';
		Labrador.color="Chocolate";
		Labrador.predictTheWeater();
		
		
		
	}
	



	
}
