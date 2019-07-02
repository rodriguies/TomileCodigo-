import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            String line = s.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("end")) {
                break;
            }
        }
    }
}
