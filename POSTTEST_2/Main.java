import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Karakter> daftarKarakter = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do{

            System.out.println("\n=== Sistem Manajemen Data Karakter Wuthering Waves ===");
            System.out.println("1. Tambah Karakter");
            System.out.println("2. Lihat Karakter");
            System.out.println("3. Update Karakter");
            System.out.println("4. Hapus Karakter");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch(pilihan){

                case 1:
                    tambahKarakter();
                    break;

                case 2:
                    lihatKarakter();
                    break;

                case 3:
                    updateKarakter();
                    break;

                case 4:
                    hapusKarakter();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak ada");
            }

        }while(pilihan != 5);

    }

    static void tambahKarakter(){

        System.out.print("Nama Karakter: ");
        String nama = input.nextLine();

        System.out.print("Elemen: ");
        String elemen = input.nextLine();

        System.out.print("Level: ");
        int level = input.nextInt();
        input.nextLine();

        Karakter karakter = new Karakter(nama, elemen, level);

        daftarKarakter.add(karakter);

        System.out.println("Karakter berhasil ditambahkan");
    }

    static void lihatKarakter(){

        if(daftarKarakter.isEmpty()){
            System.out.println("Belum ada data");
            return;
        }

        for(int i=0;i<daftarKarakter.size();i++){

            Karakter k = daftarKarakter.get(i);

            System.out.println("\nData ke-" + (i+1));
            System.out.println("Nama : " + k.getNama());
            System.out.println("Elemen : " + k.getElemen());
            System.out.println("Level : " + k.getLevel());
        }
    }

    static void updateKarakter(){

        lihatKarakter();

        System.out.print("Pilih nomor data: ");
        int index = input.nextInt()-1;
        input.nextLine();

        if(index >=0 && index < daftarKarakter.size()){

            System.out.print("Nama baru: ");
            String nama = input.nextLine();

            System.out.print("Elemen baru: ");
            String elemen = input.nextLine();

            System.out.print("Level baru: ");
            int level = input.nextInt();

            Karakter k = daftarKarakter.get(index);

            k.setNama(nama);
            k.setElemen(elemen);
            k.setLevel(level);

            System.out.println("Data berhasil diupdate");
        }

    }

    static void hapusKarakter(){

        lihatKarakter();

        System.out.print("Pilih nomor data yang dihapus: ");
        int index = input.nextInt()-1;

        if(index >=0 && index < daftarKarakter.size()){

            daftarKarakter.remove(index);

            System.out.println("Data berhasil dihapus");
        }

    }

}