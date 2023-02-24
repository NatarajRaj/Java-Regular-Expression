package Regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexmobile {
	
	
	public static void main(String [] args)throws FileNotFoundException {
		
		File file=new File("C:\\Users\\user\\Desktop\\Nataraj\\Gowzika.text");     //to check file read the content
		Scanner sc=new Scanner(System.in);
		boolean linepresent=sc.hasNext();    //to get input read line by line in scanner method
		
		while(linepresent) {
			
			String word=sc.next();			//to get input on file  scanner method
			int i=word.lastIndexOf(":");		//In a file ":"wherever semicolon is present consider lastindex after letter is i
			String mobile=word.substring(i+1);				//i after that element as sub string (i+1) below mobile number conditon check valid mobile number or not
			Pattern p=Pattern.compile("0|91?[6-9][0-9]{9}");    //[0-9]  present on {10} numbers check this type  ,,,intial [6-9] the mobile number start with 6 to 9 present or not 
			//0? its mean may be present or not in mobile  & 0|91 ,,,its mean 0 or 91 may be present or not on the mobile number-
			Matcher m=p.matcher(mobile); 
					
			if(m.find())
				System.out.println(m.group()+" is a valid mobile number");
			else
				System.out.println(m.group()+" is a not a mobile number");

			linepresent=sc.hasNext();   //to hasNext line check present or not in the file
		}
			
			
			
		
		System.out.println("---------------direct check on given input to above access file in file handling operation to check the file valid mobile present or not----------------------");
		String mobile="08508929010";
		Pattern p=Pattern.compile("0|91?[6-9][0-9]{9}");    //[0-9]  present on {10} numbers check this type  ,,,intial [6-9] the mobile number start with 6 to 9 present or not 
		//0? its mean may be present or not in mobile  & 0|91 ,,,its mean 0 or 91 may be present or not on the mobile number-
		Matcher m=p.matcher(mobile); 
				
		if(m.find())
			System.out.println(m.group()+" is a valid mobile number");
		else
			System.out.println(m.group()+" is a not a mobile number");
	}

}
