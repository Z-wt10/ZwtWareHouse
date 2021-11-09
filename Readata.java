import java.io.*;
import java.util.ArrayList;

public class Readata{
   public static void ReadData() {
//        创建输入缓冲流对象
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:/迅雷下载/编写文件.txt"));//注意文件的位置，按需修改
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        创建集合对象
        ArrayList<String> arr = new ArrayList<>();
//        读取数据，每次读取一行数据
        String l;
        while (true) {
            try {
                if (!((l = br.readLine()) != null)) break;
                arr.add(l);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
//                    释放资源
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        遍历集合
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);
            System.out.println(s);
        }
    }
}
