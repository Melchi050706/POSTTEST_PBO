public class DPS extends Karakter {

    private int damage;

    public DPS(String nama, String elemen, int level, int damage){
        super(nama, elemen, level); // ambil dari parent
        this.damage = damage;
    }

    public void tampilDPS(){
        super.tampil();
        System.out.println("Damage : " + damage);
    }
}