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
	
	
	//���췽��
	
	public ShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}
	
	public ShoppingCart() {
		super();
	}

	//getter��setter����
	public Map<String, GoodsInCart> getShoppingCart() {
		return shoppingCart;
	}


	public void setShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	//�����Ʒ�����ﳵ
	public void addGoodsToCart(GoodsManage gm) {
		if(gm.getGoodsSet().isEmpty()) {
			return;
		}
		System.out.println("������Ҫ��ӵ���Ʒ��ţ�");
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
				System.out.println("�������Ʒ����ȷ�����������룺");
				sc.next();
				continue;
			}
		}
		
		System.out.println("������Ҫ��ӵ���Ʒ������");
		int num = sc.nextInt();
		GoodsInCart goodsInCart = new GoodsInCart(g,num);
		goodsInCart.setNum(num);
		shoppingCart.put(goodsId, goodsInCart);		
	}
	
	//�޸Ĺ��ﳵ����Ʒ����
	public void updateNumInCart() {
		if(shoppingCart.isEmpty()) {
			System.out.println("���ﳵ�ǿյģ��Ͻ�װ���ɣ�");
			return;
		}
		System.out.println("������Ҫ�޸ĵ���Ʒ��ţ�");
		String editId = sc.next();
		System.out.println("������Ҫ�޸ĵ���Ʒ����");
		int n = sc.nextInt();
		
		if (n==0) {
			System.out.println("��Ϊ��Ʒ����Ϊ0�����Ը���Ʒ�Ѿ��ӹ��ﳵ�Ƴ�");
			shoppingCart.remove(editId);
			return;
		}
		shoppingCart.get(editId).setNum(n);
		
	}
	//��ʾ���ﳵ�е�������Ʒ
	public void displayAllInCart() {
		if (shoppingCart.isEmpty()) {
			System.out.println("���ﳵ�ǿյģ��Ͻ�װ���ɣ�");
			return;
		}
		Set<Entry<String,GoodsInCart>> entry = shoppingCart.entrySet();
		for(Entry<String,GoodsInCart> e1:entry) {
			System.out.println("��Ʒ���ƣ�"+e1.getValue().getGoods().getGoodsName()+",��Ʒ�۸�"+
		e1.getValue().getGoods().getPrice()+",��Ʒ����"+e1.getValue().getGoods().getGoodsDesp()+",����"+e1.getValue().getNum());
		}
	}
	//����
	public void settleAccounts() {
		if(shoppingCart.isEmpty()) {
			System.out.println("���ﳵ�ǿյģ��Ͻ�װ���ɣ�");
			return;
		}
		Set<String> set = shoppingCart.keySet();
		double sum = 0;
		for(String setlist:set) {
			double gPrice =shoppingCart.get(setlist).getGoods().getPrice();
			int goodsNum = shoppingCart.get(setlist).getNum();
			sum = sum+ gPrice*goodsNum;
		}
		System.out.println("��Ʒ�ܼ�Ϊ��"+sum);
		displayAllInCart();
		shoppingCart.clear();	
	}
}
