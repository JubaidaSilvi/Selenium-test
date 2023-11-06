package javapractice;

public class AccessModifier2 {
	String kidsName="Subaha"; // public
	
		
	 private int RolNumber=2;  // Private
	
	private void flowerlooks() {
		System.out.println("Flowers look nice");}
	
	
	String DOB= "12-26-2012";// Default
	
	void description() {
		 System.out.println( "Flower is good");//default
		}
		
	
	

	public static void main(String[] args) {
		
		AccessModifier2 obj= new AccessModifier2();
		obj.flowerlooks();
		obj.RolNumber();
		
	
       
      
      }
}
