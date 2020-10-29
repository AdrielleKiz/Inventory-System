package src.java.main;
import java.io.File;
import javax.swing.JFrame;

public class init {
    public void createFile(){
        String currentDir = System.getProperty("user_id");
        File filepath = new File(currentDir + "file.txt");
        System.out.println("File Created");
    }
    public boolean landingPage(boolean x) {
        JFrame frame = new JFrame();
        frame.setVisible(x);
        return x;
    }
}
