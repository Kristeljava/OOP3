package OOP3;

public class TestAuto {
    public static void main(String[] args) {
        Elektrijaam hind = new Elektrijaam(11.5);
        Elektriauto e = new Elektriauto("Tesla", 23.6, 1200, 335, hind);
        Elektriauto e2 = new Elektriauto("Mia Electric", 10.0, 180, 80, hind);

        System.out.println(e);
        System.out.println(e2);

        //System.out.println(e.maksumus100());

        e.teemaksumus(e,200);
        e.teemaksumus(e2,200);
        e.reisiKestus(e, 200, 80);
        e.reisiKestus(e2, 200, 80);

    }
}
