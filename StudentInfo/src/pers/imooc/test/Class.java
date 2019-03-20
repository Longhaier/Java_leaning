package pers.imooc.test;
public class Class {
	private String major;
	private String mid;
	private int grade;
	private Student[] myStudents = new Student[100];
	private int stuNum;
	
	public Class() {
		
	}
	public Class(String major, String mid, int grade) {
		super();
		this.setMajor(major);
		this.setMid(mid);
		this.setGrade(grade);
	}
	
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public Student[] getMyStudents() {
		return myStudents;
	}
	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "专业信息如下:\n专业名称: " + getMajor() + "\n专业编号: " + mid + "\n专业年限: " + grade + "\n";
	}
	
	public void addStudent(Student stu) {
		for(int i=0;i<this.getMyStudents().length;i++){
			if(this.getMyStudents()[i]==null){
				stu.setMyclass(this);
				this.getMyStudents()[i]=stu;
				//2、将学生个数保存到studentNum
				this.stuNum=i+1;
				return;

			}
		}
	
	}
}