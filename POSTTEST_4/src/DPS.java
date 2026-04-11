public class DPS extends Karakter {

    private int damage;

    public DPS(String nama, String elemen, int level, int damage){
        super(nama, elemen, level);
        this.damage = damage;
    }

    // 🔁 OVERRIDING
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Damage : " + damage);

        // pakai overloading
        System.out.println("Power  : " + hitungPower(level, damage));
    }
}