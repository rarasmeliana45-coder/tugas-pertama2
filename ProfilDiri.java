public class ProfilDiri {

    // Prosedur untuk menampilkan header profil
    public static void tampilkanHeader() {
        System.out.println("========================================");
        System.out.println("          PROGRAM PROFIL DIRI           ");
        System.out.println("========================================");
    }

    // Prosedur untuk menampilkan data profil diri
    public static void tampilkanProfil(String nama, String kelas, int umur, String hobi, String alamat) {
        System.out.println("Nama   : " + nama);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Hobi   : " + hobi);
        System.out.println("Alamat : " + alamat);
    }

    // Prosedur untuk menampilkan footer / penutup
    public static void tampilkanFooter() {
        System.out.println("========================================");
        System.out.println("      TERIMA KASIH TELAH MENONTON       ");
        System.out.println("========================================");
    }

    // Method Utama (Main)
    public static void main(String[] args) {
        // Deklarasi variabel data diri (silakan ubah sesuai data Anda)
        String nama = "raras meliana";
        String kelas = "XI pplg";
        int umur = 17;
        String hobi = "memasak";
        String alamat = "Jl. Cianjur";

        // Memanggil prosedur-prosedur secara berurutan (gaya prosedural)
        tampilkanHeader();
        tampilkanProfil(nama, kelas, umur, hobi, alamat);
        tampilkanFooter();
    }
}