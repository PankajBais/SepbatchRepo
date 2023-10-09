package Welcome_java;

public class Arithmatic 
{
  public int sum(int a,int b) 
  {
	 int c=a+b;
	
	 return c;
  }
  public int sub(int x,int y)
  {
	  int z=x-y;
	  System.out.println("Substraction is ="+ z);
	  return z;
  }
  public int multi(int r, int s)
  {
	  int t=r*s;
	  System.out.println("Multiplication is ="+ t);
	  return t;
  }
  public void div (int p, int q)
  {
	 int r=p/q;
	 System.out.println("Division & Final Result is =" + r);
	 
  }
  public static void main(String[] args)
  {
	  Arithmatic a=new Arithmatic();
	  int sumresult=a.sum(10,2);	
	  System.out.println("Addition1 is =" + sumresult);
	  int sumresult1=a.sum(sumresult, 2);
	  System.out.println("Addition2 is =" + sumresult1);
	  int subresult=a.sub(sumresult1, 2);
	  int multiresult=a.multi(subresult, 2);
	  a.div(multiresult, 2);
	  
  }
}
