
						// StringTokenizer is a legacy class(its mean present on jdk 1.0 version ,,,now not used alternately using split() method)


package Regex;

import java.util.StringTokenizer;

public class RegexStringTokenizer {
	
	public static void main(String [] args) {
		
		//StringTokenizer st=new StringTokenizer("Payilagam Chennai Tamilnadu");
		//System.out.println("Count no of tokens: "+st.countTokens());     //to above string split the three tokens print no. of tokens
		
		//StringTokenizer st=new StringTokenizer("www.gowzinatrjz.com",".");   //"." dot is a delimiter given on string directly,,, it will be split each indiviuals token
		StringTokenizer st=new StringTokenizer("15-12-2022","-",true);			//to passing one more constructor boolean to check the result
		
		//delimiter- space (to above string split & give indiviuals tokens) space is a default delimiter in string tokenizer 
		
		while(st.hasMoreTokens()) 				//to looping more tokens available at present 
		System.out.println(st.nextToken());     //to print given string message indiviuals tokens	
		
		System.out.println("----------------Type2 split (now used this easy method split())-----------------");
		//String message="Hi GowziNatarajan";
		//String[] str=message.split("\\s");					//Argument passing - String (to split by spacing "\\s" delimiter)
		String message="http:\\www.gowzinatrjz.com";
		String[] str=message.split("\\:|\\\\|\\.");    //to split symbol : (or) \\ (or) . splited the each tokens (\\ ---> declare type | ---> | or operator
		for(String names1:str)
			System.out.println(names1);
	

}
}