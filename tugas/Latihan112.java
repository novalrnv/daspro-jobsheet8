package Tugas;

import java.util.Scanner;

public class Latihan112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Masukkan Nilai N : ");
        n = input.nextInt();

        for(int iOuter=1 ; iOuter<=n ; iOuter++){
            for(int i=1 ; i<=n ; i++){
                if(iOuter == n || iOuter == 1 || i == 1 || i == n){
                    System.out.print(n+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}