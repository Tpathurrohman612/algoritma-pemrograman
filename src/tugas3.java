import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Deklarasi array untuk gaji pokok dan persen lembur
        int[] golonganGaji,persenGaji;

        // Inisialisasi array golonganGaji untuk A, B, dan C
        golonganGaji = new int[3];
        golonganGaji[0] = 5000000;
        golonganGaji[1] = 6500000;
        golonganGaji[2] = 9500000;

        // Inisialisasi array persenGaji untuk masing-masing jam lembur (1–5 jam)
        persenGaji = new int[5];
        persenGaji[0] = 30;
        persenGaji[1] = 32;
        persenGaji[2] = 34;
        persenGaji[3] = 36;
        persenGaji[4] = 38;

        int gaji = 0;
        float lembur = 0;

        // Input golongan dari user
        System.out.println("Masukan Golongan Karyawan: ");
        char golongan = input.next().toUpperCase().charAt(0);

        // Menentukan gaji pokok berdasarkan golongan
        if (golongan == 'A') {
            gaji = golonganGaji[0];
        } else if (golongan == 'B') {
            gaji = golonganGaji[1];
        } else if (golongan == 'C') {
            gaji = golonganGaji[2];
        } else { // Jika golongan tidak valid
            System.out.println("Golongan Tidak Ditemukan");
            System.exit(0);
        }

        // Menghitung gaji lembur berdasarkan jumlah jam lembur
        System.out.println("Masukan Jam Lembur 1 - 5 = ");
        int jamlembur = input.nextInt();

        if (jamlembur == 0) {
            lembur = 0;
        } else if (jamlembur == 1) {
            lembur = gaji * ((float) persenGaji[0]/100);
        } else if (jamlembur == 2) {
            lembur = gaji * ((float) persenGaji[1]/100);
        } else if (jamlembur == 3) {
            lembur = gaji * ((float) persenGaji[2]/100);
        } else if (jamlembur == 4) {
            lembur = gaji * ((float) persenGaji[3]/100);
        } else if (jamlembur >= 5) {
            lembur = gaji * ((float) persenGaji[4]/100);
        } else { // Jika jam lembur tidak sesuai batas
            System.out.println("Apabila Gaji Lembur Melebihi 5, Silahkan Isi 5");
            System.exit(0);
        }

        // Menghitung total gaji
        float total_gaji = gaji + lembur;

        // Menampilkan hasil perhitungan
        System.out.println("==================================================");
        System.out.println("Golongan Karyawan: " + golongan);
        System.out.println("Gaji Pokok: Rp" + (int)gaji);
        System.out.println("Gaji Lembur: Rp" + (int)lembur);
        System.out.println("Total Gaji: Rp" + (int)total_gaji);
         System.out.println("==================================================");
        input.close();
    }
}
