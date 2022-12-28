import java.util.InputMismatchException;
import java.util.Scanner;

import java.sql.*;

//inheritance
public class program extends transaksi {

    // static Scanner scanner;
    static Connection conn;

    public static void main(String[] args) {

        // pengolahn Database CRUD
        try (Scanner input = new Scanner(System.in)) {
            String pilihanUser;
            boolean isLanjutkan = true;

            String url = "jdbc:mysql://localhost:3306/premium";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, "root", "");
                System.out.println("Class Driver ditemukan\n");
                System.out.println("=!! WELLCOME TO PEMBELIAN AKUN PREMIUM  !!=\n");

                while (isLanjutkan) {
                    System.out.println("\n--------------------------------");
                    System.out.println("PROGRAM PEMBELIAN AKUN PREMIUM");
                    System.out.println("         ");
                    System.out.println("--------------------------------");
                    System.out.println("    1. Lihat  Data Pembeli");
                    System.out.println("    2. Tambah Data Pembeli");
                    System.out.println("    3. Ubah   Data Pembeli");
                    System.out.println("    4. Hapus  Data Pembeli");
                    System.out.println("    5. Cari   Data Pembeli");

                    System.out.print("\n> Pilihan anda (1/2/3/4/5): ");
                    pilihanUser = input.next();
                    input.nextLine();

                    switch (pilihanUser) {
                        case "1":
                            lihatdata();
                            break;
                        case "2":
                            tambahdata();
                            break;
                        case "3":
                            ubahdata();
                            break;
                        case "4":
                            hapusdata();
                            break;
                        case "5":
                            caridata();
                            break;
                        default:
                            System.err.println("\nInput anda tidak ditemukan\nInputkan [1-5]");
                    }

                    System.out.print("\n> Apakah Anda ingin melanjutkan [y/n]? ");
                    pilihanUser = input.next();
                    input.nextLine();
                    isLanjutkan = pilihanUser.equalsIgnoreCase("y");

                }
                // Exception
            } catch (ClassNotFoundException ex) {
                System.err.println("\nDriver Error\n");
                System.exit(0);
            } catch (SQLException e) {
                System.err.println("Tidak Ada Koneksi");
            }
        }
    }

    private static void lihatdata() throws SQLException {
        System.out.println("\n====================================");
        String text1 = "Daftar Seluruh Pembeli akun premium";
        System.out.println(text1.toUpperCase());
        System.out.println("====================================");

        String sql = "SELECT * FROM pembeli";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            System.out.print("\nTanggal transaksi\t: ");
            System.out.print(result.getString("tanggal"));
            System.out.print("\nID Pembeli\t\t: ");
            System.out.print(result.getString("id_pembeli"));
            System.out.print("\nNama Pembeli\t\t: ");
            System.out.print(result.getString("nama_pembeli"));
            System.out.print("\nAplikasi \t\t: ");
            System.out.print(result.getString("aplikasi"));
            System.out.print("\nWaktu\t\t\t: ");
            System.out.print(result.getString("waktu"));
            System.out.print("\nKelas\t\t\t: ");
            System.out.print(result.getString("kelas"));
            System.out.print("\nMetode Pembayaran\t: ");
            System.out.print(result.getString("pembayaran"));
            System.out.print("\nTotal pembayaran\t: ");
            System.out.print(result.getInt("total_Pembayaran"));
            System.out.print("\n");
        }
    }

    private static void tambahdata() throws SQLException {
        System.out.println("\n==================================");
        String text2 = "      Tambah Data Pembeli";
        System.out.println(text2.toUpperCase());
        System.out.println("==================================");

        try {

            transaksi trans = new transaksi();
            // trans.IdPembeli();
            // Integer idpembeli = input.nextInt();
            // input.nextLine();
            trans.NamaPembeli();
            String namaPembeli = input.nextLine();
            trans.Tanggal();
            String tanggal = trans.tanggal;
            trans.apk();
            trans.wkt();
            trans.kelas();
            trans.hrg();

            pembayaran bayar = new pembayaran(biaya1);
            bayar.MetodePembayran();
            Integer.toString(biaya1);

            String sql = "INSERT INTO pembeli ( tanggal, nama_pembeli, aplikasi, waktu, kelas, pembayaran, total_Pembayaran) VALUES ('"
                    + tanggal + "','" + namaPembeli + "','" + aplikasinya + "','" + waktu + "','"
                    + pemakaian + "','" + metodenya + "','" + totalHarga + "')";

            Statement statement = conn.createStatement();
            statement.execute(sql);
            System.out.println("\nBerhasil input data");
            // Exception
        } catch (SQLException e) {
            System.err.println("\nTerjadi Kesalahan Input");
        } catch (InputMismatchException e) {
            System.err.println("\nInputlah dengan angka saja");
        }
    }

    private static void ubahdata() throws SQLException {
        System.out.println("\n==================================");
        String text3 = "        Ubah Data Pembeli";
        System.out.println(text3.toUpperCase());
        System.out.println("==================================");

        try {
            try {
                lihatdata();
                {
                    System.out.print("\n> Masukkan ID Pembeli yang akan di ubah atau update : ");
                    Integer idpembeli = Integer.parseInt(inputt.nextLine());

                    String sql = "SELECT * FROM pembeli WHERE id_Pembeli = " + idpembeli;

                    Statement statement = conn.createStatement();
                    ResultSet result = statement.executeQuery(sql);

                    if (result.next()) {

                        System.out.print("\nNama pembeli [" + result.getString("nama_pembeli") + "]\t: ");
                        String namaPembeli = inputt.nextLine();

                        transaksi trans = new transaksi();
                        trans.Tanggal();
                        String tanggal = trans.tanggal;
                        trans.apk();
                        trans.wkt();
                        trans.kelas();
                        trans.hrg();
                        pembayaran bayar = new pembayaran(biaya1);
                        bayar.MetodePembayran();
                        Integer.toString(biaya1);

                        sql = "UPDATE pembeli SET tanggal='" + tanggal + "',nama_pembeli='" + namaPembeli
                                + "',aplikasi = '"
                                + aplikasinya + "',waktu= '" + waktu + "', kelas='" + pemakaian + "', pembayaran='"
                                + metodenya + "', total_Pembayaran='" + totalHarga + "' WHERE id_Pembeli='" + idpembeli
                                + "'";
                        // System.out.println(sql);

                        if (statement.executeUpdate(sql) > 0) {
                            System.out.println("\nBerhasil memperbaharui data pembeli (id_Pembeli " + idpembeli + ")");
                        }
                    }
                    statement.close();
                }
                // Exception
            } catch (SQLException e) {
                System.err.println("\nTerjadi kesalahan dalam mengedit data");
                System.err.println(e.getMessage());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void hapusdata() {
        System.out.println("\n==================================");
        String text4 = "         Hapus Data pembeli";
        System.out.println(text4.toUpperCase());
        System.out.println("==================================");

        try {
            try {
                lihatdata();
                System.out.print("\n> Ketik ID pembeli yang akan Anda Hapus : ");
                Integer idpembeli = Integer.parseInt(inputt.nextLine());

                String sql = "DELETE FROM pembeli WHERE id_Pembeli = " + idpembeli;
                Statement statement = conn.createStatement();
                // ResultSet result = statement.executeQuery(sql);

                if (statement.executeUpdate(sql) > 0) {
                    System.out.println("\nBerhasil menghapus data pembeli (ID pembeli " + idpembeli + ")");
                }
                // Exception
            } catch (SQLException e) {
                System.out.println("\nTerjadi kesalahan dalam menghapus data pembeli");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void caridata() throws SQLException {
        System.out.println("\n==================================");
        String text5 = "         Cari Data pembeli";
        System.out.println(text5.toUpperCase());
        System.out.println("==================================");

        System.out.print("\nMasukkan nama pembeli : ");

        String keyword = inputt.nextLine();
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM pembeli WHERE nama_pembeli LIKE '%" + keyword + "%'";
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            System.out.print("\nTanggal transaksi\t: ");
            System.out.print(result.getString("tanggal"));
            System.out.print("\nID Pembeli\t\t: ");
            System.out.print(result.getString("id_pembeli"));
            System.out.print("\nNama Pembeli\t\t: ");
            System.out.print(result.getString("nama_pembeli"));
            System.out.print("\n aplikasi \t\t: ");
            System.out.print(result.getString("aplikasi"));
            System.out.print("\nwaktu\t\t\t: ");
            System.out.print(result.getString("waktu"));
            System.out.print("\nkelas\t\t\t: ");
            System.out.print(result.getString("kelas"));
            System.out.print("\nMetode pembayaran\t: ");
            System.out.print(result.getString("pembayaran"));
            System.out.print("\nTotal pembayaran\t: ");
            System.out.print(result.getInt("total_Pembayaran"));
            System.out.print("\n");
        }
    }
}
