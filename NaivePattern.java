class NaivePattern{
    public static void main(String[] args) {
        String text = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAC";
        String pattern = "AAAAAC";
        // Slide the Pattern On top of Text , Pick One letter each time
        for(int i = 0; i<=text.length() - pattern.length(); i++){
            int j;
            for( j = 0; j<pattern.length(); j++){
                if(text.charAt(i + j)!=pattern.charAt(j)){
                    break;

                }
            }
            if(j== pattern.length()){
                System.out.println("Found "+i);
            }
        }
    }
}