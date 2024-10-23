package Tugas;

import java.util.Scanner;

public class Latihan212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlhkampus;
        String namakmps, namacabor, namaatlet;

        System.out.print("Masukkan Politeknik yang mendaftar : ");
        jmlhkampus=input.nextInt();
        input.nextLine();

        for (int p=1 ; p<=jmlhkampus ; p++){
            System.out.print("Masukkan nama Politeknik ke- "+ p +": ");
            namakmps=input.nextLine();

            System.out.println("Kampus: "+ namakmps);
            
            int jmlhcabor=4;
            int i=1;
            while(i<=jmlhcabor){
                System.out.print("Masukkan nama cabor ke-"+i+" : ");
                namacabor=input.nextLine();
                System.out.println("Jenis Cabor : " + namacabor);
                String daftaratlet = "";

                for(int a=1 ; a<=5 ; a++){
                    System.out.print("Nama atlet ke-"+a+" : ");
                    namaatlet=input.nextLine();
                    daftaratlet += "\n-" + namaatlet;
                }
                System.out.println("atlet "+namacabor+" : "+daftaratlet);
                i++;
            }
        }
    }
}
