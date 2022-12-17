package com.java.p8a;

import com.java.p8.Buku;

public class BukuInherit extends Buku {
    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {

        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
}

/*
Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier? Jelaskan penyebab errornya!
    Terdapat problem pada super.isbn dan buku.tahunTerbit karena variabel isbn dan tahunTerbit pada class Buku memiliki access modifier default.
    Access modifier default: tidak bisa diakses di luar package.
        ('isbn' is not public in 'com.java.p8.Buku'. Cannot be accessed from outside package)
        ('tahunTerbit' is not public in 'com.java.p8.Buku'. Cannot be accessed from outside package)
        
    Terdapat problem pada super.penulis karena variabel penulis pada class Buku memiliki access modifier private.
    Access modifier private: hanya dapat diakses dari dalam class tersebut.
        ('penulis' has private access in 'com.java.p8.Buku')
 */