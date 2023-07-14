import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputNama {
    private String id;
    private String nama;

    public InputNama(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public static void main(String[] args) {
        List<InputNama> InputNama = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id : ");
            String id = scanner.nextLine();
            System.out.println("Nama : ");
            String Nama = scanner.nextLine();

            System.out.print("Apakah ingin menginput lagi? (y/n): ");
            String pilihan = scanner.nextLine();
            if (!pilihan.equalsIgnoreCase("y")) {
                break;
            }
        }
        System.out.println("\n=== Hasil Nama Yang Telah Di Input ===");
        for (int i = 0;i< 3; i++) {
            for (InputNama inputNama : InputNama) {
                System.out.println("Id: " + inputNama.getId());
                System.out.println("Nama : " + inputNama.getNama());
            }
        }
    }
}