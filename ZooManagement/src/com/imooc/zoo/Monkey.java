package com.imooc.zoo;

public class Monkey extends Animal implements IACT {
	private String type;
	
	public Monkey() {
		super();
	}

	public Monkey(String name, int age,String type) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void skill() {
		
		System.out.println("���ܣ�����ֳ�����ľ��");
	}

	@Override
	public void act() {
		System.out.println("�����ߣ�"+this.getName()+"\n���䣺"+this.getAge()+"\nƷ�֣�"+this.getType());
		this.skill();
		this.love();
		System.out.println();
	}

	@Override
	public void love() {
		System.out.println("���ã�ϲ��ģ���˵Ķ�������");		
	}
}
