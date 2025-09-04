// FileIOPractice.java
// db 9/4/25

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {

        System.out.printf("\n Welcome to File I/O practice! ");

        // Create a BufferWriter object and use it.
        try {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myOutputFile.txt"));
        bufferedWriter.write(  "\n one");
        bufferedWriter.write(  "\n two");
        bufferedWriter.write(  "\n three");
        bufferedWriter.close();
    } catch (IOException e) {
            e.printStackTrace();
            System.out.println("\n File named myOutputFile.txt successfully created or modified!\n" );
        }
}
}