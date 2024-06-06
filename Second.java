import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
public class Second {
    static void show(List<Integer> list){

    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        //a = new Vector<>();
        // Static vs Dynamic Array
        int arr[] = new int[10]; // Static Array
        // Dynamic Array
        List<Integer> list = new ArrayList<>();
        show(list);
        list = new Vector<>();
        show(list);
        for(int i = 1; i<=20; i++){
            list.add(i);
        }
        System.out.println(list);

    }
}
