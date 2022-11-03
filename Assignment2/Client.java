package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.lang.*;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("localhost",4999);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
//        pr.println("0");
        pr.println("1");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);

        String str = br.readLine();
        String[] output = str.split("\t");
        for (String string: output){
            System.out.println(string);
        }
    }
}
