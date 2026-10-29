
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.format.DateTimeParseException;

/**
 * Menyimpan data member gym FitTrack dan memvalidasi
 * data sebelum disimpan.
 */
public class Member {
    private String nama = "Tidak diketahui";
    private String noTelepon = "0000000000";
    private String tanggalDaftar = "01-01-2000";
    private String jenisPaket = "Basic";

    /**
     * Mengambil nama member.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama jika input tidak kosong.
     *
     * @param namaBaru nama baru yang ingin disimpan
     */
    public void setNama(String namaBaru) {
        if (namaBaru != null && !namaBaru.isBlank()) {
            this.nama = namaBaru;
        } else {
            System.out.println("Nama tidak boleh kosong");
        }
    }

    /**
     * Mengambil nomor telepon member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon jika formatnya valid.
     *
     * @param nomorHp nomor baru, harus diawali 0
     *                dan memiliki minimal 10 digit
     */
    public void setNoTelepon(String nomorHp) {
        if (nomorHp != null
                && nomorHp.startsWith("0")
                && nomorHp.length() >= 10
                && nomorHp.matches("[0-9]+")) {
            this.noTelepon = nomorHp;
        } else {
            System.out.println("Nomor telepon '" + nomorHp
            + "' tidak valid untuk member " + this.nama);
        }
    }

    /**
     * Mengambil tanggal pendaftaran member.
     *
     * @return tanggal pendaftaran
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran jika tanggal valid.
     *
     * @param tanggalDaftar tanggal dengan format dd-MM-yyyy
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-uuuu")
                        .withResolverStyle(ResolverStyle.STRICT);

        try {
            LocalDate.parse(tanggalDaftar, formatter);
            this.tanggalDaftar = tanggalDaftar;
        } catch (DateTimeParseException | NullPointerException e) {
            System.out.println("Tanggal '"+ tanggalDaftar
            + "' tidak valid! untuk member "+this.nama + ", Gunakan format dd-MM-yyyy.");
        }
    }

    /**
     * Mengambil jenis paket keanggotaan.
     *
     * @return jenis paket member
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket jika sesuai pilihan yang tersedia.
     *
     * @param jenisPaket paket baru: Basic, Premium, atau VIP
     */
    public void setJenisPaket(String jenisPaket) {
        if ("Basic".equals(jenisPaket)
                || "Premium".equals(jenisPaket)
                || "VIP".equals(jenisPaket)) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println("Jenis paket '" + jenisPaket
            + "' tidak valid! untuk member " +this.nama + ", Mohon Pilih Basic, Premium, atau VIP.");
        }
    }

    /**
     * Membuat member dengan empat data.
     *
     * @param nama nama member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket keanggotaan
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Membuat member dengan paket Basic secara default.
     *
     * @param nama nama member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }

    /**
     * Menampilkan seluruh data member dalam bentuk teks.
     *
     * @return representasi teks data member
     */
    @Override
    public String toString() {
        return "Member{" +
                "nama='" + nama + '\'' +
                ", noTelepon='" + noTelepon + '\'' +
                ", tanggalDaftar='" + tanggalDaftar + '\'' +
                ", jenisPaket='" + jenisPaket + '\'' +
                '}';
    }
}
