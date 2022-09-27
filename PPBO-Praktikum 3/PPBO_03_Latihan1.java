// Nama : Adeline Fellita Marwa
// NIM  : M0521002

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTotal;
        double diskon;
        System.out.println("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        hargaTotal = sc.nextInt();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if(hargaTotal<50000){
            diskon = 0;
        }
        else if(hargaTotal<75000){
            diskon = Double.valueOf(hargaTotal)*0.05;
        }
        else if(hargaTotal<125000){
            diskon = Double.valueOf(hargaTotal)*0.15;
        }
        else{
            diskon = Double.valueOf(hargaTotal)*0.2;
        }

        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        System.out.print("total pembelian anda: "+hargaTotal);
        System.out.println("Anda mendapatkan diskon sebesar: "+diskon);
        System.out.println("tagihan Anda sebesar: "+(hargaTotal-diskon));
        // sesuai dengan ketentuan diskon yang diberikan

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000