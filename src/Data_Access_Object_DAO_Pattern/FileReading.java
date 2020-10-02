package Data_Access_Object_DAO_Pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * the utility class for this package and DAO1
 */

public class FileReading {

    File file;
    List<String> content;
    static List<String[]> TList;
    String firstName, lastName, age, email;


    public FileReading(String filePath) {
        this.file = new File(filePath);
        content = new ArrayList<>();
        TList = new ArrayList<String[]>();
    }

    public List<String[]> readFile() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            content.add(line);
        }
        content.remove(0);
        content.remove(0);
        for (String eachLine : content) {
            splitString(eachLine);
        }
        return TList;
    }

    public void splitString(String str) {
        String[] words = str.split(" ");
        firstName = words[0];
        lastName = words[1];
        age = words[2];
        email = words[3];
        String[] obj = {firstName, lastName, age, email};
        TList.add(obj);
    }

//    public static void main(String[] args) {
//        Data_Access_Object_DAO_Pattern.FileReading reading = new Data_Access_Object_DAO_Pattern.FileReading("C:\\Users\\NancyPC\\Desktop\\Design_Pattern_Java\\src\\StudentDataFile");
//
//
//    }
}
