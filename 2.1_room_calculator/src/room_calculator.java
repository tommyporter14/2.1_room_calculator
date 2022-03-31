import java.util.Scanner;//import scanner
public class room_calculator {//main method

	public static void main(String[] args) {	
	
	double length;//all variables
	double width;
	double height;
	double area;
	double perimeter;
	double volume;
	String answer;
	
	Scanner scnr = new Scanner(System.in);//new scanner name
	
	do {//loop
		System.out.println("Enter Length: ");//get length
		length = scnr.nextDouble();
		
		System.out.println("Enter Width: ");//get width
		width = scnr.nextDouble();
		
		System.out.println("Enter height: ");//get height
		height = scnr.nextDouble();
		
		area = length * width;//calculations
		perimeter = 2 * length + 2 * width;
		volume = length * width * height;
		
		System.out.println("Area:" + area);//results
		System.out.println("Perimeter:" + perimeter);
		System.out.println("Volume:" + volume);
		
		scnr.nextLine();//not sure why i needed this but it allows me to take string input after double input
		
		System.out.println("Continue (Yes/No)?");//ask to continue or not
		answer = scnr.nextLine();
			if (answer.equals("yes"))//lower case
			{
				continue;//restart loop
			}
			else if (answer.equals("Yes"))//caps start
			{
				continue;//restart loop
			}
			else if (answer.equals("no"))//lower case
			{
				break;//end
			}
			else if (answer.equals("No"))//caps start
			{
				break;//end
			}
			else//invalid input check
			{
				System.out.println("Not valid input. Continue (Yes/No)?");//re-prompt continue because invalid input 
				answer = scnr.nextLine();
				continue;//restart loop
			}
		}while (true);
	
	scnr.close();//close scanner
	}

}
