
public class MyProgram {
	int a;
	boolean bool;
	void myMethod(int c)
	{
		System.out.println(c+1);
		int b=10;
		System.out.println(b+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyProgram myPro=new MyProgram();
		System.out.println(myPro.a);
		System.out.println(myPro.bool);
		myPro.myMethod(10);

	}

}