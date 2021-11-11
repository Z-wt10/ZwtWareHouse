import java.io.*;
class CopyFile{
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
}
