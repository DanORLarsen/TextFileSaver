

import java.io.*;

public class TextToFile {
    static File file = null;

    public static void writeToFile(String text ) throws IOException {
        file = new File("TextToFile.txt");
        System.out.println("Filen findes? = " + file.exists());
        PrintWriter fileSkriver = new PrintWriter(file);
        fileSkriver.print(text);
            fileSkriver.println();
            fileSkriver.close();
    }

    public static void main(String[] args) throws IOException {
        TextToFile.writeToFile("Denne text vil være i filen");
    }
}
