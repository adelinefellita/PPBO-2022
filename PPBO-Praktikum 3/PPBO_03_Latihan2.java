import java.util.Scanner;

class PPBO_03_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        // tuliskan kodemu di sini
        System.out.println("input: "+year);
        if(year % 4 ==0){
            System.out.println("output: "+year +" is a leep year");
        }   
        else{
            System.out.println("output: "+year +" is not a leap year");
        } 

        sc.close();
    }
}

// Buatlah conditional statement untuk melakukan pengecekan terhadap input variabel 'year'
// Cek apakah input merupakan tahun kabisat
// Jika tahun kabisat, berikat output '... is a leap year'
// Jika bukan tahun kabisat, berikan output '... is not a leap year'
// ... di atas maksudnya adalah nilai variabel 'year' yang diinputkan

// Contoh 
// input : 2020
// output : 2020 is a leap year

// Contoh
// input : 2031
// output : 2031 is not a leap year