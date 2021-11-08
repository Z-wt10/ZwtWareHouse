import java.io.*;
class CopyPictureFile{
//   使用异常抛出的方式实现图片文件的复制
  public static void Picture() throws IOException {
        FileInputStream f1 = new FileInputStream("D:/迅雷下载/400.jpg");//注意源文件的地址
        FileOutputStream f2 = new FileOutputStream("D:/迅雷下载/新.jpg");//注意目的文件的地址
        int i;
        byte[] bys = new byte[1024];
        while ((i = f1.read(bys)) != -1) {
            f2.write(bys, 0, i);
        }
        f1.close();
        f2.close();
    }
  public static void main(String[] args) throws IOException {
    Picture();  
  }
}
