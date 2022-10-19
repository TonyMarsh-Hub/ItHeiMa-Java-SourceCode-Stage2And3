package IO.CharStream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo6 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流的对象
        // FileReader fr = new FileReader(new File("charstream\\a.txt"));
        FileReader fr = new FileReader("charstream\\a.txt");


        //读取数据
        //一次读取一个字符
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }

        //释放资源
        fr.close();
    }
}