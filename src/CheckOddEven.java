import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		int in;
		System.out.print("Enter a integer: ");
		in=cin.nextInt();
		if(in%2==0)System.out.println("The input integer is Even Number.");
		else System.out.println("The input integer is Odd Number.");
		cin.close();
	}
}
