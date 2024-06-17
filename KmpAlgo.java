public class KmpAlgo {
    public static void main(String[] args) {
        String text = "bbbbbbb";
        String pattern = "bbb";
        int patternLength = pattern.length();
        int lps[]= new int[patternLength];
        lps[0] = 0; // Because prefix initially
        int length = 0; // Previous longest prefix length
        int i = 1;
        // Filling LPS Array
        // TC and SC = O(N)
         while(i<patternLength){
            if(pattern.charAt(i) == pattern.charAt(length)){
                    length++;
                    lps[i] = length;
                    i++;
            }
            else{
                if(length!=0){
                    length = lps[length-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        // now do the pattern matching
        i = 0; // text 
        int j = 0; // pattern
        while(i<text.length()){
            if(pattern.charAt(j) == text.charAt(i)){
                i++;
                j++;
            }
            if(j==patternLength){
                System.out.println("Pattern Found "+(i-j));
                j= lps[j-1];
            }
            else if (i<text.length() && pattern.charAt(j)!=text.charAt(i)){
                if(j!=0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }

        }

    }
}
