package Assignment2;
import java.util.Scanner;

public class QTrafficsignals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		if((a<c)||((a>c)&&(b>1)))
System.out.println("No");
else
	System.out.println("Yes");
	}
	
	

		

	}


