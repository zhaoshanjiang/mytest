package day_07Pooker;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 斗地主发牌
 * 
 * 1.准备牌
 * 		将54张牌放入一个集合中 或者是数组中
 * 		4中花色
 * 		2 3 4 。。。J Q K A 
 * 		字符串循环拼接即可
 * 		集合中加入 大王 小王
 * 2.洗牌
 * 		Collections.shuffle(List list) 将集合中元素顺序打乱
 * 3.发牌
 * 		三个玩家即使三个容器 集合
 * 		对3取模 交替发牌 
 * 4.看牌
 * 		遍历集合打印字符串
 */
public class Pooker {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String[] colors = { "♥", "♦", "♠", "♣" };
		String s = "2-3-4-5-6-7-8-9-10-J-Q-K-A";
		String[] numbers = s.split("-");
		for (String color : colors) {
			for (String number : numbers) {
				String thisPooker = color + number;
				list.add(thisPooker);
			}
		}
		list.add("大王");
		list.add("小王");
		Collections.shuffle(list);
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			if(i>50){
				dipai.add(list.get(i));
			}
			if (i % 3 == 0) {
				player1.add(list.get(i));
			}
			if (i % 3 == 1) {
				player2.add(list.get(i));
			}
			if (i % 3 == 2) {
				player3.add(list.get(i));
			}
		}
		System.out.println("玩家一的牌:"+player1);
		System.out.println("玩家二的牌:"+player2);
		System.out.println("玩家三的牌:"+player3);
		System.out.println("底牌:"+dipai);
	}
}
