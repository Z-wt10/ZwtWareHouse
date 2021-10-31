/**
     * (斐波那契数列)
     * 	有一对兔子，从出生后的第三个月开始，每个月都会生一对小兔子，
     * 	小兔子张到第三月，每个月也会生一对小兔子。
     * 	假设兔子都不死，问到第二十个月的时候一共有多少对兔子？
     */
public class demo{
    public static void main(String[] args) {
        for (int counter = 1; counter <= 20; counter++) {
            System.out.println("第"+counter +"月的兔子数为："+rabbit(counter)+"只");
        }
    }
// 使用递归实现斐波那契额数列
    public static long rabbit(long num) {
        if ((num == 0) || (num == 1))
            return num;
        else
            return rabbit(num - 1) + rabbit(num - 2);
    }
}
