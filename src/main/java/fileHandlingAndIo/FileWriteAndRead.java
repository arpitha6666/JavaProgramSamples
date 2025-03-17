package fileHandlingAndIo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteAndRead {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir") + "//" + "filereadwrite.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text = sc.nextLine();
        writeToFile(text, file);
        readFromFile(file);
    }


    public static void writeToFile(String text, File file) throws IOException {
        System.out.println(text);
        FileWriter wr = new FileWriter(file);
        wr.write(text);
        wr.flush();
        wr.close();
    }

    public static void readFromFile(File file) throws IOException {
        FileReader rd = new FileReader(file);
        int i=0;
        while((i= rd.read())!= -1){
            System.out.print((char)i);
        }
        rd.close();
    }
}

