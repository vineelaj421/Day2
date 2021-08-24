package Assignment2;
import java.util.Scanner;

public class QBudget {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in);
		int a=Scanner.nextInt();
		int b=Scanner.nextInt();
		int c=Scanner.nextInt();
		int d=Scanner.nextInt();
		int e=Scanner.nextInt();
		double t=(a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90);
		if(t<15000)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		

	}

}
