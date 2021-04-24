import java.sql.SQLOutput;
import java.util.Locale;

public class stringPractice {
    public static void main(String[]args){
        //String s = "google";//literal(scp)
//        String s1 = "google";//literal(scp)
//        String s2 = new String("google");//new keyword(both)
//        String s3 = new String("google");
//        String s4 = "google";
//        System.out.println(s.equals(s1));//true
//       System.out.println(s.equals(s2));//true
//       System.out.println(s2.equals(s3));//true
//        System.out.println(s==s1);//true
//       System.out.println(s1==s2);//false
//       System.out.println(s2==s3);//false
//        System.out.println(s1==s4);//true
//        System.out.println(s==s2);//false
//        System.out.println(s);
//        String first=s.substring(0,4);
//        String last =s.substring(5);
//        System.out.println(first.toUpperCase()+last.toLowerCase());
        String s = "My";
        System.out.println(s.toUpperCase());
        String s1 = "name";
        char ch []=s1.toCharArray();
        for(int i = ch.length+1;i<=0;i++){
            s1.indexOf(s1,0);
            System.out.println(s1);

        }
  }
}
