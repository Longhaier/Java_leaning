package com.imooc.zoo;

public class Bear extends Animal implements IACT{

	public Bear(String name, int age) {
		this.setName(name);
		this.setAge(age);		
	}
	
	@Override
	public void skill() {
		System.out.println("���ܣ����Ż�����������ɡ����������");	
	}

	@Override
	public void act() {
		System.out.println("�����ߣ�"+this.getName()+"\n"+"���䣺"+this.getAge());
		this.skill();
		this.love();
		System.out.println();	
	}

	@Override
	public void love() {
		System.out.println("���ã�ϲ������");	
	}
}
