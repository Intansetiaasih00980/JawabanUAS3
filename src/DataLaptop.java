import org.json.JSONObject;
import java.util.Scanner;
    class LaptopApp{
        public static void main(String[] args) {
            // Data JSON yang berisi informasi laptop
            String json = "{\n" +
                    "  \"laptops\": [\n" +
                    "    {\n" +
                    "      \"brand\": \"Acer\",\n" +
                    "      \"model\": \"Predator Helios 300\",\n" +
                    "      \"rating\": 4.5\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"brand\": \"Asus\",\n" +
                    "      \"model\": \"ROG Strix G15\",\n" +
                    "      \"rating\": 4.2\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"brand\": \"Lenovo\",\n" +
                    "      \"model\": \"IdeaPad Gaming 3\",\n" +
                    "      \"rating\": 4.7\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"brand\": \"HP\",\n" +
                    "      \"model\": \"Omen 15\",\n" +
                    "      \"rating\": 4.3\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"brand\": \"Dell\",\n" +
                    "      \"model\": \"G5 15\",\n" +
                    "      \"rating\": 4.6\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}";

            // Parsing data JSON
            JSONObject jsonObject = new JSONObject(json);
            org.json.JSONArray laptops = jsonObject.getJSONArray("laptops");

            // Menggunakan algoritma selection sort untuk mengurutkan berdasarkan rating
            for (int i = 0; i < laptops.length() - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < laptops.length(); j++) {
                    JSONObject laptop1 = laptops.getJSONObject(j);
                    JSONObject laptop2 = laptops.getJSONObject(minIndex);
                    if (laptop1.getDouble("rating") < laptop2.getDouble("rating")) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    JSONObject temp = laptops.getJSONObject(i);
                    laptops.put(i, laptops.getJSONObject(minIndex));
                    laptops.put(minIndex, temp);
                }
            }

            // Menampilkan data laptop yang sudah diurutkan
            System.out.println("Daftar Laptop (Diurutkan berdasarkan rating):");
            for (int i = 0; i < laptops.length(); i++) {
                JSONObject laptop = laptops.getJSONObject(i);
                System.out.println("Brand: " + laptop.getString("brand"));
                System.out.println("Model: " + laptop.getString("model"));
                System.out.println("Rating: " + laptop.getDouble("rating"));
                System.out.println();
            }

            // Pencarian data berdasarkan rating yang dimasukkan pengguna
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan rating yang ingin dicari: ");
            double targetRating = scanner.nextDouble();

            boolean found = false;
            for (int i = 0; i < laptops.length(); i++) {
                JSONObject laptop = laptops.getJSONObject(i);
                double rating = laptop.getDouble("rating");
                if (rating == targetRating) {
                    System.out.println("Laptop dengan rating " + targetRating + " ditemukan:");
                    System.out.println("Brand: " + laptop.getString("brand"));
                    System.out.println("Model: " + laptop.getString("model"));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Laptop dengan rating " + targetRating + " tidak ditemukan.");
            }
        }
    }