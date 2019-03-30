package pers.imooc.goodsmanage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ShoppingCart {
	Scanner sc = new Scanner(System.in);
	Map<String,GoodsInCart> shoppingCart = new HashMap<String, GoodsInCart>();
	
	
	//构造方法
	
	public ShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}
	
	public ShoppingCart() {
		super();
	}

	//getter和setter方法
	public Map<String, GoodsInCart> getShoppingCart() {
		return shoppingCart;
	}


	public void setShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	//添加商品到购物车
	public void addGoodsToCart(GoodsManage gm) {
		if(gm.getGoodsSet().isEmpty()) {
			return;
		}
		System.out.println("请输入要添加的商品编号：");
		String goodsId = null;
		Iterator<Goods> it = gm.getGoodsSet().iterator();
		Goods g = null;
		boolean flag = true;
		while(flag) {
			goodsId = sc.next();
			while(it.hasNext()) {
				g = it.next();
				if(g.getGoodsId().equals(goodsId)) {
					flag = false;
					break;
				}
			}if(flag == true) {
				System.out.println("输入的商品不正确，请重新输入：");
				sc.next();
				continue;
			}
		}
		
		System.out.println("请输入要添加的商品数量：");
		int num = sc.nextInt();
		GoodsInCart goodsInCart = new GoodsInCart(g,num);
		goodsInCart.setNum(num);
		shoppingCart.put(goodsId, goodsInCart);		
	}
	
	//修改购物车的商品数量
	public void updateNumInCart() {
		if(shoppingCart.isEmpty()) {
			System.out.println("购物车是空的，赶紧装满吧！");
			return;
		}
		System.out.println("请输入要修改的商品编号：");
		String editId = sc.next();
		System.out.println("请输入要修改的商品数量");
		int n = sc.nextInt();
		
		if (n==0) {
			System.out.println("因为商品简述为0，所以该商品已经从购物车移除");
			shoppingCart.remove(editId);
			return;
		}
		shoppingCart.get(editId).setNum(n);
		
	}
	//显示购物车中的所有商品
	public void displayAllInCart() {
		if (shoppingCart.isEmpty()) {
			System.out.println("购物车是空的，赶紧装满吧！");
			return;
		}
		Set<Entry<String,GoodsInCart>> entry = shoppingCart.entrySet();
		for(Entry<String,GoodsInCart> e1:entry) {
			System.out.println("商品名称："+e1.getValue().getGoods().getGoodsName()+",商品价格"+
		e1.getValue().getGoods().getPrice()+",商品描述"+e1.getValue().getGoods().getGoodsDesp()+",数量"+e1.getValue().getNum());
		}
	}
	//结算
	public void settleAccounts() {
		if(shoppingCart.isEmpty()) {
			System.out.println("购物车是空的，赶紧装满吧！");
			return;
		}
		Set<String> set = shoppingCart.keySet();
		double sum = 0;
		for(String setlist:set) {
			double gPrice =shoppingCart.get(setlist).getGoods().getPrice();
			int goodsNum = shoppingCart.get(setlist).getNum();
			sum = sum+ gPrice*goodsNum;
		}
		System.out.println("商品总价为："+sum);
		displayAllInCart();
		shoppingCart.clear();	
	}
}
