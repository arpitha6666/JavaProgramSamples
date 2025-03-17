package fileHandlingAndIo;

import java.io.*;

public class FileIOTest {

    FileOutputStream fos;
    ObjectOutputStream os;
    FileInputStream fis;
    ObjectInputStream is;

    public void writeToFileUsingObjectOutStream(File file, Students obj) {
        try {
            fos = new FileOutputStream(file);
            os = new ObjectOutputStream(fos);
            os.writeObject(obj);
            System.out.println("completed");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.flush();
                os.close();
                fos.flush();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void ReadFromFileUsingObjectInStream(File file) {
        try {
            fis = new FileInputStream(file);
            is = new ObjectInputStream(fis);
            Students stu = (Students)is.readObject();
            System.out.println("completed "+stu.toString() );

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                is.close();
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Students obj = new Students("Ahilya", 18);
        File file = new File(System.getProperty("user.dir") + "//" + "fileIo.txt");
        FileIOTest test = new FileIOTest();
        test.writeToFileUsingObjectOutStream(file,obj);
        test.ReadFromFileUsingObjectInStream(file);
    }
}

