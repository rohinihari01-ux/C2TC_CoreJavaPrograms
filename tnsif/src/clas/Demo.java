package clas;

public class Demo {
	String name="Nila";
	static String degree="b.tech";

	public static void main(String[] args) {
		Demo obj= new Demo();
		obj.Mymethod();
		statmethod("This ","is ","Static ","method");
		System.out.println( obj.name);
		System.out.println(degree);
		String lovar="Kavi";
		System.out.println(lovar);
		
		

	}
	public void Mymethod() {
		System.out.println("This is my Instance Method");
		System.out.println(degree);
	}
	public static void statmethod(String a ,String b,String c, String d){
		String e=a+b+c+d;
		System.out.println(e);
		
		
		
	}
	
	{
		System.out.println("This is my Instsance methds");
	}
	static
	{
		System.out.println("This is static block");
	}


}
