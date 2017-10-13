
public class HelloWorld 
{

	public static void main( String[] args) 
	{
	System.out.println("Hello this is Bindhu");
	System.out.println("This is my first project");
	System.out.println("The project name is HelloWorld");
	String abc = new StringBuilder().append(args[1]).append(args[0]).append(args[1]).toString();
	System.out.println("*** my first name is : "+ args[0] + " last name :" + args[1]);
	System.out.println(abc);

	}

}
