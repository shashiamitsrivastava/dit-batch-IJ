class SearchAndReplace{

    static String searchAndRemove(String str, 
    char search){
        // Base Case
        if(str.length()==0){
            return "";
        }
        // Small Problem
        String result = searchAndRemove(str.substring(1), 
        search);
        if(str.charAt(0)==search){
            return  result;
        }
        else{
            return str.charAt(0) + result;
        }
    }

    static String searchAndReplace(String str, 
    char search, char replace){
        // Base Case
        if(str.length()==0){
            return "";
        }
        // Small Problem
        String result = searchAndReplace(str.substring(1), 
        search, replace);
        if(str.charAt(0)==search){
            return replace + result;
        }
        else{
            return str.charAt(0) + result;
        }
    }
    public static void main(String[] args) {
        // String result = searchAndReplace("Hello",
        //  'l', 'x');
        //  System.out.println(result);
        String result = searchAndRemove("Hello",
        'l');
        System.out.println(result);
    }
}