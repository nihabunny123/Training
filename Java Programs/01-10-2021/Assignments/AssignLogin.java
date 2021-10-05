import java.util.Scanner;

public class AssignLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Username:");
		String str=sc.nextLine();
		System.out.println("Enter the Password:");
		String s=sc.nextLine();
				
				if(str.equals("niha") && s.equals("n@123"))
				{
				System.out.println("Login is Successful"); 
				}
				else
				{
					System.out.println("Login is denied");
				}
				sc.close();
			}
}
