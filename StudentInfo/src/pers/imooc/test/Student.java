package pers.imooc.test;
public class Student {
	private String name;
	private String id;
	private String sex;
	private int age;
	private Class myclass;
	public Student() {	
	}
	public Student(String name, String id, String sex, int age, Class myclass) {
		super();
		this.setName(name);
		this.setId(id);
		this.setSex(sex);
		this.setAge(age);
		this.setMyclass(myclass);
	}
	public Class getMyclass() {
		if(this.myclass==null) {
			this.myclass=new Class();
		}
		return myclass;
	}
	public void setMyclass(Class myclass) {
		this.myclass = myclass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
/**
 * hello
 */
	@Override
	public String toString() {
		return "================"+"\n"+
				"学生信息如下："+"\n"
				+ "姓名: " + getName() +"\n"
				+ "学号: " + getId() +"\n"
				+ "性别: " + getSex() +"\n"
				+ "年龄: " + getAge() +"\n"
				+"所学专业: "+ this.getMyclass().getMajor()+"\n"
				+"学制年限: "+ this.getMyclass().getGrade()+"\n";
	}
}