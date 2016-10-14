
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String a,b;
		int result=0;
		do{
			System.out.print("Enter a string 1: ");
			a=cin.next();
			System.out.print("Enter a string 2: ");
			b=cin.next();
			result=a.compareToIgnoreCase(b);
			if(result==0)System.out.println("The two strings are the same.");
			else System.out.println("The two strings are not the same.");
		}while(result!=0);
		cin.close();
	}

}