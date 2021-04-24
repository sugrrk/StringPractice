public class Reverse {
    public static void main(String[] args) {
        String str = "madam";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String rev = sb.toString();
        System.out.println(rev);

        if (str.equals(rev)){
            System.out.println("It is a palindrome");

        }
else{
            System.out.println("It is not a palindrome");
        }

    }
}





