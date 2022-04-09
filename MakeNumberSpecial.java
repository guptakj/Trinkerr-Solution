import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeNumberSpecial {

    public static int makeNumberSpecial(Integer number){
        int count = 0 ;

        while(!number.equals(1)) {
            number = findSquare(number);
            count++;

            if(count>1000)
                return -1;
        }
        return count;
    }

    private static Integer findSquare(Integer number) {
        Integer sq= 0;
        Integer n  = number;
        while(n>0){
            Integer x =n%10;
            n = n/10;

            sq+=x*x;
        }

        return sq;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Integer  number= sc.nextInt();
        System.out.println(makeNumberSpecial(number));
    }
}
