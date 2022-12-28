import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

//interface
public class transaksi implements aplikasi {

    Integer idPembeli;
    String tanggal;
    Integer noaplikasi;
    int inputwaktu;
    int nopemakaian;
    static String aplikasinya;
    static int harga;
    static String waktu;
    static String pemakaian;
    static String jam;
    static int totalHarga, biaya1, cash, kembalian,diskon;
    static String metodenya;
    static String jamnya;
    public static int metode;

    static Scanner input = new Scanner(System.in);
    static Scanner inputt = new Scanner(System.in);

    public void NamaPembeli() {
        System.out.print("> Masukkan Nama Pembeli       : ");
    }

    public void apk() {
        String[] nama = { "Disney+", "Netflix", "Wetv", "Vidio", "canva" };
        String temp;
        // Mengurutkan nama aplikasi
        System.out.println("\n==================================");
        System.out.println("        !! APLIKASI !!");
        System.out.println("==================================");
        // Perulangan dengan For
        for (int i = 0; i < (nama.length - 1); i++) {
            for (int j = 0; j < (nama.length - 1); j++) {
                if (nama[j].compareTo(nama[j + 1]) > 0) {
                    temp = nama[j + 1];
                    nama[j + 1] = nama[j];
                    nama[j] = temp;
                }
            }
        }
        for (int i = 0; i < nama.length; i++) {
            System.out.println(i + 1 + " " + nama[i]);
        }
        System.out.print("> Masukkan Aplikasi : ");
        noaplikasi = input.nextInt();
        input.nextLine();

        // percabangan
        if (this.noaplikasi == 1) {
            aplikasinya = "Disney+";
        } else if (this.noaplikasi == 2) {
            aplikasinya = "Netflix";
        } else if (this.noaplikasi == 3) {
            aplikasinya = "Wetv";
        } else if (this.noaplikasi == 4) {
            aplikasinya = "vidio";
        } else if (this.noaplikasi == 5) {
            aplikasinya = "canva";
        }
    }

    public void wkt() {
        // Collection Framework
        // membuat objek hashmap
        HashMap<Integer, String> jam = new HashMap<Integer, String>();
        jam.put(1, "1 bulan");
        jam.put(2, "4 bulan");
        jam.put(3, "12 bulan");

        System.out.println("\n============================================");
        System.out.println("                WAKTU PEMAKAIAN   ");
        System.out.println("============================================\n");
        System.out.println(jam);
        System.out.print("> Masukkan waktu pemakaian : ");
        inputwaktu = input.nextInt();
        input.nextLine();

        // percabangan
        if (inputwaktu == 1) {
            waktu = "1 BULAN";
        } else if (inputwaktu == 2) {
            waktu = "4 BULAN";
        } else if (inputwaktu == 3) {
            waktu = "12 BULAN";
        } else {
            System.out.println("Nomor yang anda masukkan salah");
            System.out.print("> Masukkan no waktu pemakaian : ");
            inputwaktu = input.nextInt();
            input.nextLine();
        }
    }

    public void kelas() {
        System.out.println("\n==================================");
        System.out.println("            !! PEMAKAIAN !!");
        System.out.println("==================================");
        System.out.println(" 1. Sharing   ");
        System.out.println(" 2. Private");
        System.out.print("\n > Masukkan pemakaian : ");
        nopemakaian = input.nextInt();
        input.nextLine();
        // percabangan if
        if (nopemakaian == 1) {
            pemakaian = "Sharing";
        } else if (nopemakaian == 2) {
            pemakaian = "Private";
        } else {
            System.out.println("Nomor yang anda masukkan salah");
            System.out.print("\n > Masukkan jenis pemakaian : ");
            nopemakaian = input.nextInt();
            input.nextLine();
        }
    }

