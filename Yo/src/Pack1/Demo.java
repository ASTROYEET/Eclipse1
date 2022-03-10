package Pack1;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.Setter("Ram");
		s1.ageSetter(24);
		
		Student s2=new Student();
		s2.Setter("Geetha");
		s2.ageSetter(27);
		
		Student s3=new Student();
		s3.Setter("Sai Krishna");
		s3.ageSetter(26);
		
		TreeSet<Student> hs= new TreeSet<Student>(new comparator1());
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);

		
	}
}
