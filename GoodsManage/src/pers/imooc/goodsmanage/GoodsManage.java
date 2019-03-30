package pers.imooc.goodsmanage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {
	Set<Goods> goodsSet = new HashSet<Goods>();
	
public GoodsManage() {
		super();
	}

//构造方法
	public GoodsManage(Set<Goods> goodsSet) {
	super();
	this.goodsSet = goodsSet;
}

//getter和setter方法
	public Set<Goods> getGoodsSet() {
		return goodsSet;
	}


	public void setGoodsSet(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}
//商品对象
	Goods g1 = new Goods("goods004","手机",2300.0,"安卓手机");
	Goods g2 = new Goods("goods002","饮水机",299.0,"带净化功能的饮水机");
	Goods g3 = new Goods("goods003","笔记本电脑",4999.0,"15寸笔记本电脑");
	Goods g4 = new Goods("goods001","水杯",56.0,"不锈钢水杯");
	
//商品信息导入
	public void importGoods() {
		System.out.println("商品信息导入");
		goodsSet.add(g1);
		goodsSet.add(g2);
		goodsSet.add(g3);
		goodsSet.add(g4);
		System.out.println("导入成功！");
	}
	
//显示所有商品信息
	public void displayAllGoods() {
		if (goodsSet.isEmpty()) {
			System.out.println("还没有商品。记得导入商品信息哟！");
			return;
		}
		
		System.out.println("所有商品 信息为：");
		Iterator<Goods> it = goodsSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
