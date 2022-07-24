import java.util.Scanner;

class Kandang {
    protected String nama;

    public Kandang() {
    }

    public Kandang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class kandangKambing extends Kandang {

    public kandangKambing(String nama) {
        super(nama);
    }

}

class kandangBebek extends Kandang {
    public kandangBebek(String nama) {
        super(nama);
    }
}

class kandangZebra extends Kandang {
    public kandangZebra(String nama) {
        super(nama);
    }
}

public class Challenge5 {
    static int pilih, jml, pilkandang, pilnamahewan;
    static char ulang;
    static Scanner input = new Scanner(System.in);

    static void menu_awal() {
        System.out.println("---------------------------------------");
        System.out.println((char) 27 + "\u001b[34m            Tebak Kandang" + (char) 27 + "[00;00m");
        System.out.println("---------------------------------------");
        System.out.println("1: Jumlah Kandang");
        System.out.println("99: Exit");
        System.out.println("---------------------------------------");
        System.out.print("Pilih Menu : ");
        pilih = input.nextInt();
    }

    static void pilihKandang() {
        System.out.print("Pilih Kandang yang ingin dibuka : ");
        pilkandang = input.nextInt();
        System.out.println((char) 27 + "\u001b[34m K" + (char) 27 + "[00;00m : Kambing");
        System.out.println((char) 27 + "\u001b[31m Z" + (char) 27 + "[00;00m : Zebra");
        System.out.println((char) 27 + "\u001b[33m B" + (char) 27 + "[00;00m : Bebek");
        System.out.print("Masukkan tebakan : ");
        pilnamahewan = input.nextInt();
    }

    public static void main(String[] args) {
        menu_awal();
        if (pilih == 1) {
            System.out.print("Masukkan Jumlah Kandang : ");
            jml = input.nextInt();
            for (int i = 1; i <= jml; i++) {
                System.out.print("| | |\n" +
                        "| " + i + " |\n" +
                        "| | |\n\n");
            }
            pilihKandang();
        } else if (pilih == 99) {
            System.exit(0);
        } else {
            System.out.println("Pilihan Salah!");
        }
    }
}
