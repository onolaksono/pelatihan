interface animalAction {
    public void identify_myself();
}

class Animal implements animalAction {
    protected String nama;
    protected String jenis;
    protected String gigi;

    public Animal() {
    }

    public Animal(String nama, String jenis, String gigi) {
        this.nama = nama;
        this.jenis = jenis;
        this.gigi = gigi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getGigi() {
        return gigi;
    }

    public void setGigi(String gigi) {
        this.gigi = gigi;
    }

    @Override
    public void identify_myself() {
        System.out.println("Hi I'm Parent of All Animal, My name is " + nama);
    }
}

class Herbivor extends Animal {
    public Herbivor(String nama, String jenis, String gigi) {
        super(nama, jenis, gigi);
    }

    @Override
    public void identify_myself() {
        System.out.println(
                "Hi I'm Herbivor, My name is " + nama + ", My Food is '" + jenis + "', I have " + gigi + " teeth");
    }
}

class Carnivor extends Animal {
    public Carnivor(String nama, String jenis, String gigi) {
        super(nama, jenis, gigi);
    }

    @Override
    public void identify_myself() {
        System.out.println(
                "Hi I'm Carnivor, My name is " + nama + ", My Food is '" + jenis + "', I have " + gigi + " teeth");
    }
}

class Omnivor extends Animal {
    public Omnivor(String nama, String jenis, String gigi) {
        super(nama, jenis, gigi);
    }

    @Override
    public void identify_myself() {
        System.out.println(
                "Hi I'm Omnivor, My name is " + nama + ", My Food is '" + jenis + "', I have " + gigi + " teeth");
    }
}

public class Challenge4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNama("Binatang");
        animal.identify_myself();

        Herbivor herbivor = new Herbivor("Kambing", "Tumbuhan", "Tumpul");
        herbivor.identify_myself();

        Carnivor carnivor = new Carnivor("Singa", "daging", "tajam");
        carnivor.identify_myself();

        Omnivor omnivor = new Omnivor("Ayam", "Semua", "Tajam dan Tumpul");
        omnivor.identify_myself();
    }
}
