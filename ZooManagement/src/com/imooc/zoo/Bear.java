package com.imooc.zoo;

public class Bear extends Animal implements IACT{

	public Bear(String name, int age) {
		this.setName(name);
		this.setAge(age);		
	}
	
	@Override
	public void skill() {
		System.out.println("技能：挽着花篮，打着雨伞，自立走秀");	
	}

	@Override
	public void act() {
		System.out.println("表演者："+this.getName()+"\n"+"年龄："+this.getAge());
		this.skill();
		this.love();
		System.out.println();	
	}

	@Override
	public void love() {
		System.out.println("爱好：喜欢卖萌");	
	}
}
