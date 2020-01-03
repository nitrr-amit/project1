package sis.com;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
   public static void main(String args[]){
	String str1,str2;
	Scanner scan=new Scanner(System.in);
	str1=scan.nextLine();
	str2=scan.nextLine();
	char [] c1=str1.toCharArray();
    char [] c2=str2.toCharArray();
    System.out.println(c2.length);
    System.out.println(c1.length);
	Arrays.sort(c1);
	Arrays.sort(c2);
	if(Arrays.equals(c1,c2)){
		System.out.println("Anagram");
		
	}else{
		System.out.println("NNAnagram");
	}
	
	
   }
}
