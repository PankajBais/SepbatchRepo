package Welcome_java;

public class Student  
{
  int Rollno;
  int Age;
  public void display1()
  {
	  System.out.println("Welcome to all of you");
  }
  public void display2()
  {
	  System.out.println("Automation is very easy");
  }
  public static void main (String[] args)
  {
  Student s=new Student();
  s.display1();
  s.display2();
  s.Rollno=40;
  s.Age=25;
  System.out.println("Rollno is =" + s.Rollno);
  System.out.println("Age is = "+ s.Age);
  }
}

