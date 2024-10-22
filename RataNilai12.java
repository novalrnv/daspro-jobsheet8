import java.util.Scanner;

public class RataNilai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1, j=1;
        float nilai, totalnilai, ratanilai; 

        for (j=1 ; j<=5 ; i++){
            System.out.println("Input Nilai Mahasiswa ke "+ i);

            totalnilai=0;
            for(j=1 ; j<=5 ; j++){
                System.out.print("Nilai ke-"+ j +" = ");
                int nilaimhs=input.nextInt();
                totalnilai+=nilaimhs;
            }
            ratanilai=totalnilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke "+i+" adalah "+ratanilai);
        }
        while (i<=5){
            totalnilai=0;
            System.out.println("Input Nilai Mahasiswa ke "+ i);
            for(j=1 ; j<=5 ; j++){
                System.out.print("Nilai ke-"+ j +" = ");
                int nilaimhs=input.nextInt();
                totalnilai+=nilaimhs;
            }
            ratanilai=totalnilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke "+i+" adalah "+ratanilai);
            i++;
        }
    }
}
