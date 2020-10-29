package src.java.main;
import java.io.File;

public class init {
    public void createFile(){
        String currentDir = System.getProperty("user_id");
        File filepath = new File(currentDir + "file.txt");
        System.out.println("File Created");
    }
    
}
