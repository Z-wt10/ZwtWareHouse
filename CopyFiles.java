import java.io.*;
/**
*大致思路：1.获取文件夹的位置
*         2.如果文件为文件夹，则创建文件夹，并进入文件夹中复制文件信息
*         3.如果文件为非文件夹，则复制文件
*/
class CopyFiles{
//   单级文件夹的复制
  public static void CopyFile(File f01, File f02) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f02));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f01));
        byte[] by = new byte[1024];
        int len;
        while ((len = bis.read(by)) != -1) {
            bos.write(by, 0, len);
        }
        bis.close();
        bos.close();
    }
//   多级文件夹的复制
  public static void CopyFiles(File srcfile, File newfile) throws IOException {
        if (srcfile.isDirectory()) {
            String srcfileName = srcfile.getName();
            File newFolder = new File(newfile, srcfileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            File[] files = srcfile.listFiles();
            for (File file : files) {
                CopyFile(file, newFolder);
            }
        } else {
            CopyFile(srcfile, new File(newfile, srcfile.getName()));
        }
    }
  public static main(String[] agrs){
       File srcfile = new File("D:/迅雷下载/测试文件夹");//需要被复制的文件夹的位置
       File newfile = new File("D:/迅雷下载/测试文件夹01");//文件夹复制后的位置
       try {
           CopyFiles(srcfile,newfile);
       } catch (IOException e) {
           e.printStackTrace();
       }
  }
}
