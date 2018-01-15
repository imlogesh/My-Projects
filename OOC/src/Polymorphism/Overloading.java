package Polymorphism;

public class Overloading {

	void add(int a, int b){
		System.out.println(a+b);
	}
	
	void add(float a, float b){
		System.out.println(a+b);
	}
	
	void add(float a,int b){
		System.out.println(a+b);
	}
	
	void add(int a,float b){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Overloading obj= new Overloading();
		obj.add(10, 10);
		obj.add(10.5f,12.5f);
		obj.add(6.5f,10);
		obj.add(10, 2.5f);
	}
}	
