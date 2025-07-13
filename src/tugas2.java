import java.util.Scanner;
public class tugas2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkna golongan A/B/C");
        char golongan = input.next().toUpperCase().charAt(0);

        System.out.println("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;
        double gajiLembur;

        //Menghitung ghaji pokok berdasarkan golongan
        if (golongan == 'A') {
            gajiPokok = 5000000;
        }
        else if (golongan == 'B') {
            gajiPokok = 6500000;
        }
        else if (golongan == 'C') {
            gajiPokok = 9500000;
        }

        //Menghitung Gaji Lembur Berdasarkan Jam Lembur
        if (jamLembur == 0) {
            gajiLembur = gajiPokok * 0;
        }
        else if (jamLembur == 1) {
            gajiLembur = gajiPokok * 0.30;
        }
        else if (jamLembur == 2) {
            gajiLembur = gajiPokok * 0.32;
        }
        else if (jamLembur == 3) {
            gajiLembur = gajiPokok * 0.34;
        }
        else if (jamLembur == 4) {
            gajiLembur = gajiPokok * 0.36;
        }
        else {//Untuikl jam lembur 5 jam atau lebih 
            gajiLembur = gajiPokok * 0.38;
        }  
        

        System.out.println("===================================================");
        System.out.println("PROGRAM jAVA");
        System.out.println("PENGHITUNGAN GAJI KARYAWAN");
        System.out.println("==================================================");
        //Menghitung total pnghasilan 
        double totalPenghasilan = gajiPokok + gajiLembur;

        //Output total penghasilan
        System.out.println("Total Penghasilan Rp." + totalPenghasilan);

        input.close();

        System.out.println("==================================================");

    }
}