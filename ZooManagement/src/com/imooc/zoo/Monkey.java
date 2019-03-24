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
		
		System.out.println("技能：骑独轮车过独木桥");
	}

	@Override
	public void act() {
		System.out.println("表演者："+this.getName()+"\n年龄："+this.getAge()+"\n品种："+this.getType());
		this.skill();
		this.love();
		System.out.println();
	}

	@Override
	public void love() {
		System.out.println("爱好：喜欢模仿人的动作表情");		
	}
}
