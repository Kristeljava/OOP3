package OOP3;

public class Isik {
    String nimi; // isendiväli isiku nime jaoks
    private double pikkus;//isendiväli isiku pikkuse jaoks
    private long isikukood;
    double mass;


    public Isik(String nimi, double pikkus, long isikukood, double mass) {
        this.nimi = nimi;
        this.pikkus = pikkus;
        this.isikukood = 111;
        this.mass = mass;
    }
    public Isik() {
        this.nimi = "Kirjanik";
        this.pikkus = 2;
        this.isikukood = 222;
        this.mass = 20;
    }

    public String getNimi() {
        return nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public long getIsikukood() {
        return isikukood;
    }

    public double getMass() {
        return mass;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPikkus(double pikkus) {
        if (pikkus < 0.0 || pikkus > 2.0) {
            throw new IllegalArgumentException("ei tohi nii");
        }
        this.pikkus = pikkus;
    }

    public void setMass(double mass) {
        if (mass ==0) {
            throw new IllegalArgumentException("ei tohi nii");
        }
        this.mass = mass;
    }

    public String toString() {
        return "(" + nimi + "; " + pikkus + "; " + isikukood +")";
    }
    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }
    public int laenutuseMaksumus(int a) {
        return (int) (100*a);
    }

}
