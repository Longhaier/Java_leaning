package pers.imooc.test;
public class InfoQuery {
	public static void main(String[] args) {
		Class aclass=new Class("�������ѧ��Ӧ��", "J0001", 4);
		System.out.println(aclass);
		Student a = new Student("����", "S01","��", 18,aclass);
		Student b = new Student("����", "S02","Ů", 17,aclass);
		Student c = new Student("����", "S03","��", 18,aclass);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		aclass.addStudent(a);
		aclass.addStudent(b);
		aclass.addStudent(c);
		System.out.println("==============");
		System.out.println(aclass.getMajor()+ "������Ϊ��"+ aclass.getStuNum());
	}
}
