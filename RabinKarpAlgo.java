public class RabinKarpAlgo {
    public static void main(String[] args) {
        String text = "abcabeabdabcabe";
        String pattern = "abc"; // 97 + 98 + 99
        int textHash = 0;
        int patternHash = 0;
        int primeRange = 101;
        // Compute the Hash for Pattern and first 3 chars of text , because
        // pattern length is 3
        for(int i = 0 ; i<pattern.length(); i++){
            int ascii = pattern.charAt(i);
            patternHash = (patternHash + ascii) % primeRange;
            textHash = (textHash + text.charAt(i)) % primeRange;
        }
        System.out.println(patternHash);
        System.out.println(textHash);
        // Now Slide the pattern on top of text
        for(int i = 0; i<=text.length() - pattern.length(); i++){
            // if text hash is same as pattern hash
            if(textHash == patternHash){
                // now compare the value char by char
                if(text.substring(i, i + pattern.length()).equals(pattern)){
                    System.out.println("Found "+i);
                }
            }
            // Now Compute the Next Hash (Rolling Hash)
            if(i<text.length() - pattern.length()){
            textHash = (textHash - text.charAt(i) + text.charAt(i + pattern.length())) % primeRange;

        }

    }
}
}

