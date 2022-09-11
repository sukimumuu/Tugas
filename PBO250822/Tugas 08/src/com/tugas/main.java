package com.tugas;

class Lagu {
    String judul;
    String artist;

    Lagu(String judul, String artist) {
        this.judul = judul;
        this.artist = artist;
    }

    void muncul() {
        System.out.println("\nJudul Lagu : " + this.judul);
        System.out.println("Artist : " + this.artist);
    }
}

public class main {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Rapsodi", "JKT48");
        lagu1.muncul();
        String addressLagu1 = Integer.toHexString(System.identityHashCode(lagu1));
        System.out.println(addressLagu1 + "\n");

        Lagu lagu2 = lagu1;
        lagu2.muncul();
        String addressLagu2 = Integer.toHexString(System.identityHashCode(lagu2));
        System.out.println(addressLagu2 + "\n");

        fungsi(lagu1);
        lagu1.muncul();
        lagu2.muncul();
    }

    public static void fungsi(Lagu daftarLagu) {
        String addressdaftarLagu = Integer.toHexString(System.identityHashCode(daftarLagu));
        System.out.println("address dalam fungsii " + addressdaftarLagu);
        addressdaftarLagu = "Jiwaru Days";
    }
}
