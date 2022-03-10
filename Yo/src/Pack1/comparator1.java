package Pack1;
import java.util.*;
class comparator1 implements Comparator<Student> {
	@Override
	public int compare(Student r1,Student r2)
	{
		return r1.Getter().compareTo(r2.Getter());
	}
}


