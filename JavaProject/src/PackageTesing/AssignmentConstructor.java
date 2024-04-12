package PackageTesing;

public class AssignmentConstructor 
{
	
	int a,b,c,d,e;
	
	public AssignmentConstructor(int x, int y, int z, int p, int q)
	{	
		a= x;
		b= y;
		c= z;
		d= p;
		e= q;		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		AssignmentConstructor obj = new AssignmentConstructor(2,3,4,5,6);
		//obj.display(obj.a,obj.b);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
     	System.out.println(obj.e);

	}

}
