package C3inheri;

class c1{
	void m1(){
		System.out.println("I m learing in FITA");
		
	     
	}
}


 class c2 extends c1 {
	void m2(){
		System.out.println("Hello World");
		
		
	}
	
}
	
public class c3 extends c2{
	void m3(){
		System.out.println("i m Logesh");
		
	}

public static void main(String[] args){
	c3 c1ojb = new c3();
	c1ojb.m3();
	
	c1ojb.m2();
	
	c1ojb.m1();
	
	
	
	
	
}

}
