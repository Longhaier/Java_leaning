package pers.imooc.test;
public class InfoQuery {
	public static void main(String[] args) {
		Class aclass=new Class("计算机科学与应用", "J0001", 4);
		System.out.println(aclass);
		Student a = new Student("张三", "S01","男", 18,aclass);
		Student b = new Student("李四", "S02","女", 17,aclass);
		Student c = new Student("王五", "S03","男", 18,aclass);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		aclass.addStudent(a);
		aclass.addStudent(b);
		aclass.addStudent(c);
		System.out.println("==============");
		System.out.println(aclass.getMajor()+ "的人数为："+ aclass.getStuNum());
	}
}
