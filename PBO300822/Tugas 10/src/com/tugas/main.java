package com.tugas;

class Persegi{
    private int nilai;

    Persegi(int nilai){
        this.nilai = nilai;
    }
    public void setLuas(int Luas){
        this.nilai = Luas*2;
    }

    public int getNilai() {
        return this.nilai * 2;
    }
    
    public int getKel() {
        return nilai * 4;
    }
}


public class main {
    public static void main(String[] args) {
       Persegi value1 = new Persegi(12);
       System.out.println("Luas " + value1.getNilai());
       value1.setLuas(5);
       System.out.println("Nilai " + value1.getKel());
       System.err.println("Keliling " + value1.getKel());
        
    }
}
