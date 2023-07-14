import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    class Pasien{
        private String nim;
        private String nama;
        private String alamat;
        private String tanggalLahir;
        private String jenisKelamin;
        private String golonganDarah;

        public Pasien(String nim, String nama, String alamat, String tanggalLahir, String jenisKelamin, String golonganDarah) {
            this.nim = nim;
            this.nama = nama;
            this.alamat = alamat;
            this.tanggalLahir = tanggalLahir;
            this.jenisKelamin = jenisKelamin;
            this.golonganDarah = golonganDarah;
        }

        public String getNim() {
            return nim;
        }

        public String getNama() {

            return nama;
        }

        public String getAlamat() {

            return alamat;
        }

        public String getTanggalLahir() {

            return tanggalLahir;
        }

        public String getJenisKelamin() {

            return jenisKelamin;
        }

        public String getGolonganDarah() {

            return golonganDarah;
        }

        public static void main(String[] args) {
            List<Pasien> daftarPasien = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("=== Pendaftaran Pasien COVID-19 ===");
                System.out.print("Nik: ");
                String nim = scanner.nextLine();
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Alamat: ");
                String alamat = scanner.nextLine();
                System.out.print("Tanggal Lahir (dd/mm/yyyy): ");
                String tanggalLahir = scanner.nextLine();
                System.out.print("Jenis Kelamin: ");
                String jenisKelamin = scanner.nextLine();
                System.out.print("Golongan Darah: ");
                String golonganDarah = scanner.nextLine();

                Pasien pasien = new Pasien(nim, nama, alamat, tanggalLahir, jenisKelamin, golonganDarah);
                daftarPasien.add(pasien);

                System.out.print("Apakah ingin mendaftarkan pasien lain? (y/n): ");
                String pilihan = scanner.nextLine();
                if (!pilihan.equalsIgnoreCase("y")) {
                    break;
                }
            }

            System.out.println("\n=== Daftar Pasien COVID-19 ===");
            for (Pasien pasien : daftarPasien) {
                System.out.println("Nik: " + pasien.getNim());
                System.out.println("Nama: " + pasien.getNama());
                System.out.println("Alamat: " + pasien.getAlamat());
                System.out.println("Tanggal Lahir: " + pasien.getTanggalLahir());
                System.out.println("Jenis Kelamin: " + pasien.getJenisKelamin());
                System.out.println("Golongan Darah: " + pasien.getGolonganDarah());
                System.out.println("=== Nama Pasien COVID-19 ===");
            }
            class metode4 {
                class Main {
                    public static void main(String[] args) {
                        // Memanggil metode4
                        metode4();
                    }

                    // Definisikan metode4
                    public static void metode4() {
                        // Isi dari metode4
                        System.out.println("Menginput data pasien COVID-19.");
                    }
                }
            }
        }
    }