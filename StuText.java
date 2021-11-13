import java.util.TreeSet;
import java.util.Scanner;
import java.io.*;
class StuText{
//   偷了个懒，没有单独建立Stu文件
  public static class Stu implements Comparable<Stu> {
        private String Name;
        private int Math;
        private int English;
        private int Chemical;

        public Stu(String name, int math, int english, int chemical) {
            Name = name;
            Math = math;
            English = english;
            Chemical = chemical;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getMath() {
            return Math;
        }

        public void setMath(int math) {
            Math = math;
        }

        public int getEnglish() {
            return English;
        }

        public void setEnglish(int english) {
            English = english;
        }

        public int getChemical() {
            return Chemical;
        }

        public void setChemical(int chemical) {
            Chemical = chemical;
        }

        public int sum() {
            return Math + English + Chemical;
        }

        @Override
        public String toString() {
            return "Stu{" +
                    "Name='" + Name + '\'' +
                    ", Math=" + Math +
                    ", English=" + English +
                    ", Chemical=" + Chemical +
                    '}';
        }
        @Override
        public int compareTo(Stu o) {
//           这里使用三目节约一点代码量，使用其他判断代码量有些大
            int a = o.sum() - this.sum();
            int b = a==0 ? o.Math-this.Math : a;
            int c = b==0 ? o.English-this.English : b;
            int d = c==0 ? o.Chemical-this.Chemical : c;
            int e = d==0 ? o.Name.compareTo(this.Name) : d;
            return e;
        }
    }
  public static void main(Strings agrs[]){
    Scanner sc = new Scanner(System.in);
    TreeSet<Stu> ts = new TreeSet<>();
    BufferedWriter bw = new BufferedWriter(new FileWriter("D:/迅雷下载/Stu.txt"));//注意文件的位置，按需修改
//     使用循环输入，里面的i可以根据需要进行更改
    for (int i = 0; i < 3; i++) {
        System.out.println("请输入第"+(i+1)+"个学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入Ta的数学成绩：");
        int math = Integer.parseInt(sc.nextLine());
        System.out.println("请输入Ta的英语成绩：");
        int english = Integer.parseInt(sc.nextLine());
        System.out.println("请输入Ta的化学成绩：");
        int chemical = Integer.parseInt(sc.nextLine());
        Stu s = new Stu(name,math,english,chemical);
        ts.add(s);
    }
    for (Stu s : ts) {
        bw.write(s.sum()+"==="+String.valueOf(s));
        bw.newLine();
        bw.flush();
    }
    bw.close();
  }
}
