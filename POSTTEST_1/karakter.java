class Karakter {

    String nama;
    String elemen;
    String senjata;
    int level;

    Karakter(String nama, String elemen, String senjata, int level){
        this.nama = nama;
        this.elemen = elemen;
        this.senjata = senjata;
        this.level = level;
    }

    void tampilData(){
        System.out.println("Nama    : " + this.nama);
        System.out.println("Elemen  : " + this.elemen);
        System.out.println("Senjata : " + this.senjata);
        System.out.println("Level   : " + this.level);
    }
}