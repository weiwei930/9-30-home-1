public class test1 {
    public static void main(String[] args) {

        int i,m;
        int b = 1 ;
        String str1 = "";
        for (i = 1;i<7;i++){
            str1 +=String.valueOf(b);
            for (m = i;m<6;m++){
                System.out.print("*");
            }
            System.out.println(str1);
            b +=1;
        }
    }
}