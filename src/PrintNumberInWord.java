import java.util.Scanner;
public class PrintNumberInWord {
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		String eng;
		int in;
		System.out.println("Enter a integer: ");
		in=cin.nextInt();
		switch(in){
		case 1:eng="ONE";break;
		case 2:eng="TWO";break;
		case 3:eng="Three";break;
		case 4:eng="FOUR";break;
		case 5:eng="FIVE";break;
		case 6:eng="SIX";break;
		case 7:eng="SEVEN";break;
		case 8:eng="EIGHT";break;
		case 9:eng="NINE";break;
		default:eng="OTHER";break;
		}
		System.out.println("The input integer is \""+eng+"\".");
		cin.close();
	}
}
