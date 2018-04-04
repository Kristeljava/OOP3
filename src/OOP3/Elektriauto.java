package OOP3;

public class Elektriauto {
    private String automark;
    private double elektrikulu;
    private int laadimisaeg;
    private int sõiduulatus;
    private Elektrijaam elektrijaam;

    public Elektriauto(String automark, double elektrikulu, int laadimisaeg, int sõiduulatus, Elektrijaam elektrijaam) {
        this.automark = automark;
        this.elektrikulu = elektrikulu;
        this.laadimisaeg = laadimisaeg;
        this.sõiduulatus = sõiduulatus;
        this.elektrijaam = elektrijaam;
    }

    public int getLaadimisaeg() {
        return laadimisaeg;
    }

    public void setLaadimisaeg(int laadimisaeg) {
        if (laadimisaeg == 0) {
            throw new IllegalArgumentException("ei tohi nii");
        }
        this.laadimisaeg = laadimisaeg;
    }

    public Elektrijaam getElektrijaam() {
        return elektrijaam;
    }

    public void setElektrijaam(Elektrijaam elektrijaam) {
        this.elektrijaam = elektrijaam;
    }
    public double maksumus100() {
        return elektrikulu* elektrijaam.elektrihind;
    }
    public double maksumus(int teepikkus) {
        return teepikkus*maksumus100()/100;
    }
    public double reisiKestus(int teepikkus, double kkiirus) {
        return ((teepikkus/sõiduulatus)*(laadimisaeg/60) + teepikkus/kkiirus);
    }
    void teemaksumus(Elektriauto auto, int teepikkus){
        System.out.println("Sõiduautoga " + auto.automark + " on "+ teepikkus + " kilomeetri läbimise maksumus "+ auto.maksumus(teepikkus));
    }
    void reisiKestus(Elektriauto auto, int teepikkus, double kkiirus){
        System.out.println("Sõiduautoga " + auto.automark + " läbitakse  "+ teepikkus + " kilomeetrit "+auto.reisiKestus(teepikkus, kkiirus)+ " tunniga.");
    }
    public String toString() {
        return "Auto mark: " + automark + "\n" + "100km maksumus: " + maksumus100();
    }
}
