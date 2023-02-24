				//Regex Quantifiers- number of times occurance
				//Quantifiers -----> ?,+,*,{}


package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifiers {
	
	public static void main(String [] args) {
		String message="gowzigowzigowzigowzinatarajgowzigowzi";
		//Pattern p=Pattern.compile("gow+");			//+ means atleast one matches
		//Pattern p=Pattern.compile("g*");			//* means any number of matches ex:g letter on the message
		Pattern p=Pattern.compile("g?");			//+ means atmost one the matches
		//Pattern p=Pattern.compile("gowzi{1,2}");			//curly braces {} include value how much present (min 1,max 2)on the given input
		
		Matcher m=p.matcher(message);
		
		while(m.find()) {
			System.out.println(m.group()+ "---> word start with character :"+m.start());
		}
	}
}
