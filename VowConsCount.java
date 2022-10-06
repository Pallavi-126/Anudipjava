import java.util.Scanner;

public class VowConsCount {
	static void Count(String s1){                              //method to count vowels and consonent
		int count=0;
		for (int i=0; i<s1.length();i++) {                   //loop to count vowels 
			char ch=s1.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))    //check whether each letter is vowel.
				count++;
		}
		System.out.println("No of vowels :"+count);                //print no of vowels
		int cons=0;
		for (int i=0; i<s1.length();i++) {                     //loop to count consonants
			char ch=s1.charAt(i);
			if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u'))    //check if each letter is not vowel...then it is consonant
				cons++;
		}  
		System.out.println("No of Consonants :"+cons);                //print no of consonents
		 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String in which you want to count vowels & consonants :");
		String s1=scan.next();    //Takes String input 
		s1=s1.toLowerCase();       //to convert in lower case
		Count(s1);
	
		
		

	}

}
