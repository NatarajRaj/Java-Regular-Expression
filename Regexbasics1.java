package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexbasics1 {
	public static void main(String [] args) {
		String message="Hi gowzi , She is studying on b.com at trichy";
		//Pattern p=Pattern.compile("gowzi");
		//Pattern p=Pattern.compile("^gowzi");   //^ this symbol used word is starting on string message ,,,if not gowzi is first loop not run no output
		//Pattern p=Pattern.compile("trichy$");   //$ this symbol used word is starting on string message ,,,if not gowzi is first loop not run no output
		Pattern p=Pattern.compile("g|s");			//to check the letter g (or) s present on the string
		Matcher m=p.matcher(message);
		
		while(m.find()) {
			System.out.println(m.group()+ " word starts with character positon: "+m.start()+" end with character position: "+m.end());
		}
		
		
	}

}
