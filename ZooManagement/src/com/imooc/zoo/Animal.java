package com.imooc.zoo;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {
		super();
	}

	public Animal(String name, int age) {
		super();
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void love();
}
