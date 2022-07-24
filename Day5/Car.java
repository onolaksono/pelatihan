public class Car {
    private String nama;
    private String color;
    private int num_of_tire;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNum_of_tire(int num_of_tire) {
        this.num_of_tire = num_of_tire;
    }

    public String getNama() {
        return nama;
    }

    public String getColor() {
        return color;
    }

    public int getNum_of_tire() {
        return num_of_tire;
    }

    public static void show_identify() {
        Car Car1 = new Car();
        Car Car2 = new Car();
        Car Car3 = new Car();
        Car Car4 = new Car();

        Car1.setNama("sedan");
        Car1.setColor("merah");
        Car1.setNum_of_tire(4);

        Car2.setNama("truk");
        Car2.setColor("hijau");
        Car2.setNum_of_tire(6);

        Car3.setNama("tronton");
        Car3.setColor("coklat");
        Car3.setNum_of_tire(12);

        Car4.setNama("angkot");
        Car4.setColor("kuning");
        Car4.setNum_of_tire(4);

        System.out.println("Saya mobil dengan detail, Type : " + Car1.getNama() + " , Type : "
                + Car1.getColor() + " , num of tire : " + Car1.getNum_of_tire());

        System.out.println("Saya mobil dengan detail, Type : " + Car2.getNama() + " , Type : "
                + Car2.getColor() + " , num of tire : " + Car2.getNum_of_tire());

        System.out.println("Saya mobil dengan detail, Type : " + Car3.getNama() + " , Type : "
                + Car3.getColor() + " , num of tire : " + Car3.getNum_of_tire());

        System.out.println("Saya mobil dengan detail, Type : " + Car4.getNama() + " , Type : "
                + Car4.getColor() + " , num of tire : " + Car4.getNum_of_tire());
    }

    public static void main(String[] args) {
        show_identify();
    }
}
