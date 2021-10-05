public class AssignCharacter {
	public static void main(String[] args) {
		int i,j,k,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>0;j--)
			{
				System.out.println(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.println("*");
			}
			System.out.println(" ");
		}
	
		for(i=4;i>0;i--)
		{
			for(j=4-i;j>=0;j--)
			{
				System.out.println(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.println("*");
			}
		}

	}
}

