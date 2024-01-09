package Enskapsulasi;

public class Siswi {
    public String nama = "Anilia";
    private int usia = 16;
    protected String alamat = "Malang";
    char jk = 'p';

    public void setUsia() {
        this.usia = 20;
    }

    public int getUsia() {
        return usia;
    }

}