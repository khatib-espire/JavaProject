package PackageTesing;

public class ArthematicOperation 
{
	int x,y;
	
	public int sum(int x, int y) 
	{
		
	return x+y;
		
	}
	public int sub(int x, int y) 
	{
		
	return x-y;
		
	}
	public int mul(int x, int y) 
	{
		
	return x*y;
		
	}
	public void Div(int x, int y) 
	{
		
		int div = x/y;
		
		System.out.println("Expression (((((10+2)+2)-2)*2)/2) result is --:"+div);
			
	}	
	public static void main(String[] args) 
	{
		// (((((10+2)+2)-2)*2)/2)
		
		ArthematicOperation objArthematic = new ArthematicOperation();
		int sumResult1 = objArthematic.sum(10, 2);
		int sumResult2 = objArthematic.sum(sumResult1, 2);
		int subResult = objArthematic.sub(sumResult2, 2);
		int MulResult = objArthematic.mul(subResult, 2);
         objArthematic.Div(MulResult, 2);		
	}

}
