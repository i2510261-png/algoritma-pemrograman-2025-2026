public class VolumeBangunDatar {
    
public static void main(String[] args) {

        System.out.println("=== VOLUME BANGUN DATAR ===");

        // 1. Kubus
        int s1 = 2;
        int s2 = 4;
        int s3 = 4;
        int VKubus = s1 * s2 * s3;
        System.out.println("Volume Kubus: " + VKubus);

        // 2. Balok
        int p = 3;
        int l = 5;
        int t = 7;
        int VBalok = p * l * t;
        System.out.println("Volume Balok: " + VBalok);

        // 3. Prisma Segitiga
        int LAlas = 8;
        t = 8;
        int VPrismaSegitiga = LAlas * t;
        System.out.println("Volume Prisma Segitiga: " + VPrismaSegitiga);

        // 4. Tabung
        int r1 = 7;
        t = 5;
        double VTabung = 22.0 / 7.0 * r1 * r1 * t;
        System.out.println("Volume Tabung: " + VTabung);

        // 5. Bola
        r1 = 7;
        double VBola = 4.0 / 3.0 * 22.0 / 7.0 * r1 * r1 * r1;
        System.out.println("Volume Bola: " + VBola);

        // 6. Limas
        LAlas = 6;
        t = 9;
        double VLimas = (1.0 / 3.0) * LAlas * t;
        System.out.println("Volume Limas: " + VLimas);
    }
                }