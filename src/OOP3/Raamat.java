package OOP3;

public class Raamat {
    private Isik raamatuAutor;
    private String pealkiri;

    public Raamat(Isik konkreetneAutor, String pealkiri) {
        this.raamatuAutor = konkreetneAutor;
        this.pealkiri = pealkiri;
    }
    public String toString() {
        return raamatuAutor.nimi + " " + pealkiri;
    }
}
