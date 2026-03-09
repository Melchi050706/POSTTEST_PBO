import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Karakter> dataKarakter = new ArrayList<>();

        int pilihan;

        do{

            System.out.println("\n=== Sistem Manajemen Karakter Wuthering Waves ===");
            System.out.println("1. Tambah Karakter");
            System.out.println("2. Lihat Data Karakter");
            System.out.println("3. Update Karakter");
            System.out.println("4. Hapus Karakter");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch(pilihan){

                case 1:

                    System.out.print("Nama Karakter : ");
                    String nama = input.nextLine();

                    System.out.print("Elemen : ");
                    String elemen = input.nextLine();

                    System.out.print("Senjata : ");
                    String senjata = input.nextLine();

                    System.out.print("Level : ");
                    int level = input.nextInt();
                    input.nextLine();

                    Karakter karakterBaru = new Karakter(nama, elemen, senjata, level);
                    dataKarakter.add(karakterBaru);

                    System.out.println("Data berhasil ditambahkan.");
                    break;

                case 2:

                    if(dataKarakter.size() == 0){
                        System.out.println("Belum ada data.");
                    }else{

                        for(int i = 0; i < dataKarakter.size(); i++){
                            System.out.println("\nData ke-" + (i+1));
                            dataKarakter.get(i).tampilData();
                        }

                    }

                    break;

                case 3:

                    System.out.print("Pilih nomor data yang ingin diupdate : ");
                    int indexUpdate = input.nextInt() - 1;
                    input.nextLine();

                    if(indexUpdate >= 0 && indexUpdate < dataKarakter.size()){

                        System.out.print("Nama baru : ");
                        dataKarakter.get(indexUpdate).nama = input.nextLine();

                        System.out.print("Elemen baru : ");
                        dataKarakter.get(indexUpdate).elemen = input.nextLine();

                        System.out.print("Senjata baru : ");
                        dataKarakter.get(indexUpdate).senjata = input.nextLine();

                        System.out.print("Level baru : ");
                        dataKarakter.get(indexUpdate).level = input.nextInt();
                        input.nextLine();

                        System.out.println("Data berhasil diupdate.");

                    }else{
                        System.out.println("Data tidak ditemukan.");
                    }

                    break;

                case 4:

                    System.out.print("Pilih nomor data yang ingin dihapus : ");
                    int indexHapus = input.nextInt() - 1;

                    if(indexHapus >= 0 && indexHapus < dataKarakter.size()){

                        dataKarakter.remove(indexHapus);
                        System.out.println("Data berhasil dihapus.");

                    }else{
                        System.out.println("Data tidak ditemukan.");
                    }

                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        }while(pilihan != 5);

    }
}