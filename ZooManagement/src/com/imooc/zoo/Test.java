package com.imooc.zoo;

import java.util.Scanner;

public class Test {
	//����ҳ��
	public void introduction(){
		System.out.println("**********��ӭ����̫����Ϸ��**********");
		System.out.println("**********  ��ѡ�������       **********");
		System.out.println("**********    1������          **********");
		System.out.println("**********    2��ʨ��          **********");
		System.out.println("**********    3������          **********");
		System.out.println("**********    4������          **********");
		System.out.println("**********    5��С��          **********");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		//ʵ����
		Bear bear = new Bear("Bill",1);
		Lion lion = new Lion("Lain",2,"��ɫ","��ʨ");
		Monkey monkey = new Monkey("Tom",1,"��˿��");
		Parrot parrot = new Parrot("Rose",1,"ĵ������");
		Clown clown= new Clown("Kahle",5);
		
		boolean flag=true;
		Scanner sc =  new Scanner(System.in);
		test.introduction();
		//����Ĵ�ѭ��
		do {
			int num = sc.nextInt();		
			switch(num) {
			case 1: bear.act();break;
			case 2: lion.act();break;
			case 3: monkey.act();break;
			case 4: parrot.act();break;
			case 5: clown.act();break;
			}
			//�����Ƿ������һ��Сѭ��
			int contint;
			do {
			System.out.println("********�Ƿ�����ۿ�(1/0)*********");
			contint = sc.nextInt();
			if(contint==1) {
				test.introduction();
				}else if(contint ==0) {
					flag=false;//�˴���flag��Ϊfalse��������ѭ��
					break;}
					else {
						System.out.println("*****������Ϣ����ȷ������������*****");
				}	
			}while ((contint!=1)&(contint!=0));		
			
		}while(flag==true);
		System.out.println("**********лл�´ι���************");
	}
}

