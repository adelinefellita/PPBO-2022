// Nama : Adeline Fellita Marwa
// NIM  : M0521002

public class PPBO_02_Latihan3 {
    String nim, nama, alamat;
    char jenisKelamin;

    PPBO_02_Latihan3(String nim, String nama, String alamat, char jenisKelamin){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    void printData(){
        System.out.println("NIM             : "+nim);
        System.out.println("Nama            : "+nama);
        System.out.println("alamat          : "+alamat);
        System.out.println("Jenis Kelamin   : "+jenisKelamin);
    }

    public static void main(String[] args) {
        PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs.cetakData();
    }
}

// Buatlah constructor untuk menginisiasi nilai dari variabel
// nim, nama, jenisKelamin, alamat