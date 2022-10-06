import java.util.Scanner;

public class DuplicateChars {
	
	static void displayChar(String s2) {
		
		char ch= ' ';
		for (int i=0;i<s2.length();i++) {   
		    int count=1;
			for(int j = i+1; j <s2.length(); j++) {
				 if ( s2.charAt(i)==s2.charAt(j)&& s2.charAt(i) != ' ' )  //to compare characters are duplicate
				 {
					 count++;
					 ch= s2.charAt(i);
				 }
			 }	
	        if((count>1) && (s2.charAt(i)!='0') )                         //if letter comes 2nd time then prints letter
	    	     System.out.println(ch);
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s1=scan.next();    //Takes String input 
		s1=s1.toLowerCase();       //to convert in lower case
		displayChar(s1);             //calls the method
	}

}

