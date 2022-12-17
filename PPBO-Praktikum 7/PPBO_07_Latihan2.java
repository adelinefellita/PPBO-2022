// Nama : Adeline Fellita Marwa
// NIM  : M0521002

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.util.Scanner;

public class PPBO_07_Latihan2 {
	// method ini untuk input teks oleh user melalui keyboard
	public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		Scanner sc = new Scanner(System.in);
		// ambil 1 kalimat, setelah tekan enter teks akan diambil
		String str1 = sc.nextLine();
        sc.close();
		return str1;
	}

	// untuk menyimpan teks yang diketik user ke file
	public void simpanTeks(String teks) {
		// set up file and stream
		// ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
		File outFile2 = new File("sample4.data");
        try {
            outFile2.createNewFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
		FileOutputStream outFileStream=null;
		try {
			outFileStream = new FileOutputStream(outFile2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if(outFileStream!=null){
			try {
				DataOutputStream dataOutStream;
				dataOutStream = new DataOutputStream(outFileStream);
				dataOutStream.writeBytes(teks);
				dataOutStream.close();

				System.out.println("file berhasil disimpan");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("file gagal disimpan");
		}
		
	}

	public static void main(String[] args) {
		PPBO_07_Latihan2 it = new PPBO_07_Latihan2();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

/*
Jelaskan perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes()
Jawab:
    PrintWriter.write() mencetak string ke dalam file secara langsung.
    DataOutputStream.writeBytes() mencetak setiap karakter pada string dalam bytes.
*/