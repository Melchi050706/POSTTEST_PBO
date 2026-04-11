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
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch(pilih){

                case 1:
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
                    break;

                case 2:
                    System.out.print("Nama: ");
                    String nama2 = input.nextLine();

                    System.out.print("Elemen: ");
                    String elemen2 = input.nextLine();

                    System.out.print("Level: ");
                    int level2 = input.nextInt();

                    System.out.print("Heal: ");
                    int heal = input.nextInt();
                    input.nextLine();

                    list.add(new Support(nama2, elemen2, level2, heal));
                    break;

                case 3:
                    for(Karakter k : list){
                        System.out.println("\n--- DATA ---");
                        k.tampil();
                    }
                    break;

                case 4:
                    System.out.println("Selesai");
                    break;
            }

        }while(pilih != 4);
    }
}