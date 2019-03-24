package com.imooc.zoo;

import java.util.Scanner;

public class Test {
	//介绍页面
	public void introduction(){
		System.out.println("**********欢迎来到太阳马戏团**********");
		System.out.println("**********  请选择表演者       **********");
		System.out.println("**********    1、棕熊          **********");
		System.out.println("**********    2、狮子          **********");
		System.out.println("**********    3、猴子          **********");
		System.out.println("**********    4、鹦鹉          **********");
		System.out.println("**********    5、小丑          **********");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		//实例化
		Bear bear = new Bear("Bill",1);
		Lion lion = new Lion("Lain",2,"灰色","公狮");
		Monkey monkey = new Monkey("Tom",1,"金丝猴");
		Parrot parrot = new Parrot("Rose",1,"牡丹鹦鹉");
		Clown clown= new Clown("Kahle",5);
		
		boolean flag=true;
		Scanner sc =  new Scanner(System.in);
		test.introduction();
		//整体的大循环
		do {
			int num = sc.nextInt();		
			switch(num) {
			case 1: bear.act();break;
			case 2: lion.act();break;
			case 3: monkey.act();break;
			case 4: parrot.act();break;
			case 5: clown.act();break;
			}
			//关于是否继续的一个小循环
			int contint;
			do {
			System.out.println("********是否继续观看(1/0)*********");
			contint = sc.nextInt();
			if(contint==1) {
				test.introduction();
				}else if(contint ==0) {
					flag=false;//此处将flag置为false，跳出主循环
					break;}
					else {
						System.out.println("*****输入信息不正确，请重新输入*****");
				}	
			}while ((contint!=1)&(contint!=0));		
			
		}while(flag==true);
		System.out.println("**********谢谢下次光临************");
	}
}

