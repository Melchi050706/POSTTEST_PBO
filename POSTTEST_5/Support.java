public class Support extends Karakter implements Aksi {

    private int heal;

    public Support(String nama, String elemen, int level, int heal){
        super(nama, elemen, level);
        this.heal = heal;
    }

    @Override
    public void tampil(){
        infoDasar();
        System.out.println("Heal   : " + heal);
    }

    @Override
    public void serang(){
        System.out.println(nama + " menyerang dengan damage kecil!");
    }

    @Override
    public void skill(){
        System.out.println(nama + " menggunakan skill heal!");
    }
}