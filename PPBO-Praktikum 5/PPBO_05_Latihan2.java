import java.util.Scanner;

public class PPBO_05_Latihan2{
    public static void main (String[] args){
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        input.close();

        int regex;
        if(s.matches("^[aAiIuUeEoO].*")){
            regex=1;
        }
        else if(s.matches("^(.*[^ng])(ng)")){
            regex=2;
        }
        else{
            regex=-1;
        }
        System.out.println(regex);
    }
}