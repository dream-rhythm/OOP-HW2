import java.util.Scanner;
public class KeyboardScanner {
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		int a=0;
		float b=0;
		String c;
		System.out.printf("Enter a integer:");
		a=cin.nextInt();
		System.out.printf("Enter a float point number:");
		b=cin.nextFloat();
		System.out.printf("Enter a you name:");
		c=cin.next();
		System.out.printf("Hi %s, the multiplication of %d and %f is %e. ",c,a,b,a*b);
		cin.close();
	}
}
