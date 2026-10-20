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
    * Mengubah nama member jika input valid.
    *
    * @param namaBaru nama baru yang ingin disimpan
    */

    public void setNama(String namaBaru){
        if (namaBaru != null && namaBaru.isBlank()){
            this.nama = namaBaru;
        }else {
            System.out.println("Nama tidak boleh kosong");
        }
    }

   /**
    * Mengambil nomor telepon.
    * @return nomor telepon.
    */

    public String getNoTelepon(){
        return noTelepon;
    }

    /**
    * Mengubah Nomor Telepon jika input valid.
    *
    * @param nomorHp nomor baru yang ingin disimpan
    */

    public void setNoTelepon(String nomorHp){
        if (nomorHp != null
        && nomorHp.startsWith("0")
        && nomorHp.length() >= 10
        && nomorHp.matches("[0-9]+")){
            this.noTelepon = nomorHp;
        }else{
            System.out.println("Nomor telepon tidak valid");
        }
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