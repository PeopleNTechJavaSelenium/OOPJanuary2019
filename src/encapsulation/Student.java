package encapsulation;

public class Student {
	private int stId;
	private String stName;
	private String stDOB;
	
	public Student() {}
	public Student(int stId, String stName, String stDOB) {
		this.stId = stId;
		this.stName = stName;
		this.stDOB = stDOB;
	}
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStDOB() {
		return stDOB;
	}
	public void setStDOB(String stDOB) {
		this.stDOB = stDOB;
	}
}
