import java.io.*;
import java.util.Scanner;

/**
 * Created by Spconway on 12/3/14.
 */
public class Test {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        CompressionClass cc = new CompressionClass();
        File file = new File("file.txt");
        Scanner scan = null;
        try {
            scan  = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scan.hasNext()) {
            String s = scan.nextLine();
            System.out.println("line: " + s);
            if (!s.equals("done")) {
                sb.append(cc.compress(s) + "\n");
            }
        }

        System.out.println(sb.toString());
    }
}
