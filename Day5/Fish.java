public class Fish {
    private String type;
    private String feed;

    public void setType(String type) {
        this.type = type;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getFeed() {
        return this.feed;
    }

    public String getType() {
        return this.type;
    }

    public static void show_identify() {
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        Fish fish3 = new Fish();
        Fish fish4 = new Fish();

        fish1.setType("Hitam");
        fish1.setFeed("Plankton");

        fish2.setType("Putih");
        fish2.setFeed("Cacing");

        fish3.setType("Hitam Putih");
        fish3.setFeed("Jangkrik");

        fish4.setType("Poleng poleng");
        fish4.setFeed("Pelet");

        System.out.println("Saya Ikan dengan detail, Jenis : " + fish1.getType() + ", makanan : "
                + fish1.getFeed());
        System.out.println("Saya Ikan dengan detail, Jenis : " + fish2.getType() + ", makanan : "
                + fish2.getFeed());
        System.out.println("Saya Ikan dengan detail, Jenis : " + fish3.getType() + ", makanan : "
                + fish3.getFeed());
        System.out.println("Saya Ikan dengan detail, Jenis : " + fish4.getType() + ", makanan : "
                + fish4.getFeed());
    }

    public static void main(String[] args) {
        show_identify();
    }
}
