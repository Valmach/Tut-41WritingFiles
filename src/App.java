import java.io.*;

/**
 * Created by valmach on 17/02/2017.
 */
public class App {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;

            while ((line = br.readLine()) != null)
                System.out.println(line);

        } catch (FileNotFoundException e) {
            System.out.println("Cant find files " + file.toString());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to close file " + file.toString());
        }

    }
}
