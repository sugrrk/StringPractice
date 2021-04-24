public class Conversion {
    public static void main(String[] args){
////        String s = 50+50+"Hello"+20+20;
////        System.out.println(s);
////        int date = 31;
////        String month ="January";
////        int year = 2021;
////        System.out.println(month+date  +  year);
//        String s= "JavaProgram";
//        System.out.println(s.substring(4,11));
//        System.out.println(s.charAt(10));
//        System.out.println(s.length());
//        System.out.println(s.concat("language"));

        String s1= "java";
        String s2 = "java";
        String s3=new String("java");
        String s4= new String("java");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);
   }
}
