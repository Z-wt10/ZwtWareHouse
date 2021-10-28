/*
版本：Java11
时间：21/10/27
实现：模拟游戏斗地主的洗牌，发牌，看牌
方法不唯一
*/
import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        建立一LinkList类型的card用来保存总牌数和手牌及底牌
        LinkedList<String> card = new LinkedList();
//        使用循环创建总牌数，一共四种花色个13张和大王和小王
        String[] c = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};
        for (int i = 0; i < 4; i++) {
            for (String s : c) {
                if (i == 0)
                    card.add("方片" + s);
                if (i == 1)
                    card.add("梅花" + s);
                if (i == 2)
                    card.add("红桃" + s);
                if (i == 3)
                    card.add("黑桃" + s);
            }
        }
        card.add("大王");
        card.add("小王");
        Collections.reverse(card);
        Collections.shuffle(card);
//        System.out.println(card);//本行及上两行用来检查上面的牌是否为我们想要的
//        截至到此扑克的创建结束
//        创建底牌（设置为三张）以及三个玩家（平均每人17张牌）
        LinkedList<String> User1 = new LinkedList();
        LinkedList<String> User2 = new LinkedList();
        LinkedList<String> User3 = new LinkedList();
        LinkedList<String> Card = new LinkedList();
//        再次利用循环获取并为底牌和玩家传值
        for (int i = 0; i < card.size(); i++) {
            if (i < 3)
                Card.add(String.valueOf(card.get(i)));
            if (i % 3 == 0 && i > 2)
                User1.add(String.valueOf(card.get(i)));
            if (i % 3 == 1 && i > 3)
                User2.add(String.valueOf(card.get(i)));
            if (i % 3 == 2 && i > 3)
                User3.add(String.valueOf(card.get(i)));
        }
//        显示下是否符合日常逻辑
        System.out.println("底牌为：" + Card);
        System.out.println("玩家一的手牌为：：" + User1);
        System.out.println("玩家二的手牌为：：" + User2);
        System.out.println("玩家三的手牌为：：" + User3);
    }
}
