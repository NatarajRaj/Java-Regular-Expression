package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexsplit {
	public static void main(String [] args) {
		
		//String msg="Payilagam chennai tamilnadu";
		String message= "www.payilagam.com";
		//String[] s1=msg.split("\\");					//to split by space
		String[] s=message.split("\\.");				//to split by the dot remaining all print (Argument - regex pattern) compile representation
		
		
		for(String names:s)
			System.out.println(names);
		
		
		
	System.out.println("------------------------------");
	Pattern p=Pattern.compile("a");					// "a" given input avoid remaining all are print
	//Pattern p=Pattern.compile("\\.");			
	String[] str=p.split(message);					//Argument passing - String
	for(String names1:str)
		System.out.println(names1);
		}
	}


