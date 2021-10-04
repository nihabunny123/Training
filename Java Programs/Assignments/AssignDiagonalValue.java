
public class AssignDiagonalValue {
			static void printLeftDiagonal(int mat[][], int n)
		    {
		        for (int i=0;i<n;i++) 
		        {
		            for (int j=0;j<n;j++) 
		            {
		               if (i==j) 
		                {
		                    System.out.print(mat[i][j]+" ");
		                }
		            }
		        }
		    }
            static void printRightDiagonal(int mat[][], int n)
            {
            		for (int j=0;j<n;j++) 
            		{
            			for (int i=0;i<n;i++) 
                    	{
                    	
            			if ((i+j)==(n-1)) 
            			{
            				System.out.print(mat[i][j]+" ");
            			}
            		}
            	}
            }
            public static void main(String args[])
            {
            	int n = 3;
            	int a[][] = { {1,3,2},{6,4,5},{7,4,8} };
            	printLeftDiagonal(a, n);
            	printRightDiagonal(a, n);
}
}