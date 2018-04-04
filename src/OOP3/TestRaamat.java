package OOP3;

public class TestRaamat {

    public static void main(String[] args) {
        Isik kirjanik = new Isik("Luts", 2.08, 72, 33);

        Raamat kevade = new Raamat(kirjanik,"Kevade");
        Raamat[] riiul = new Raamat[100];


        riiul[8]=kevade;

        System.out.println(riiul[8]);
        kirjanik.setNimi("Vilde");
        for (int i = 0; i < riiul.length; i++) {
            riiul[i] = new Raamat(kirjanik,"Kogutud teosed " + String.valueOf(i + 1));
        }

        System.out.println("10. raamat riiulil on " + riiul[0] + ".");


    }

}
