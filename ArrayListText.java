import java.io.*;
import java.util.ArrayList;

public class ArrayListTex{
   public static void ArrayListText(String arrayList) {
//        封装数据与创建集合对象
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add(String.valueOf(arrayList));
//        封装目的地
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("D:/迅雷下载/编写文件.txt"));//注意这里的文件位置需要根据实际情况进行修改
        } catch (IOException e) {
            e.printStackTrace();
        }
//        遍历集合
        for (String s : stringArrayList) {
//            写数据
            try {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
//              释放资源
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
   public static void main(String[] args){
//       可以根据自己的想法编写字符串
      ArrayListText("fdsare4321");
   }
}
