// Nama : Adeline Fellita Marwa
// NIM  : M0521002

public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
/*
Apa yang salah dengan source code tersebut?
Jawaban : di line ke-10 terdapat perintah untuk mengubah nilai dari variabel KURS_DOLLAR, 
          hal ini error karena deklarasi variabel KURS_DOLLAR didahului oleh keyword 
          'final', sehingga menyebabkan nilai dari variabel ini tidak bisa dirubah.

Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
Jawaban : Keyword 'static' digunakan untuk mengakses member baik variable ataupun method (prosedur atau fungsi) 
          pada class tertentu tanpa harus membuat suatu objek dari class itu.
*/