package encapsulation;

public class StudentInformationSystem {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStId(101);
		st1.setStName("Rafi");
		st1.setStDOB("02-01-1996");
		
		System.out.println(st1.getStId()+ " "+ st1.getStName()+ " "+ st1.getStDOB());

	}

}
