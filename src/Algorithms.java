import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws FileNotFoundException {
        Scanner one = new Scanner(new File("file1.txt"));
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner two = new Scanner(new File("file2.txt"));
        ArrayList<Integer> num2 = new ArrayList<Integer>();

        ArrayList<Integer> dup = new ArrayList<Integer>();
        for (int i = 0; i < num.size(); i++) {
            if (num2.equals(num.get(i))) {
                dup.add(num2.get(i));
            }
        }
        return dup;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("names.txt"));
        ArrayList<String> num = new ArrayList<String>();
        String blank = "";
        int i = 0;
        while (scan.hasNext()) {
            blank += scan.next();
            num.add(blank);
            i++;
        }
        System.out.println(num);
        for (int a = 0; a < num.size(); a++) {
            String w = num.get(i);
            for (int c = a + 1; c < num.size(); c++) {
                if (w.equals(num.get(c))) {
                    a--;
                    c--;
                }
            }
        }
        return num;
    }

    public static ArrayList<Integer> orderedList() throws FileNotFoundException {
        Scanner one = new Scanner(new File("file1.txt"));
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(one.nextInt());
        while (one.hasNext()) {
            int n = one.nextInt();
        }
        for (int i = 1; i < num.size(); i++) {
            int a = i - 1;
            while (a >= 0 && num.get(a) > num.get(i)) {
                num.set(a + 1, one.nextInt());
                a--;
            }
        }
        return num;
    }
}
