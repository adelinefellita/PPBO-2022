import java.util.Scanner;

public class PPBO_05_Latihan3{
    public static void main (String[] args){
        char a, b;
        Scanner input = new Scanner(System.in);
        a = input.next().charAt(0);
        b = input.next().charAt(0);
        String result = "";

        if(a>b){
            for(;b<=a; b++){
                result +=b;
            }
        }
        else{
            for(;a<=b; a++){
                result +=a;
            }
        }
        System.out.print(result);
    }
}