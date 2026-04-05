public class Karakter {

    protected String nama;
    protected String elemen;
    protected int level;

    public Karakter(String nama, String elemen, int level){
        this.nama = nama;
        this.elemen = elemen;
        this.level = level;
    }

    public void tampil(){
        System.out.println("Nama   : " + nama);
        System.out.println("Elemen : " + elemen);
        System.out.println("Level  : " + level);
    }
}