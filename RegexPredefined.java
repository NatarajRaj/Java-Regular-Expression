package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPredefined {
	public static void main(String [] args) {
		String message="Hi gowzi gowzigowzi , gowziNataraj how are u?143@#$%&";
		
		//Pattern p=Pattern.compile("\\s");		//to check space on string message print
		//Pattern p=Pattern.compile("\\S");		//to check space remaining message all the print
		//Pattern p=Pattern.compile("\\d");		//to check number on string message print		
		//Pattern p=Pattern.compile("\\D");		//to check non- digits remaining message all the print
		//Pattern p=Pattern.compile("\\w");		//to check alphanumber on string message print except special characters(symbol)
		//Pattern p=Pattern.compile("\\W");		//to check alphanumber on string message print on special characters(symbol)
		//Pattern p=Pattern.compile("\\bgowzi");	// "\\bgowzi" to check only gowzi word boundary present on print
		//Pattern p=Pattern.compile("\\bgowzi\\b");	// "\\bgowzi\\b" to check only accurately gowzi word boundary present on print
		Pattern p=Pattern.compile("gowzi\\B");		// "gowzi\\B" to check start with gowzi not with gowzi any word present on print
		//Pattern p=Pattern.compile("\\Ggowzi");	 	// "\\Ggowzi" to check only continously the gowzi word boundary present on print
		
		Matcher m=p.matcher(message);
		
		while(m.find()) {
			//System.out.println(m.group());
			System.out.println(m.group()+" Start at character postion: "+m.start());
		}
	}

}
