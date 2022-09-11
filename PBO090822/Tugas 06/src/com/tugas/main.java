package com.tugas;

class Player {
    String nama;
    double darah;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String nama, double darah) {
        this.nama = nama;
        this.darah = darah;
    }

    void pakeSenjata(Weapon weapon) {
        this.weapon = weapon;
    }

    void pakePertahanan(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName : " + this.nama);
        System.out.println("Health : " + this.darah + " kesehatan");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon {
    double attackPower;
    String name;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

class Armor {
    double defensePower;
    String nama;

    Armor(String nama, double defensePower) {
        this.nama = nama;
        this.defensePower = defensePower;
    }

    void display() {
        System.out.println("Armor : " + this.nama + " , ketahanan : " + this.defensePower);
    }
}

public class main {

    public static void main(String[] args) {

        Player player1 = new Player("usss", 1000);
        Player player2 = new Player("qyyy", 5);

        Weapon pedang = new Weapon("Sarung Wadimor", 15);
        Weapon ketapel = new Weapon("Sarung Samarinda", 1);

        Armor bajuBesi = new Armor("Gamis", 1000);
        Armor kaos = new Armor("Kaos Dalem", 0);

        player1.pakeSenjata(pedang);
        player1.pakePertahanan(bajuBesi);
        player1.display();

        player2.pakeSenjata(ketapel);
        player2.pakePertahanan(kaos);
        player2.display();
    }
}