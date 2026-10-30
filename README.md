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
