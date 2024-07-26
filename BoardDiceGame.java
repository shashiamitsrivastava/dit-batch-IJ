import java.util.HashMap;

public class BoardDiceGame {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    static int countWays(int startValue, int endValue){
        // Base Case
        if(startValue == endValue){
            return 1;
        }
        if(startValue>endValue){
            return 0;
        }
        if(memo.get(startValue)!=null){
            return memo.get(startValue);
        }

        int count = 0;
        for(int dice = 1; dice<=6; dice++){
            count = count + countWays(startValue + dice, endValue);
        } 
        System.out.println(startValue);
        memo.put(startValue, count);
        return count;  
    }

    static int countWaysBottomUp(int startValue, int endValue){
        int cache[] = new int[endValue + 1];
        cache[endValue] = 1;
        for(int i = endValue-1; i>=0; i--){
            int count = 0;
            for(int dice = 1; dice<=6 && dice + i <cache.length; dice++){
                count = count + cache[dice + i];
            }
            cache[i] = count;

        }
        return cache[startValue];
          
    }
    public static void main(String[] args) {
        //int count = countWays(0, 10);
        int count = countWaysBottomUp(0, 10);
        System.out.println(count);
       
    }
}
