package pers.imooc.goodsmanage;

import java.util.Scanner;

public class TestDemo {
//三个页面的展示方式
	public static void welcome() {
		System.out.println("******************************************\n"
						 + "              **主菜单**\n"
						 + "              1--商品管理\n"
						 + "              2--购物车\n"
						 + "              0--退出\n"
						 + "******************************************\n"
						 + "请输入数字进行操作：\n");
	}
	public static void goodsManagePage() {
		System.out.println("******************************************\n"
				         + "              **商品管理**\n"
				         + "              1--商品信息导入\n"
				         + "              2--显示所有商品信息\n"
				         + "              9--返回上一级菜单\n"
				         + "******************************************\n"
				         + "请输入对应的数字对商品进行管理：\n");
	}
	public static void cartPage() {
		System.out.println("******************************************\n"
						 + "              **购物车管理**\n"
						 + "              1--添加商品到购物车\n"
						 + "              2--修改购物车的商品数量\n"
						 + "              3--显示购物车的所有商品信息\n"
						 + "              4--结算\n"
						 + "              9--返回上一级菜单\n"
						 + "******************************************\n"
						 + "请输入对应的数字对购物车进行管理：\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingCart shoppingcart = new ShoppingCart();
		GoodsManage gm = new GoodsManage();
		Boolean flag = true;
		
//大循环
		do {
			welcome();
			int key = sc.nextInt();
			switch(key) {
			case 1: {
//商品信息页面的小循环
					Boolean gflag =true;
					do {
						goodsManagePage();
						int gkey = sc.nextInt();
						switch(gkey) {
						case 1:gm.importGoods();break;
						case 2:System.out.println("显示所有商品信息");gm.displayAllGoods();break;
						case 9: gflag=false; break;	
						default: System.out.println("该数字没有对应的操作！");break;
							}
					}while(gflag==true);
					break;
					}
			case 2: {
//购物车页面的小循环
					Boolean sflag = true;
					do {
						cartPage();
						int ckey= sc.nextInt();
						switch(ckey) {
						case 1: System.out.println("添加商品到购物车");gm.displayAllGoods();shoppingcart.addGoodsToCart(gm);break;
						case 2: System.out.println("修改购物车中的商品数量");shoppingcart.updateNumInCart();break;
						case 3: System.out.println("显示购物车中所有商品信息");shoppingcart.displayAllInCart();break;
						case 4: System.out.println("结算");shoppingcart.settleAccounts();break;
						case 9: sflag =false;  break;
						default: System.out.println("该数字没有对应的操作！");break;
						}
						
					}while(sflag==true);
					break;
				}
			case 0: flag =false;break;
			default: System.out.println("该数字没有对应的操作！");break;
			}
		}while(flag == true);
		
		
	}

}
