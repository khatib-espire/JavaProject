package PackageTesing;

public class TestClass 
{
	
	int Rollnumber;
	int age ;
	
	public void display1()
	{
		
		System.out.println("Automation is easy");
	}
	
	public void display2()
	{
		
		System.out.println("Welcome to all of you");
	}

	public static void main(String[] args) 
	{
		TestClass objTest = new TestClass();
		
		objTest.age =40;
		objTest.Rollnumber= 10;		
		objTest.display1();
		objTest.display2();
		System.out.println("Your Age is  "+objTest.age);
		System.out.println("Your Name is  "+objTest.Rollnumber);		
		
	}

}
