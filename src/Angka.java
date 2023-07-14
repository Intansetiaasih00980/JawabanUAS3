//Buatlah program java untuk mencetak angka dari 1000-20000
//Buatlah program java untuk mencetak angka dari 1000-20000 menggunakan for dan while
//Buatlah program java untuk mencetak nilai genap dari suatu array
//int[] s = new int[]{1,5,6,7,12,3,24,9,18} tanpa fow dan while
public class Angka {
    public class PrintNumbers {
        public static void main(String[] args) {
            int start = 1000;
            int end = 20000;
            int increment = 1000;

            for (int i = start; i <= end; i += increment) {
                System.out.println(i);
            }
            class WhileLoopExample {
                public static void main(String[] args) {
                    int number = 1000;

                    while (number <= 20000) {
                        System.out.println(number);
                        number += 1000;
                    }
                    class CetakNilaiGenap {
                        public static void main(String[] args) {
                            int[] s = new int[]{1, 5, 6, 7, 12, 3, 24, 9, 18};

                            // Mencetak nilai genap dari array
                            for (int i = 0; i < s.length; i++) {
                                if (s[i] % 2 == 0) {
                                    System.out.println(s[i]);
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
