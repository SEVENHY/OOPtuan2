package Bai11;

public class HocVien {
	private String name;
	private int year;
	private float subject1;
	private float subject2;
	private float subject3;
	private float subject4;
	private float subject5;
	
	public HocVien() {
	}
	
	public HocVien(String name, int year, float subject1, float subject2, float subject3, float subject4,
			float subject5) {
		this.name = name;
		this.year = year;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getSubject1() {
		return subject1;
	}
	public void setSubject1(float subject1) {
		this.subject1 = subject1;
	}
	public float getSubject2() {
		return subject2;
	}
	public void setSubject2(float subject2) {
		this.subject2 = subject2;
	}
	public float getSubject3() {
		return subject3;
	}
	public void setSubject3(float subject3) {
		this.subject3 = subject3;
	}
	public float getSubject4() {
		return subject4;
	}
	public void setSubject4(float subject4) {
		this.subject4 = subject4;
	}
	public float getSubject5() {
		return subject5;
	}
	public void setSubject5(float subject5) {
		this.subject5 = subject5;
	}
	public double diemTB() {
		return (subject1+subject2+subject3+subject4+subject5)/5;
	}
	@Override
	public String toString() {
		return "HocVien [name=" + name + ", year=" + year + ", subject1=" + subject1 + ", subject2=" + subject2
				+ ", subject3=" + subject3 + ", subject4=" + subject4 + ", subject5=" + subject5 + "]";
	}
	
	
}
