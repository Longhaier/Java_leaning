package pers.imooc.goodsmanage;

public class GoodsInCart {
	private Goods goods;
	private int num;
	//构造方法
	
	public GoodsInCart(Goods goods, int num) {
		super();
		this.goods = goods;
		this.num = num;
	}

	public GoodsInCart() {
		super();
	}

	//getter和setter方法
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
