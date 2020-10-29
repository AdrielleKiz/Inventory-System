package src.java.main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

import javax.swing.JFrame;

public class init {
    public void createFile() {
        String currentDir = System.getProperty("user.dir");
        final String user_filepath = "D:\\Users\\Adrielle\\OneDrive - STI College Cubao\\Second year\\HCI\\Inventory System\\user.txt";
        File filepath = new File(user_filepath);
        Formatter user_db;

        if (filepath.exists()) {

            System.out.println("file exists");
            System.out.println(filepath.getPath());
        } else {
            System.out.println("File isnt created");
            System.out.print("Creating File...");
            try {
                user_db = new Formatter(user_filepath);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public boolean landingPage(boolean x) {
        JFrame frame = new JFrame();
        frame.setVisible(x);
        return x;
    }
}
