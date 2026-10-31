# Sistem Keanggotaan Gym FitTrack

## Deskripsi

FitTrack merupakan program sederhana berbasis Java untuk mengelola data keanggotaan gym. Program ini memungkinkan pengguna menyimpan data member berupa nama, nomor telepon, tanggal pendaftaran, dan jenis paket keanggotaan.

Program menerapkan validasi input untuk memastikan data yang dimasukkan sesuai ketentuan. Jika data tidak valid, program akan menampilkan pesan penolakan dan mempertahankan nilai default atau nilai sebelumnya.

## Fitur

- Menyimpan data member gym.
- Mengelola nama, nomor telepon, tanggal pendaftaran, dan jenis paket.
- Memvalidasi data sebelum disimpan.
- Menyediakan tiga jenis paket: Basic, Premium, dan VIP.
- Menyediakan constructor dengan empat parameter dan constructor dengan tiga parameter.
- Menggunakan nilai default apabila data constructor tidak valid.
- Menampilkan data member menggunakan method `toString()`.
- Menguji beberapa objek member menggunakan array dan perulangan `for`.

## Konsep OOP yang Digunakan

| Konsep | Penerapan |
|---|---|
| Encapsulation | Menggunakan atribut `private` serta getter dan setter. |
| Constructor | Menginisialisasi data member saat objek dibuat. |
| Constructor Overloading | Menyediakan dua constructor dengan parameter berbeda. |
| Method Overriding | Mengubah perilaku `toString()` untuk menampilkan data member. |

## Struktur Proyek

```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```

## Prasyarat

Untuk menjalankan program FitTrack, diperlukan:

- Java Development Kit (JDK) versi 11 atau lebih baru.
- Visual Studio Code atau IntelliJ IDEA.
- Terminal untuk menjalankan program melalui command line.

## Cara Menjalankan Program

### Menggunakan Visual Studio Code

1. Buka folder proyek `tugas1-fittrack` di Visual Studio Code.
2. Pastikan ekstensi Java sudah terpasang.
3. Buka file `TesFitTrack.java`.
4. Klik tombol **Run** pada method `main`.
5. Hasil program akan ditampilkan pada terminal.

### Menggunakan Command Line

1. Buka terminal pada direktori utama proyek.
2. Buat folder output dan kompilasi program dengan perintah:

```bash
javac -d out src/Member.java src/TesFitTrack.java
```

3. Jalankan program menggunakan perintah:

```bash
java -cp out TesFitTrack
```

## Nilai Default

Apabila data yang dimasukkan melalui constructor tidak valid, program akan menggunakan nilai default berikut:

| Atribut | Nilai Default |
|---|---|
| Nama | Tidak diketahui |
| Nomor Telepon | 0000000000 |
| Tanggal Daftar | 01-01-2000 |
| Jenis Paket | Basic |

Nilai default digunakan agar objek tetap memiliki data yang aman ketika proses validasi gagal. Nomor telepon default hanya merupakan nilai pengganti, bukan nomor telepon sungguhan.

## Screenshot Hasil Program

Screenshot berikut digunakan untuk menunjukkan hasil pengujian program.

**1. Hasil Program dengan Data Member**

Simpan screenshot hasil program yang menampilkan seluruh data member di folder `screenshots/` dengan nama `hasil-program.png`.

**2. Hasil Pengujian Validasi**

Simpan screenshot yang memperlihatkan pesan penolakan ketika data tidak valid dan nilai default yang digunakan dengan nama `hasil-validasi.png`.

## Keterbatasan dan Pengembangan

Program FitTrack masih menggunakan penyimpanan data sementara melalui objek dan array. Data member belum disimpan ke database atau file sehingga data akan hilang ketika program dihentikan.

Pengembangan selanjutnya dapat mencakup fitur penyimpanan data permanen, penambahan data member melalui input pengguna, pengubahan dan penghapusan data member, serta integrasi dengan database.
