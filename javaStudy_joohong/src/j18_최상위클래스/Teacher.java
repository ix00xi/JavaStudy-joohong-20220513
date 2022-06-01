package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)
 * 모든 클래스에 상속이 되어있음
 * 
 * 
 */


public class Teacher {
	private String name;
	private String subject;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())	//instanceof 랑 같다.
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	public void classInfo() {
		System.out.println();
	}
	
	
}