    public void hrg() {
        int harga[][][] = { { { 20000, 40000 }, { 50000, 100000 }, { 200000, 400000 } },
                { { 5000, 10000 }, { 12000, 24000 }, { 53000, 105000 } },
                { { 10000, 20000 }, { 25000, 50000 }, { 110000, 220000 } },
                { { 7000, 14000 }, { 18000, 36000 }, { 53000, 150000 } },
                { { 8000, 16000 }, { 20000, 40000 }, { 85000, 170000 } } };

        // percabangan
        if ((noaplikasi == 1) && (inputwaktu == 1) && (nopemakaian == 1)) // Jika noaplikasi 0 dan inputwaktu 0 dan
                                                                          // nopemakaian 0
        {
            biaya1 = harga[0][0][0]; // biaya1 menampung harga [0][0][0]
        } else if ((noaplikasi == 1) && (inputwaktu == 1) && (nopemakaian == 2)) // Jika noaplikasi 0 dan inputwaktu 0
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[0][0][1]; // biaya1 menampung harga [0][0][1]
        } else if ((noaplikasi == 1) && (inputwaktu == 2) && (nopemakaian == 1)) // Jika noaplikasi 0 dan inputwaktu 1
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[0][1][0]; // biaya1 menampung harga [0][1][0]
        } else if ((noaplikasi == 1) && (inputwaktu == 2) && (nopemakaian == 2)) // Jika noaplikasi 0 dan inputwaktu 1
                                                                                 // dan nopemakaian
        {
            biaya1 = harga[0][1][1]; // biaya1 menampung harga [0][1][1]
        } else if ((noaplikasi == 1) && (inputwaktu == 3) && (nopemakaian == 1)) // Jika noaplikasi 0 dan inputwaktu 2
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[0][2][0]; // biaya1 menampung harga [0][2][0]
        } else if ((noaplikasi == 1) && (inputwaktu == 3) && (nopemakaian == 2)) // Jika noaplikasi 0 dan inputwaktu 2
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[0][2][1]; // biaya1 menampung harga [0][2][1]
        } else if ((noaplikasi == 2) && (inputwaktu == 1) && (nopemakaian == 1)) // Jika noaplikasi 1 dan inputwaktu 0
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[1][0][0]; // biaya1 menampung harga [1][0][0]
        } else if ((noaplikasi == 2) && (inputwaktu == 1) && (nopemakaian == 1)) // Jika noaplikasi 1 dan inputwaktu 0
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[1][0][1]; // biaya1 menampung harga [1][0][1]
        } else if ((noaplikasi == 2) && (inputwaktu == 2) && (nopemakaian == 1)) // Jika noaplikasi 1 dan inputwaktu 1
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[1][1][0]; // biaya1 menampung harga [1][1][0]
        } else if ((noaplikasi == 2) && (inputwaktu == 2) && (nopemakaian == 2)) // Jika noaplikasi 1 dan inputwaktu 1
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[1][1][1]; // biaya1 menampung harga [1][1][1]
        } else if ((noaplikasi == 2) && (inputwaktu == 3) && (nopemakaian == 1)) // Jika noaplikasi 1 dan inputwaktu 2
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[1][2][0]; // biaya1 menampung harga [1][2][1]
        } else if ((noaplikasi == 2) && (inputwaktu == 3) && (nopemakaian == 2)) // Jika noaplikasi 1 dan inputwaktu 2
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[1][2][1];// biaya1 menampung harga [1][2][1]
        } else if ((noaplikasi == 3) && (inputwaktu == 1) && (nopemakaian == 1))// Jika noaplikasi 2 dan inputwaktu 0
                                                                                // dan nopemakaian 0
        {
            biaya1 = harga[2][0][0]; // biaya1 menampung harga [2][0][0]
        } else if ((noaplikasi == 3) && (inputwaktu == 1) && (nopemakaian == 2)) // Jika noaplikasi 2 dan inputwaktu 1
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[2][0][1]; // biaya1 menampung harga [2][0][1]
        } else if ((noaplikasi == 3) && (inputwaktu == 2) && (nopemakaian == 1)) // Jika noaplikasi 2 dan inputwaktu 1
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[2][1][0]; // biaya1 menampung harga [2][1][0]
        } else if ((noaplikasi == 3) && (inputwaktu == 2) && (nopemakaian == 2)) // Jika noaplikasi 2 dan inputwaktu 1
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[2][1][1]; // biaya1 menampung harga [2][1][1]
        } else if ((noaplikasi == 3) && (inputwaktu == 2) && (nopemakaian == 1)) // Jika noaplikasi 2 dan inputwaktu 2
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[2][2][0]; // biaya1 menampung harga [2][2][0]
        } else if ((noaplikasi == 3) && (inputwaktu == 3) && (nopemakaian == 2)) // Jika noaplikasi 2 dan inputwaktu 2
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[2][2][1]; // biaya1 menampung harga [2][2][1]
        } else if ((noaplikasi == 4) && (inputwaktu == 1) && (nopemakaian == 1)) // Jika noaplikasi 3 dan inputwaktu 0
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[3][0][0];// biaya1 menampung harga [3][0][0]
        } else if ((noaplikasi == 4) && (inputwaktu == 1) && (nopemakaian == 2)) // Jika noaplikasi 3 dan inputwaktu 0
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[3][0][1]; // biaya1 menampung harga [3][0][1]
        } else if ((noaplikasi == 4) && (inputwaktu == 2) && (nopemakaian == 1)) // Jika noaplikasi 3 dan inputwaktu 1
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[3][1][0]; // biaya1 menampung harga [3][1][0]
        } else if ((noaplikasi == 4) && (inputwaktu == 2) && (nopemakaian == 2)) // Jika noaplikasi 3 dan inputwaktu 1
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[3][1][1]; // biaya1 menampung harga [3][1][1]
        } else if ((noaplikasi == 4) && (inputwaktu == 3) && (nopemakaian == 1)) // Jika noaplikasi 3 dan inputwaktu 2
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[3][2][0]; // biaya1 menampung harga [3][2][0]
        } else if ((noaplikasi == 4) && (inputwaktu == 3) && (nopemakaian == 2)) // Jika noaplikasi 3 dan inputwaktu 2
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[3][2][1]; // biaya1 menampung harga [3][2][1]
        } else if ((noaplikasi == 5) && (inputwaktu == 1) && (nopemakaian == 1)) // Jika noaplikasi 4 dan inputwaktu 0
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[4][0][0]; // biaya1 menampung harga [4][0][0]
        } else if ((noaplikasi == 5) && (inputwaktu == 1) && (nopemakaian == 2)) // Jika noaplikasi 4 dan inputwaktu 0
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[4][0][1]; // biaya1 menampung harga [4][0][1]
        } else if ((noaplikasi == 5) && (inputwaktu == 2) && (nopemakaian == 1)) // Jika noaplikasi 4 dan inputwaktu 1
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[4][1][0]; // biaya1 menampung harga [4][1][0]
        } else if ((noaplikasi == 5) && (inputwaktu == 2) && (nopemakaian == 2)) // Jika noaplikasi 4 dan inputwaktu 1
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[4][1][1]; // biaya1 menampung harga [4][1][1]
        } else if ((noaplikasi == 5) && (inputwaktu == 3) && (nopemakaian == 1)) // Jika noaplikasi 4 dan inputwaktu 2
                                                                                 // dan nopemakaian 0
        {
            biaya1 = harga[4][2][0]; // biaya1 menampung harga [4][2][0]
        } else if ((noaplikasi == 5) && (inputwaktu == 3) && (nopemakaian == 2)) // Jika noaplikasi 4 dan inputwaktu 2
                                                                                 // dan nopemakaian 1
        {
            biaya1 = harga[4][2][1];// biaya1 menampung harga [4][2][1]
        }
        System.out.print(" Total harga : Rp. " + biaya1);
        System.out.println("");
    }

    // string dan Date
    public String Tanggal() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        this.tanggal = date.format(frmt);
        return this.tanggal;
    }

    @Override
    public void MetodePembayran() {
    }
}
