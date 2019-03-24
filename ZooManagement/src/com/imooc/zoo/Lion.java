package com.imooc.zoo;

public class Lion extends Animal implements IACT {
	private String color;
	private String sex;

	
	public Lion() {
		super();
	}
	
	public Lion(String name, int age,String color, String sex) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
		this.setSex(sex);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void skill() {
		System.out.println("技能：擅长钻火圈");	
	}

	@Override
	public void act() {
		System.out.println("表演者："+this.getName()+"\n年龄："+this.getAge()+"\n性别："+this.getSex()+"\n毛色："+this.getColor());
		this.skill();
		this.love();
		System.out.println();
	}

	@Override
	public void love() {
		System.out.println("爱好：喜欢吃各种肉类");
	}
}
