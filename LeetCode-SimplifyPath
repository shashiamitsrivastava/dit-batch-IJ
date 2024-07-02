class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
       String[] paths =  path.split("/");
       for(String currentPath : paths){
            if(currentPath.equals(".") || currentPath.trim().length()==0){
                continue; // skip the current iteration
            }
            else if(currentPath.equals("..")){
                if(!stack.isEmpty()){
                // Level Up
                stack.pop();
                }
            }
            else{
               stack.push(currentPath); 
            }
       }
       // Stack Path --> Convert Canonical Path Convert
       // Start with Slash
       StringBuilder canonicalPath = new StringBuilder();
       for(String cpath : stack){
            canonicalPath.append("/");
            canonicalPath.append(cpath);
       }
       return canonicalPath.toString().length()>0?canonicalPath.toString():"/";
    }
}
