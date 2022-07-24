public class Flower {
    private String nama;
    private String color;
    private int num_of_petal;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNum_of_petal(int num_of_petal) {
        this.num_of_petal = num_of_petal;
    }

    public String getNama() {
        return nama;
    }

    public String getColor() {
        return color;
    }

    public int getNum_of_petal() {
        return num_of_petal;
    }

    public static void show_identify() {
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower();
        Flower flower4 = new Flower();

        flower1.setNama("bangkai");
        flower1.setColor("merah");
        flower1.setNum_of_petal(12);

        flower2.setNama("anggrek");
        flower2.setColor("putih");
        flower2.setNum_of_petal(8);

        flower3.setNama("mawar");
        flower3.setColor("merah");
        flower3.setNum_of_petal(3);

        flower4.setNama("melati");
        flower4.setColor("kuning");
        flower4.setNum_of_petal(5);

        System.out.println("Saya Bunga dengan detail, Jenis : " + flower1.getNama() + " , Jenis : "
                + flower1.getColor() + " , Num of petal : " + flower1.getNum_of_petal());

        System.out.println("Saya Bunga dengan detail, Jenis : " + flower2.getNama() + " , Jenis : "
                + flower2.getColor() + " , Num of petal : " + flower2.getNum_of_petal());

        System.out.println("Saya Bunga dengan detail, Jenis : " + flower3.getNama() + " , Jenis : "
                + flower3.getColor() + " , Num of petal : " + flower3.getNum_of_petal());

        System.out.println("Saya Bunga dengan detail, Jenis : " + flower4.getNama() + " , Jenis : "
                + flower4.getColor() + " , Num of petal : " + flower4.getNum_of_petal());
    }

    public static void main(String[] args) {
        show_identify();
    }
}