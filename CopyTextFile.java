import java.nio.channels.FileChannel;
//此方法未将异常抛出，可根据需求选择异常是否抛出
class CopyTestFile{
  public static void TextFile() {
//     声明两个FileChannel，用来读取源文件地址和目的文件地址
        FileChannel in = null;
        FileChannel out = null;
//     设置源文件地址和目标文件的地址
        File f1 = new File("D:/迅雷下载/a.txt");//注意文件源地址的修改
        File f2 = new File("D:/迅雷下载/b.txt");//注意目的文件的地址修改
//     使用try用来实现文件内容的获取和传入
        try {
            in = new FileInputStream(f1).getChannel();
            ByteBuffer byteBuffer = in.map(FileChannel.MapMode.READ_ONLY, 0, f1.length());
            out = new FileOutputStream(f2).getChannel();
            out.write(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {//不管结果如何将资源释放
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  public static void main(String[] args){
    TextFile();
  }
}
