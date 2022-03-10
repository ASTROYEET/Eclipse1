package Pack1;

public class Student 
{
	private String name;
	private int age;
	
	public String Getter()
	{
		return name;
	}
	public void Setter(String name)
	{
		this.name=name;
	}
	public int ageGetter()
	{
		return age;
	}
	public void ageSetter(int age)
	{
		this.age=age;
	}
	public void tostring()
	{
		 System.out.println("Name:" + name+ "Age: "+ age);
	}
	
}
