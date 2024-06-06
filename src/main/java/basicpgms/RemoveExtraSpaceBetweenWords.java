package basicpgms;

import java.util.jar.Attributes.Name;

public class RemoveExtraSpaceBetweenWords {

	//Expected o/p = 4 
	public static void main(String[] args) {
		String name = "My name  is    Arpitha";
		String newString = name.replaceAll("\\s+"," ");
		System.out.println("String with only one space :"+ newString);
		String[] newList = newString.split(" ");
		System.out.println("Number of words in the string is "+newList.length);
	}

}
