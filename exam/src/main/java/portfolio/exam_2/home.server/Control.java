package portfolio.exam_2.home.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by KO3AK on 16-09-2016.
 */
public class Control {

    public Control() {

    }
    public boolean checkWord(String first, String second) {
        String username;
        String password;
        boolean check = false;
        try {
            File file = new File("C:/JAVA/java/newprojects/exam/src/main/java/text/names.txt");
            Scanner out = new Scanner(file);
            while (out.hasNextLine()) {
                username = out.next();
                password = out.next();
                if(username.equals(first)) {
                    if(password.equals(second)) {
                        check = true;
                        return check;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.print("FUCK !!!");
        }
        return check;
    }

}
