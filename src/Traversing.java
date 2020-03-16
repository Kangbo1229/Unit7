import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
    public static ArrayList<String> getStates() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<String>();
        System.out.print("Enter the name of a state or \"Stop\" to quit: ");
        String a = scan.next();
        while (a == "Stop") {
            System.out.println("Next state or \"Stop\": ");
            break;
        }
        return num;
    }

    public static String createList(ArrayList<String> states) {
        String blank = "";
        for (int i = 0; i <= states.size() - 1; i++) {
            blank += states.get(i);
            blank += " -> ";
        }
        blank += states.get(states.size() - 1);
        return blank;
    }

    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        Scanner file = new Scanner(new File("numbers.txt"));
        ArrayList<Integer> num = new ArrayList<Integer>();
        while (file.hasNext()) {
            num.add(file.nextInt());
        }
        int L = num.get(0);
        int S = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            if (S > num.get(i)) {
                S = num.get(i);
            } else if (L < num.get(i)) {
                L = num.get(i);
            }
        }
            num.add(0, S);
            num.remove(S);
            num.add(L);
            return num;
    }
}