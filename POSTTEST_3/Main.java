import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Karakter> list = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int pilih;

        do{
            System.out.println("\n=== Manajemen Karakter Wuthering Waves ===");
            System.out.println("1. Tambah DPS");
            System.out.println("2. Tambah Support");
            System.out.println("3. Lihat Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch(pilih){

                case 1:
                    tambahDPS();
                    break;

                case 2:
                    tambahSupport();
                    break;

                case 3:
                    tampilData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan salah");
            }

        }while(pilih != 5);
    }

    static void tambahDPS(){

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Elemen: ");
        String elemen = input.nextLine();

        System.out.print("Level: ");
        int level = input.nextInt();

        System.out.print("Damage: ");
        int damage = input.nextInt();
        input.nextLine();

        list.add(new DPS(nama, elemen, level, damage));
    }

    static void tambahSupport(){

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Elemen: ");
        String elemen = input.nextLine();

        System.out.print("Level: ");
        int level = input.nextInt();

        System.out.print("Heal: ");
        int heal = input.nextInt();
        input.nextLine();

        list.add(new Support(nama, elemen, level, heal));
    }

    static void tampilData(){

        if(list.isEmpty()){
            System.out.println("Data kosong");
            return;
        }

        for(int i=0;i<list.size();i++){

            System.out.println("\nData ke-" + (i+1));

            Karakter k = list.get(i);

            if(k instanceof DPS){
                ((DPS) k).tampilDPS();
            } else if(k instanceof Support){
                ((Support) k).tampilSupport();
            }
        }
    }

    static void hapusData(){

        tampilData();

        System.out.print("Pilih index: ");
        int i = input.nextInt()-1;

        if(i >= 0 && i < list.size()){
            list.remove(i);
            System.out.println("Data dihapus");
        }
    }
}