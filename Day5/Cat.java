public class Cat {
    private String fur_color;
    private int num_of_leg;

    // public Cat(String fur_color, int num_of_leg, String show_identify) {
    // this.fur_color = fur_color;
    // this.num_of_leg = num_of_leg;
    // }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }

    public void setNum_of_leg(int num_of_leg) {
        this.num_of_leg = num_of_leg;
    }

    public int getNum_of_leg() {
        return this.num_of_leg;
    }

    public String getFur_color() {
        return this.fur_color;
    }

    public static void show_identify() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        cat1.setFur_color("Hitam");
        cat1.setNum_of_leg(4);

        cat2.setFur_color("Putih");
        cat2.setNum_of_leg(3);

        cat3.setFur_color("Hitam Putih");
        cat3.setNum_of_leg(4);

        cat4.setFur_color("Poleng poleng");
        cat4.setNum_of_leg(3);

        cat5.setFur_color("Bintik bintik");
        cat5.setNum_of_leg(4);

        System.out.println("Saya kucing dengan detail, Warna Bulu : " + cat1.getFur_color() + " dengan jumlah kaki : "
                + cat1.getNum_of_leg());
        System.out.println("Saya kucing dengan detail, Warna Bulu : " + cat2.getFur_color() + " dengan jumlah kaki : "
                + cat2.getNum_of_leg());
        System.out.println("Saya kucing dengan detail, Warna Bulu : " + cat3.getFur_color() + " dengan jumlah kaki : "
                + cat3.getNum_of_leg());
        System.out.println("Saya kucing dengan detail, Warna Bulu : " + cat4.getFur_color() + " dengan jumlah kaki : "
                + cat4.getNum_of_leg());
        System.out.println("Saya kucing dengan detail, Warna Bulu : " + cat5.getFur_color() + " dengan jumlah kaki : "
                + cat5.getNum_of_leg());
    }

    public static void main(String[] args) {
        show_identify();
    }
}
