package coding.veera.compare;

public class Student implements Comparable<Student>{
	
	@Override
	public int compareTo(Student o) {
		if(o.standard<standard) {
			return 1;
		}
		else if(o.standard>standard) {
			return -1;
		}
		else {
			return 0;
		}		
	}
	
	int rollNo;
	
	String name;
	
	int standard;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public Student(int rollNo, String name, int standard) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", standard=" + standard + "]";
	}


	
	

}
