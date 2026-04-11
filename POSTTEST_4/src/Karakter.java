public class Karakter {

    protected String nama;
    protected String elemen;
    protected int level;

    public Karakter(String nama, String elemen, int level){
        this.nama = nama;
        this.elemen = elemen;
        this.level = level;
    }

    // 🔁 METHOD OVERLOADING
    public int hitungPower(int level){
        return level * 10;
    }

    public int hitungPower(int level, int bonus){
        return (level * 10) + bonus;
    }

    // method umum
    public void tampil(){
        System.out.println("Nama   : " + nama);
        System.out.println("Elemen : " + elemen);
        System.out.println("Level  : " + level);
    }
}