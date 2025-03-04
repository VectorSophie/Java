package kosa.Relation;

public class Main {
	public static void main(String[] args) {
		Course c1 = new Course("네탓학개론");
		Course c2 = new Course("대수학");
		Course c3 = new Course("샌즈학개론");
		
		Student s1 = new Student("히스클리프");
		Student s2 = new Student("이상");
		
		s1.register(c3);
		s1.register(c2);
		
		s2.register(c1);
		s2.register(c3);
		
		c3.printCourse();
	}
}
