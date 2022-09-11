package com.tugas;

//class dan object
class Manusia {
    String nama;
    String asal;
    int umur;
}
// akhir class dan object

// constructor
class Manusia2 {

    Manusia2() {
        System.out.println("Ini adalah Constructor Manusia");
    }
}
// akhir dari constructor

// contructor parameter
class Manusia3 {
    String nama;
    String asal;

    Manusia3(String inputNama, String inputAsal) {
        nama = inputNama;
        asal = inputAsal;

        System.out.println(nama);
        System.out.println(asal);
    }
}
// akhir contructor parameter

// method
class Manusia4 {
    String nama;
    String nomer;

    Manusia4(String nama, String nomer) {
        this.nama = nama;
        this.nomer = nomer;
    }

    void liat() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Nomer : " + this.nomer);
    }
}

public class main {
    public static void main(String[] args) {
        // class dan object
        Manusia objectOrang1 = new Manusia();
        objectOrang1.nama = "Arya Haidar Saputra";
        objectOrang1.asal = "Jl.kebahagiaan no.666";
        objectOrang1.umur = 18;
        System.out.println(objectOrang1.nama);
        System.out.println(objectOrang1.asal);
        System.out.println(objectOrang1.umur);
        // akhir class dan object

        // constructor
        Manusia2 orang2 = new Manusia2();
        new Manusia2();
        // akhir constructor

        // constructor parameter
        Manusia3 orang3 = new Manusia3("Nopal", "Jogja");
        Manusia3 orang4 = new Manusia3("Yulian", "Jogja Utara");
        // skhir constructor parameter

        // methodd
        Manusia4 orang5 = new Manusia4("Muthee", "29");
        orang5.liat();
        // akhir method

        System.out.println();
        System.out.println("Rizqy Bagus Saputra | XI RPL 1 (31)");
    }
}
