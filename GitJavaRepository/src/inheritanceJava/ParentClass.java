package inheritanceJava;

public class ParentClass extends ChildClass {
	
	String action = "Their wish";
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		ParentClass pc = new ParentClass();
		
		pc.playsAlways();
		pc.doesnotDrinkMilk();
				
		System.out.println(pc.action);
	}

}
