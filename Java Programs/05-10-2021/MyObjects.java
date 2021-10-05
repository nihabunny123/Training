public class MyObjects {
	static int objectCount=0;
	MyObjects()
	{
		objectCount++;
	}

	public static void main(String[] args) {
		
		MyObjects mo1=new MyObjects();
		MyObjects mo2=new MyObjects();
		MyObjects mo3=new MyObjects();
		MyObjects mo4=new MyObjects();
		MyObjects mo5=new MyObjects();
		MyObjects mo6=new MyObjects();
		System.out.println(mo6.objectCount);

	}

}
