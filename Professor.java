package abstraction;

public class Professor extends University {
	
	public int university_code = 15;
	
	public void welcome()
	{
		System.out.println("child---->Welcome all professor to the university");
	}
	
	public void lecturing() {
		System.out.println("Professor are mean to be leacturer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor pf = new Professor();
		pf.lecturing();      //From child class-na
		pf.university_na();   // from parent class- univer na
		pf.welcome();   //parent--abstract
		 System.out.println("****************");
		 
		Student st = new Student();
		st.welcome();// student abst
		st.learning();//student
		st.university_na();//univer non abst
		System.out.println("*************");
		
		parents pa = new parents();
		pa.welcome();// parent abst
		pa.parenting(); //parent
		pa.university_na();// univ na 
		System.out.println("&&&&&&&&&&&&&&&&&&");
		//University uv = new University(); // Oobject cant be created for abstract class
	University p = new Professor();
	p.university_na(); // univ non abst
	p.welcome();// professor
	
		
		
	}

}
