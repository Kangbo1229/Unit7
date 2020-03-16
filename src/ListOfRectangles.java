import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
    public static ArrayList<Rectangle> getRectangles() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("rectangle.txt"));
        ArrayList<Rectangle> num = new ArrayList<Rectangle>();
        while(scan.hasNext()){
            double w = scan.nextDouble();
            double l = scan.nextDouble();
            num.add(new Rectangle (l,w));
        }
        return num;
    }
    public static double findAverage(ArrayList<Rectangle> rectangles){
        double num = 0.0;
        double n = rectangles.size();
        for(int i = 0; i < rectangles.size(); i++) {
            num += rectangles.get(i).area();
        }
        double a = num/n;
        return a;
    }
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <Rectangle> num = getRectangles();
        System.out.println("Average area = "+findAverage(num));
    }
}
