public class Support extends Karakter {

    private int heal;

    public Support(String nama, String elemen, int level, int heal){
        super(nama, elemen, level);
        this.heal = heal;
    }

    // 🔁 OVERRIDING
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Heal   : " + heal);

        // pakai overloading
        System.out.println("Power  : " + hitungPower(level, heal));
    }
}