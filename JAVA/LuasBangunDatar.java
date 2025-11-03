public public class LuasBangunDatar {
    public static void main(String[] args) {

        System.out.println("=== LUAS BANGUN DATAR ===");

        // 1. Persegi
        int s1 = 2;
        int s2 = 4;
        int LPersegi = s1 * s2;
        System.out.println("Luas Persegi: " + LPersegi);

        // 2. Persegi Panjang
        int p = 3;
        int l = 9;
        int LPersegiPanjang = p * l;
        System.out.println("Luas Persegi Panjang: " + LPersegiPanjang);

        // 3. Jajar Genjang
        int a = 4;
        int t = 3;
        int LJajarGenjang = a * t;
        System.out.println("Luas Jajar Genjang: " + LJajarGenjang);

        // 4. Segitiga
        a = 2;
        t = 12;
        double LSegitiga = 0.5 * a * t;
        System.out.println("Luas Segitiga: " + LSegitiga);

        // 5. Belah Ketupat
        int d1 = 4;
        int d2 = 8;
        double LBelahKetupat = 0.5 * d1 * d2;
        System.out.println("Luas Belah Ketupat: " + LBelahKetupat);

        // 6. Trapesium
        int a1 = 4;
        int b = 6;
        t = 9;
        double LTrapesium = 0.5 * (a1 + b) * t;
        System.out.println("Luas Trapesium: " + LTrapesium);

        // 7. Lingkaran
        int r = 7;
        double LLingkaran = 22.0 / 7.0 * r * r;
        System.out.println("Luas Lingkaran: " + LLingkaran); 
    }
}