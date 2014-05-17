package yan;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		String correctusername = "yan";
		String correctpassword  = "test123";
		String wrongusername;
		String wrongpassword;
		System.out.println("Hello User, Please Login with your username and password.");
		System.out.println("Please enter your username.");
		wrongusername = input.nextLine();
		System.out.println("Please enter a password");
		wrongpassword = input.nextLine();
		
		if(wrongusername.equals(correctusername) && wrongpassword.equals(correctpassword)){
			System.out.println("login successful");
			} 
		else{
			System.out.println("ERROR :: Self destruct in.. 3..2..1 BOOM");
		}
			
}



	}


