/**
 * Menyimpan data untuk Member gym fitrack
 */

public class Member{
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
    * Mengambil nama member.
    * @return nama member.
    */

    public String getNama(){
        return nama;
    }

   /**
    * Mengambil nomor telepon.
    * @return nomor telepon.
    */

    public String getNoTelepon(){
        return noTelepon;
    }

   /**
    * Mengambil tanggal daftar.
    * @return tanggal daftar.
    */
    public String getTanggalDaftar(){
        return tanggalDaftar;
    }
    
   /**
    * Mengambil jenis paket.
    * @return jenis paket.
    */
    public String getJenisPaket(){
        return jenisPaket;
    }
} 