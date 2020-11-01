package src.java.main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class init {
    public void initFile() {
        String currentDir = System.getProperty("user.dir");
        final String user_filepath = currentDir + "\\user.txt";
        File filepath = new File(user_filepath);
        Formatter user_db;

        if (filepath.exists()) {

            System.out.println("file exists");
            System.out.println(filepath.getPath());
        } else {
            System.out.println("File isnt created");
            System.out.print("Creating File in" + user_filepath);
            try {
                user_db = new Formatter(user_filepath);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
