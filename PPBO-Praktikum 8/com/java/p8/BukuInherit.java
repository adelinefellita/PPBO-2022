// Nama : Adeline Fellita Marwa
// NIM  : M0521002

package com.java.p8;

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
    Terdapat problem pada super.penulis karena variabel penulis pada class Buku memiliki access modifier private.
    Access modifier private: hanya dapat diakses dari dalam class tersebut.
    Sedangkan class ini berada di luar class Buku tetapi merupakan subclass dari class Buku.
 */