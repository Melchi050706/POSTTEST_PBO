public class DPS extends Karakter implements Aksi {

    private int damage;

    public DPS(String nama, String elemen, int level, int damage){
        super(nama, elemen, level);
        this.damage = damage;
    }

    // override abstract method
    @Override
    public void tampil(){
        infoDasar();
        System.out.println("Damage : " + damage);
    }

    // implement interface
    @Override
    public void serang(){
        System.out.println(nama + " menyerang dengan damage besar!");
    }

    @Override
    public void skill(){
        System.out.println(nama + " menggunakan skill DPS!");
    }
}