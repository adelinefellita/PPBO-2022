// Nama : Adeline Fellita Marwa
// NIM  : M0521002

public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;
        
        // ubah variabel a dan c ke tipe data double
        double Akonversi = Double.valueOf(a);
        double Ckonversi = Double.valueOf(c);
        
        // jumlahkan variabel a, b, dan c
        double d = Akonversi + b + Ckonversi;
        
        // tampilkan hasil penjumlahan ketiga variabel
        System.out.println("a + b + c = "+d);
    }
}

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */