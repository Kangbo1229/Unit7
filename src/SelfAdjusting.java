import java.util.ArrayList;

public class SelfAdjusting {
    private ArrayList<Integer> arr;
    public SelfAdjusting(ArrayList<Integer>arr){
        this.arr = arr;
    }
    public ArrayList<Integer> getArr(){
        return arr;
    }
    public void adjustList(){
        ArrayList<Integer> evenArr = new ArrayList<Integer>();
        for(int i = 2; i <= 20; i += 2){
            evenArr.add(i);
        for(int b = 0; b <= arr.size()-1; b++){
            boolean found = false;
            int loop = arr.get(b);
            for(int a = 0; a < arr.size(); a++){
                if(loop == evenArr.get(a)){
                    evenArr.add(0,  evenArr.remove(a));
                    found = true;
                }
            }
            if(!found) {
                evenArr.add(0, arr.get(b));
            }
        }
        }
        System.out.println(evenArr);
    }
}
