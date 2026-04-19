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
            System.out.println("4. Aksi Karakter");
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
                    aksiKarakter();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;
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
        int dmg = input.nextInt();
        input.nextLine();

        list.add(new DPS(nama, elemen, level, dmg));
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
        for(Karakter k : list){
            System.out.println("\n--- DATA ---");
            k.tampil();
        }
    }

    static void aksiKarakter(){
        for(Karakter k : list){

            if(k instanceof Aksi){
                Aksi a = (Aksi) k;

                a.serang();
                a.skill();
            }
        }
    }
}