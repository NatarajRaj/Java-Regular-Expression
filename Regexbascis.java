package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexbascis {
	
	public static void main(String [] args) {
		
		
		String message="Hi gowzika, what are u doing now ,gowzi how is going ur studies?,,,  gowzi when will u come home next leave?,,where i will u meet u?,,,Don't forgot me. by ur Natarajgowzi";
		Pattern p=Pattern.compile("gowzi");   //to creating singleton type of pattern to avoid call default constructor (compile() method to get the string object
		Matcher m=p.matcher(message);	//to check compile representation(pattern) is word gowzi matches
		int count=0;
		while(m.find())
		{
			System.out.println(m.group());				//to check the words present on given string
			count++;
			//System.out.println(m.group()+" word starts character position: "+m.start() +" end with character position: "+m.end());
			//System.out.println(m.hashCode());	
		}
	System.out.println("Words no. of times appeared: "+count);  
	}

}
