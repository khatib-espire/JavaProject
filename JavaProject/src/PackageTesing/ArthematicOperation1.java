package PackageTesing;

public class ArthematicOperation1 
{
	
	public int mul(int x, int y) 
	{
		
		return x*y;
	}
	
	public int Add(int p, int q )
	{
		return p+q;
	}
	
	public int Sub(int r, int s )
	{
		return r-s;
	}
	
	public void Div(int t, int u)
	{
		int divresult = t/u;
		System.out.println("Result of regulara Expression // (10*2)+2)-2)*2)/2 is "+divresult);
	}
	
	
	public static void main(String[] args) 
	{
		// (10*2)+2)-2)*2)/2
		
		ArthematicOperation1 obj= new ArthematicOperation1();
		int ResultMultiplication = obj.mul(10, 2);
		int ResultAdd= obj.Add(ResultMultiplication, 2);
		int ResultSub = obj.Sub(ResultAdd, 2);
		int ResultMultiplication1 = obj.mul(ResultSub, 2);
		obj.Div(ResultMultiplication1, 2);
		
		
	}

}
