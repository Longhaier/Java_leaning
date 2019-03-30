package pers.imooc.goodsmanage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {
	Set<Goods> goodsSet = new HashSet<Goods>();
	
public GoodsManage() {
		super();
	}

//���췽��
	public GoodsManage(Set<Goods> goodsSet) {
	super();
	this.goodsSet = goodsSet;
}

//getter��setter����
	public Set<Goods> getGoodsSet() {
		return goodsSet;
	}


	public void setGoodsSet(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}
//��Ʒ����
	Goods g1 = new Goods("goods004","�ֻ�",2300.0,"��׿�ֻ�");
	Goods g2 = new Goods("goods002","��ˮ��",299.0,"���������ܵ���ˮ��");
	Goods g3 = new Goods("goods003","�ʼǱ�����",4999.0,"15��ʼǱ�����");
	Goods g4 = new Goods("goods001","ˮ��",56.0,"�����ˮ��");
	
//��Ʒ��Ϣ����
	public void importGoods() {
		System.out.println("��Ʒ��Ϣ����");
		goodsSet.add(g1);
		goodsSet.add(g2);
		goodsSet.add(g3);
		goodsSet.add(g4);
		System.out.println("����ɹ���");
	}
	
//��ʾ������Ʒ��Ϣ
	public void displayAllGoods() {
		if (goodsSet.isEmpty()) {
			System.out.println("��û����Ʒ���ǵõ�����Ʒ��ϢӴ��");
			return;
		}
		
		System.out.println("������Ʒ ��ϢΪ��");
		Iterator<Goods> it = goodsSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
