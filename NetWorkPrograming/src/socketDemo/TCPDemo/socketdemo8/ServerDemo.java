package socketDemo.TCPDemo.socketdemo8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket accept = ss.accept();

        //网络中的流,从客户端读取数据的
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //本地的IO流,把数据写到本地中,实现永久化存储
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("socketmodule\\ServerDir\\copy.jpg"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        //将字节输入流FileInputStream   转成     字符输入流  Fliereader

        //通过转换流
        InputStreamReader inputStreamReader = new InputStreamReader(accept.getInputStream());

        //通过缓冲输入字符流
        BufferedReader br = new BufferedReader(inputStreamReader);


        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(accept.getOutputStream());
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        bos.close();
        accept.close();
        ss.close();


    }
}
