package javapractice;

public class lec500p {
	int number=5;
	String school="Nexttecitc";
	
	public static void Method2() {
		
		System.out.println("NexttectITC");
	}

	public static void main(String[] args) {
		
		// create and object of class that I want to access
		
		lec500p OOP=new lec500p();// class name object=new classname();
		System.out.println(OOP.number);
		System.out.println(OOP.school);

	}

}
