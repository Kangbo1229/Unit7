import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<Integer> numberList(){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(0);
        num.add(-5);
        num.add(7);
        num.add(12);
        num.add(-1);
        System.out.println(num);
        num.add(2,10);
        num.set(1,9);
        System.out.println(num);
        num.remove(4);
        System.out.println(num);
        return num;
    }
    public static ArrayList<Double> firstAndLast(){
        System.out.println("Enter a decimal number (0 to quit):");
        ArrayList<Double> num = new ArrayList<Double>();
        double a = scan.nextDouble();
        while(a != 0){
            a = scan.nextDouble();
            if (a == 0){
                break;
            }
        }
        ArrayList<Double> num2 = new ArrayList<Double>();
        num2.add(num.get(0));
        num2.add(num.size()-1.0);
        num2.add((double)num.size());
        return num;
    }
    public static ArrayList<Double> getNumbers(){
        ArrayList<Double> num = new ArrayList<Double>();
        System.out.print("Number? ");
        num.add(scan.nextDouble());
        System.out.print("Number? ");
        num.add(scan.nextDouble());
        System.out.print("Number? ");
        num.add(scan.nextDouble());
        System.out.print(num);
        return num;
    }
    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
        ArrayList<Double> num = new ArrayList<Double>();
        double a = numbers.get(0);
        double b;
        int index = numbers.size() - 1;
        while(index > 0){
            if(numbers.get(index) < numbers.get(index - 1)){
                a = numbers.get(index - 1);
                b = numbers.get(index);
                numbers.set(index, a);
                numbers.set(index - 1,b);

            }

            index--;
        }
        return numbers;
    }
}
