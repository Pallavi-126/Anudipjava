import java.util.Scanner;

public class Palindrome {
	
	static void Check(String str){                                   //Method to check palindrome
		String revStr = "";

		  for (int i = (str.length() - 1); i >=0; --i) {            // to reverse string
		      revStr = revStr + str.charAt(i);
		    }

		    if (str.equals(revStr)) {                                 //to check string and reverse string are equal
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");//if reverse string not equal to string then its not palindrome
		    }
			
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check Palindrome :");
		String s1=scan.next();                                  //Takes String input 
		s1=s1.toLowerCase();                                   //to convert in lower case
		Check(s1);                       // calls the method

	}

}
/*
	  
*/