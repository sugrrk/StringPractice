public class Rev1 {
//    public static void main(String[] args){
//        String s="Hello World";
//        String rev ="";
//        char ch[]= s.toCharArray();
//        for(int i=ch.length-1;i>=0;i--){
//            rev=rev+ch[i];
//        }
//        System.out.println(rev);
//    }
//
//}
//    public static void main(String[]args){
//        String s = "Hello World";
//        String rev = "";
//        char ch[]=s.toCharArray();
//        for (int i= ch.length -1;i>=0;i++){
//            rev= rev+ch[i];
//        }
//        System.out.println(rev);
//    }
public static void main(String[] args){
    String s= "Hello World";
    String rev= "";
    char ch[]=s.toCharArray();
    for(int i = ch.length-1;i>=0;i--){
        rev = rev+ch[i];

    }
    System.out.println(rev);
}
}


