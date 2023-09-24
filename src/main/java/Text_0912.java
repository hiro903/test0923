import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Text_0912 {
    static void methot1() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("method1.txt"));
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(input);
        }
    }

    public static void main(String[] args) {
        try {
            methot1();
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");

        }
    }
}