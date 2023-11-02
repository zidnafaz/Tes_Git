public class question3Array {
    public static void main(String[] args) {
        
        int[] angka = new int[5];

        angka[0] = 5;
        angka[1] = 2;
        angka[2] = 7;
        angka[3] = 9;
        angka[4] = 6;

        System.out.println("Penambahan");
        for (int i = 0; i < 5; i++) {
            System.out.println(angka[i]);
        }
        
        System.out.println("Pengurangan");
        for (int i = 4; i >= 0; i--) {
            System.out.println(angka[i]);
        }

    }
}