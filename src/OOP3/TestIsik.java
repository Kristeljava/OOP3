package OOP3;

public class TestIsik {

    public static void main(String[] args) {
        Isik e = new Isik("Ülli Õpilane", 2.05, 99, 3);
        Isik k = new Isik ();

        e.setPikkus(1.7);
        e.setMass(10);
        int a=10;
        System.out.println(e.toString());
        System.out.println(e);
        System.out.println(k);
        System.out.println(e.suusakepiPikkus());
        System.out.println(e.laenutuseMaksumus(a));
    }

}
