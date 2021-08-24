package Assignment2;
import java.util.Scanner;
public class Que2 {

	public static void main(String[] args) {
		System.out.println("enter Character");
		char ch;
		Scanner SC = new Scanner(System.in);
		ch=SC.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("The given character is vowel");
		}
		else if(ch=='#'||ch=='@')
		{
			System.out.println("The given character is not an alphabet");
		}
		else
		{
			System.out.println("The given character is consonant");
		}
			
	

	}

}
