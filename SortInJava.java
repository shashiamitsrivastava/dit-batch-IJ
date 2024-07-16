import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class Pair{
    int level;
    int val;
    Pair(int level  , int val){
        this.level = level;
        this.val = val;
    }
    @Override
    public String toString(){
        return "("+level+","+val+")";
    }
}
public class SortInJava {
    public static void main(String[] args) {
       List<Pair> l =  new ArrayList<>();
       l.add(new Pair(0,10));
       l.add(new Pair(1, 20));
       l.add(new Pair(1, 15));
       l.add(new Pair(2, 90));
       l.add(new Pair(2, 40));
       l.sort((a,b)-> (a.level-b.level==0)?a.val - b.val : a.level - b.level);
       System.out.println(l);
    }
}
