package abstraction;

public class Student extends University{
	
	public  void welcome() //abstract method from parent class are defined here 
	{
		System.out.println("child---->Welcome all student to the university");
	}
	
	public void learning() // non abstract method
	{
		System.out.println("Student are mean to be learning ");
	}

}
