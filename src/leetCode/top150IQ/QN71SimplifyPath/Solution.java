package leetCode.top150IQ.QN71SimplifyPath;

public class Solution {
    public static String simplifyPath(String path) {
       StringBuilder sb = new StringBuilder();
       String[] parts = path.split("/");
       for(String part: parts){
           if(part.equals("") || part.equals(".")) continue;
           else if(part.equals("..")){
               int length = sb.length();
               if(length > 1) sb.setLength(sb.lastIndexOf("/"));
           }
           else sb.append("/").append(part);
       }
        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        String str = "/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(str));
    }
}
