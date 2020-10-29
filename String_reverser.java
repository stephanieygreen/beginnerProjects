
import java.lang.*; 
import java.io.*; 
import java.util.*; 
//reverse the strings the user inputs

class stringReverser {
	public static void main(String[] args){
	String input;
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Please enter your phrase to be reversed");
	input = keyboard.nextLine();

	StringBuilder newString = new StringBuilder();

	for (int i = 0; i<input.length();i++){
		char newCH = input.charAt(input.length()-i-1);
		newString.append(newCH);
	}
	System.out.println(newString);
}

}