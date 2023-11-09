import java.util.Scanner;
public class Nestedloop_2341760161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nomor = new int[5][7];

        for (int i = 0; i < nomor.length; i++) { 
            System.out.println("Kota ke-" + i);
        for (int j = 0; j <nomor[0].length; j++){
            System.out.print("Hari ke-" + (j + 1) + ": "); 
           nomor[i][j] = scanner.nextInt();
        }
        System.out.println();
        
        
            


    }

    for (int i = 0; i < nomor.length; i++) {
            System.out.println("Kota ke-" + i);
            int sum = 0;
            for (int j = 0; j < nomor[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                nomor[i][j] = scanner.nextInt();
                sum += nomor[i][j];
            }
            System.out.println();

            double average = (double) sum / nomor[0].length;
            System.out.println("Rata-rata kota ke-" + (i + 1) + ": " + average);
        }
}

}