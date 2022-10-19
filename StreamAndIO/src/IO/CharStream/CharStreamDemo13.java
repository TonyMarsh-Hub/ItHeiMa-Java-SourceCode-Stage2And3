package IO.CharStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo13 {
    public static void main(String[] args) throws IOException {
        //字符缓冲流的特有功能
        //字符缓冲输入流BufferedReader： readLine 读一整行

        //创建对象
        BufferedReader br = new BufferedReader(new FileReader("charstream\\a.txt"));


        //使用循环来进行改进
        String line;
        //可以读取一整行数据。一直读，读到回车换行为止。
        //但是他不会读取回车换行符。
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //释放资源
        br.close();

    }
}
