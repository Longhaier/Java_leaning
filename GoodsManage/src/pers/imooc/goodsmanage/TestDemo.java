package pers.imooc.goodsmanage;

import java.util.Scanner;

public class TestDemo {
//����ҳ���չʾ��ʽ
	public static void welcome() {
		System.out.println("******************************************\n"
						 + "              **���˵�**\n"
						 + "              1--��Ʒ����\n"
						 + "              2--���ﳵ\n"
						 + "              0--�˳�\n"
						 + "******************************************\n"
						 + "���������ֽ��в�����\n");
	}
	public static void goodsManagePage() {
		System.out.println("******************************************\n"
				         + "              **��Ʒ����**\n"
				         + "              1--��Ʒ��Ϣ����\n"
				         + "              2--��ʾ������Ʒ��Ϣ\n"
				         + "              9--������һ���˵�\n"
				         + "******************************************\n"
				         + "�������Ӧ�����ֶ���Ʒ���й���\n");
	}
	public static void cartPage() {
		System.out.println("******************************************\n"
						 + "              **���ﳵ����**\n"
						 + "              1--�����Ʒ�����ﳵ\n"
						 + "              2--�޸Ĺ��ﳵ����Ʒ����\n"
						 + "              3--��ʾ���ﳵ��������Ʒ��Ϣ\n"
						 + "              4--����\n"
						 + "              9--������һ���˵�\n"
						 + "******************************************\n"
						 + "�������Ӧ�����ֶԹ��ﳵ���й���\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingCart shoppingcart = new ShoppingCart();
		GoodsManage gm = new GoodsManage();
		Boolean flag = true;
		
//��ѭ��
		do {
			welcome();
			int key = sc.nextInt();
			switch(key) {
			case 1: {
//��Ʒ��Ϣҳ���Сѭ��
					Boolean gflag =true;
					do {
						goodsManagePage();
						int gkey = sc.nextInt();
						switch(gkey) {
						case 1:gm.importGoods();break;
						case 2:System.out.println("��ʾ������Ʒ��Ϣ");gm.displayAllGoods();break;
						case 9: gflag=false; break;	
						default: System.out.println("������û�ж�Ӧ�Ĳ�����");break;
							}
					}while(gflag==true);
					break;
					}
			case 2: {
//���ﳵҳ���Сѭ��
					Boolean sflag = true;
					do {
						cartPage();
						int ckey= sc.nextInt();
						switch(ckey) {
						case 1: System.out.println("�����Ʒ�����ﳵ");gm.displayAllGoods();shoppingcart.addGoodsToCart(gm);break;
						case 2: System.out.println("�޸Ĺ��ﳵ�е���Ʒ����");shoppingcart.updateNumInCart();break;
						case 3: System.out.println("��ʾ���ﳵ��������Ʒ��Ϣ");shoppingcart.displayAllInCart();break;
						case 4: System.out.println("����");shoppingcart.settleAccounts();break;
						case 9: sflag =false;  break;
						default: System.out.println("������û�ж�Ӧ�Ĳ�����");break;
						}
						
					}while(sflag==true);
					break;
				}
			case 0: flag =false;break;
			default: System.out.println("������û�ж�Ӧ�Ĳ�����");break;
			}
		}while(flag == true);
		
		
	}

}
