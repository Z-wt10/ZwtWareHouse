import java.io.*;
import java.util.Arrays;
public class Sort{
  public static void TextSort() throws IOException {
//        使用缓冲流(BufferedReader)读取，循环读取每一行并排序，写入文件中，释放资源
        BufferedReader br = new BufferedReader(new FileReader("D:/迅雷下载/编写文件.txt"));//注意源文件地址
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/迅雷下载/编写文件01.txt"));//注意目标文件地址
        String s = null;
        while ((s = br.readLine()) != null) {
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            bw.write(chs);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
  public static void main(String[] args){
    TextSort();
  }
}
