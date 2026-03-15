public class Karakter {

    // Encapsulation (data disembunyikan)
    private String nama;
    private String elemen;
    private int level;

    // Constructor
    public Karakter(String nama, String elemen, int level){
        this.nama = nama;
        this.elemen = elemen;
        this.level = level;
    }

    // Getter
    public String getNama(){
        return nama;
    }

    public String getElemen(){
        return elemen;
    }

    public int getLevel(){
        return level;
    }

    // Setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setElemen(String elemen){
        this.elemen = elemen;
    }

    public void setLevel(int level){
        if(level > 0){
            this.level = level;
        }
    }
}