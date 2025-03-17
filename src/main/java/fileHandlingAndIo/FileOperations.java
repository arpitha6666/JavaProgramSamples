package fileHandlingAndIo;

import java.io.File;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File(System.getProperty("user.dir")+"//"+"mytext.txt");
        System.out.println("File exists ? "+file.exists());
        file.createNewFile();
        System.out.println("File name  "+file.getName());
        System.out.println("File exists ? "+file.exists());
        Thread.sleep(5000);
        boolean newfile =file.renameTo(new File(System.getProperty("user.dir") + "//" + "newMyFile.txt"));
        System.out.println("File name renamed "+ newfile);
        Thread.sleep(5000);
        file = new File(System.getProperty("user.dir") + "//" + "newMyFile.txt");
        System.out.println("File exists ? "+file.exists());
        file.delete();
        System.out.println("File exists ? "+file.exists());
    }
}
