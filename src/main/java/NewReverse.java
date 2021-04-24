public class NewReverse{
    public static void main(String[]args){
        String word = "happy";
        int len= word.length();
        String rev="";

        for (int i =len-1; i>=0; i--){
            rev=rev+word.charAt(i);
        }
        System.out.println(rev);

    }
}