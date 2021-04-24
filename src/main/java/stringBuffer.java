public class stringBuffer {


    public static void main(String[] args) {
        //StringBuffer sb = new StringBuffer("Chrome");
        //System.out.println(sb.append("  Chrome"));
        //System.out.println(sb.replace(1,3,"Google"));
        //System.out.println(sb.insert(2,"How"));
        //System.out.println(sb.delete(1,3));
        //System.out.println(sb.reverse());
        //System.out.println(sb.capacity());
//        StringBuffer sb = new StringBuffer("Sleeping");
//        System.out.println(sb.append(" class"));
//        System.out.println(sb.reverse());
        String s = "suganya";
        String rev = "";
        char ch[] = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }


        if (s.equals(rev)) {

            System.out.println("Its a palindrome");
        } else {
            System.out.println("Its not a palindrome");

        }
    }
}




