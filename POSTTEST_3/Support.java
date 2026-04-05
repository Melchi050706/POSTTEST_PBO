public class Support extends Karakter {

    private int heal;

    public Support(String nama, String elemen, int level, int heal){
        super(nama, elemen, level);
        this.heal = heal;
    }

    public void tampilSupport(){
        super.tampil();
        System.out.println("Heal   : " + heal);
    }
}