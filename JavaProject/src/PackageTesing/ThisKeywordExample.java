package PackageTesing;

public class ThisKeywordExample 
{
	
	public  ThisKeywordExample()
	{
	  this(1,2,3);
		
		System.out.println("Default Constructor");
	}
	public ThisKeywordExample(int r)
	{
		this(5,19,1,1);
		System.out.println("one parametrized Constructor");
	} 
	public  ThisKeywordExample(int p, int q)
	{
		this(1);
		System.out.println("Two parametrized Constructor");
	}
	
	public  ThisKeywordExample(int p, int q, int r)
	{
		//this();
		System.out.println("Three parametrized Constructor");
	}
	public  ThisKeywordExample(int p, int q, int r, int s)
	{
		this();
		System.out.println("Four parametrized Constructor");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ThisKeywordExample obj = new ThisKeywordExample();
		ThisKeywordExample obj1 = new ThisKeywordExample(1,2);		

	}

}
