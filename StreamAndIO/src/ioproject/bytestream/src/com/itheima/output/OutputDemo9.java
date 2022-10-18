package ioproject.bytestream.src.com.itheima.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo9 {
    public static void main(String[] args) throws IOException {
        //创建了字节输入流,准备读数据.
        FileInputStream fis = new FileInputStream("C:\\itheima\\a.avi");
        //创建了字节输出流,准备写数据.
        FileOutputStream fos = new FileOutputStream("bytestream\\a.avi");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
