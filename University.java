package abstraction;

public abstract class University {
	
	 public int university_code =10;

	public abstract void welcome();
	
	public void university_na() {
		System.out.println("Parent-->University--->Concrete/Non Abstract");
	}
}
