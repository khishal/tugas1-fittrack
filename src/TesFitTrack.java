
/**
 * Menguji sistem keanggotaan gym FitTrack.
 */
public class TesFitTrack {

    /**
     * Menjalankan pengujian data member FitTrack.
     *
     * @param args argumen program
     */
    public static void main(String[] args) {
        Member member1 = new Member(
                "Andi", "081234567890", "20-10-2026", "Basic");

        Member member2 = new Member(
                "Budi", "082345678901", "21-10-2026", "Premium");

        Member member3 = new Member(
                "Citra", "083456789012", "22-10-2026", "VIP");

        Member member4 = new Member(
                "Dina", "084567890123", "23-10-2026");


        Member[] daftarMember = {
            member1, member2, member3, member4
        };

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println(daftarMember[i]);
        }

    }
}
