import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(new FileReader(new File("C:\\altera\\output.txt")));
        System.out.println(readLine());
        reader.close();
    }
}