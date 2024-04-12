package PackageTesing;

public class Multiplication 
{
	int x;
	int y;
	
	public int sub(int x, int y)
	
	{
		int s=x-y;
		System.out.println("sub of the result is "+s);
		return s;
	}
    public int Add(int x, int y)
	
	{
    	int sum=x+y;
		System.out.println("sum of the result is "+sum);
		return sum;
	}
    public void Operation(int p, int q)
	{
    	int result =p*q;
		System.out.println("Result of expression expression (x+y)*(x-y) is  -: "+result);
	}
	
	public static void main(String[] args) 
	{
		Multiplication objMultiplication  = new Multiplication();
		// Resolve the expression (x+y)*(x-y)
		
		int additionval = objMultiplication.Add(10, 2);
		int additionsub = objMultiplication.sub(10, 2);
		
		objMultiplication.Operation(additionval,additionsub);
			
	}

}
