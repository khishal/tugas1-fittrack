
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

        System.out.println(member1);
        System.out.println(member2);
        System.out.println(member3);
        System.out.println(member4);
    }
}
