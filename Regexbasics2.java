package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexbasics2 {
	public static void main(String [] args) {
		String message="gwzigwzigwzigwzigwzi12345$@#%&*!";
		//Pattern p=Pattern.compile("[gwz]");   //to check letter either one g (or) w (or) z present print on console 
		//Pattern p=Pattern.compile("[^gwz]");   // ^ symbol to check letter either one g (or) w (or) z present not print on console remainings print 
		//Pattern p=Pattern.compile("[a-zA-Z]");  	// only print on alphabet characters only
		//Pattern p=Pattern.compile("[0-9]");			//only print on numbers only
		//Pattern p=Pattern.compile("[a-zA-Z0-9]");		//to check print only alphabet & character
		Pattern p=Pattern.compile("[^a-zA-Z0-9]");		// ^ symbol except a-zA-Z0-9 remainings all print
		
		Matcher m=p.matcher(message);
		
		while(m.find()) {
			System.out.println(m.group());
			//System.out.println(m.group()+" Start at character postion: "+m.start());
		}
	}

}
