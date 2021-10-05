public class DefParaConstructor {
	// instance variable - constructor
    int a;
    boolean bool;
    public DefParaConstructor()
    {
    	System.out.println("default constructor");
    }
    public DefParaConstructor(int a,boolean bool)
    {
    	super();
        System.out.println("parameterised constructor");
        this.a = a;
        this.bool = bool;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefParaConstructor myclass=new DefParaConstructor();
		System.out.println(myclass.a);
	    System.out.println(myclass.bool);
		DefParaConstructor myclass2=new DefParaConstructor(20,true);
		System.out.println(myclass2.a);
        System.out.println(myclass2.bool);

	}

}
