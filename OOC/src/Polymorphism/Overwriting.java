package Polymorphism;

 class Overwriting1 {
	void m1(){
		System.out.println("I m a student");
	}

}
 
 public class Overwriting extends Overwriting1{
	@Override
	 void m1(){
		System.out.println("I m studying in vels university");
	}
	
	public static void main(String[] args) {
		Overwriting obj = new Overwriting();
		obj.m1();
	}
	 
 }
