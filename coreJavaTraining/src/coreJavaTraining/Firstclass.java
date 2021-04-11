package coreJavaTraining;

public class Firstclass {

	static int a = 4;
	int b = 6;

	//method
	public int getData()
	{
		System.out.println("I am in Main / First Class Method.");
		return 5;
	}

	//objects are instance /references of class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Amarjeet");
		System.out.println("Welcome to Java Training.");
		System.out.println(a+2);

		Firstclass fn=new Firstclass(); 
		fn.getData();
		System.out.println(fn.b);

		Secondclass sn=new Secondclass(); 
		sn.setData();		
	}
}
