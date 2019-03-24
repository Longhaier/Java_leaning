package com.imooc.zoo;

public class Clown implements IACT{
	private String name;
	private int years;
	
	public Clown() {
		super();
	}

	public Clown(String name, int years) {
		super();
		this.setName(name);
		this.setYears(years);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public void skill() {
		System.out.println("���ܣ��Ųȸ��Σ������Ӽ�ħ������");	
	}

	@Override
	public void act() {
		System.out.println("�����ߣ�"+this.getName()+"\n���䣺"+this.getYears());
		this.dress();
		this.skill();
		System.out.println();	
	}
	
	public void dress() {
		System.out.println("��װ������ʷ�װ��ͷ�ϴ��Ų�ɫ��ñ�ӣ����ϻ��ſ��ŵĲ�ױ");
	}

}
