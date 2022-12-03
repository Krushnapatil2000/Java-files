package Practice;

public class Cwh_14_ps3 {

	public static void main(String[] args) {
		String name = "Jack Parker";
		
		//problem 1
		String lowerName = name.toLowerCase();
		System.out.println(lowerName);
		
		//problem 2
		System.out.println(name.replace( " ", "_"));
		
		//problem 3
		String letter = "Dear, <|name|> ,thanks a lot 1!";
		String change =letter.replace("<|name|>", "Harry");
		System.out.println(change);
		
		//Problem 4 IMP
		String space="akshay jagtap   ";
		System.out.println(space.indexOf(" "));
		System.out.println(space.indexOf("   "));
		
		//Problem no 5
		String Letter = "Dear Harry,\n\t This JAVA course is Nice. \n\t Thanks ! ";
		System.out.println(Letter);
		

	}

}
