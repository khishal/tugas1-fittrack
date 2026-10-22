/**
 * Menyimpan data untuk Member gym fitrack
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.format.DateTimeParseException;

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
        if (namaBaru != null && !namaBaru.isBlank()){
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
    
    /**
     * Mengubah tanggal daftar jika tanggal valid.
     *
     * @param tanggalDaftar tanggal baru dengan format dd-MM-yyyy
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-uuuu")
                        .withResolverStyle(ResolverStyle.STRICT);

        try {
            LocalDate.parse(tanggalDaftar, formatter);
            this.tanggalDaftar = tanggalDaftar;
        } catch (DateTimeParseException | NullPointerException e) {
            System.out.println(
                    "Tanggal tidak valid! Gunakan format dd-MM-yyyy.");
        }
    }
    
    /**
     * Mengubah jenis paket jika input valid.
     *
     * @param jenisPaket jenis paket baru yang ingin disimpan
     */
    public void setJenisPaket(String jenisPaket) {
        if ("Basic".equals(jenisPaket)
        || "Premium".equals(jenisPaket)
        || "VIP".equals(jenisPaket)) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println(
                "Jenis paket tidak valid! Pilih Basic, Premium, atau VIP.");
        }
    }

} 