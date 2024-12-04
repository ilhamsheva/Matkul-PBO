package com.kuliah.sample;

public class Siswa {
    private String nama; // Private: hanya bisa diakses dalam kelas ini
    private int nilaiUjian; // Private: hanya bisa diakses dalam kelas ini

    // Constructor
    public Siswa(String nama, int nilaiUjian) {
        this.nama = nama;
        setNilaiUjian(nilaiUjian); // Gunakan setter untuk validasi nilai awal
    }

    // Getter untuk nama 
    public String getNama() {
        return nama;
    }

    // Setter untuk nama 
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nilai ujian
    public int getNilaiUjian() {
        return nilaiUjian;
    }

    // Setter untuk nilai ujian
    public void setNilaiUjian(int nilaiUjian) {
        // Validasi nilai (0-100)
        if (nilaiUjian >= 0 && nilaiUjian <= 100) {
            this.nilaiUjian = nilaiUjian;
        } else {
            System.out.println("Nilai harus antara 0 dan 100.");
        }
    }

    // Metode untuk menampilkan informasi siswa 
    public void tampilkanInfo() {
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Nilai Ujian: " + nilaiUjian);
    }
}
