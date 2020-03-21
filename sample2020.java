import java.util.Scanner;

public class sample2020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("お好きな数字を入力願います" );
        
        
        String str = scan.next();
        int a = Integer.parseInt(str);
        

        if( a <= 100 ) {
            System.out.println("入力値は" + a + "ですのでセーフ" );
     } else {

        System.out.println("入力値" + a + "は大きすぎます" );
     }

       



    }
}