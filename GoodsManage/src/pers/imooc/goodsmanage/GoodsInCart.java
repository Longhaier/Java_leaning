package pers.imooc.goodsmanage;

public class GoodsInCart {
	private Goods goods;
	private int num;
	//���췽��
	
	public GoodsInCart(Goods goods, int num) {
		super();
		this.goods = goods;
		this.num = num;
	}

	public GoodsInCart() {
		super();
	}

	//getter��setter����
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
