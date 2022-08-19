public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Решение задачи №1");
        var Box = 3;
    var box = 7;
        System.out.println("Коробка-" +Box);
        System.out.println("коробка-" +box);
    byte a = 3;
    short b = 22;
    int c = 70;
    long d = 151L;
    float e = 0.2f;
    double f = -0.11;
        System.out.println("Целочисленные:" );
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("С плавующей точкой: "  +e +" " +f );

        System.out.println("Решение задачи №2");
        float BoxerOne = 78.2f;
        float BoxerTwo = 82.7f;
        float t = BoxerOne + BoxerTwo;
        System.out.println("Общий вес боксеров " +t);
        float r = BoxerOne - BoxerTwo;
        System.out.println("Разница в весе " +r);

        System.out.println("Решение задачи №3");
        var banan = 5;
        var milk = 2;
        var plombir = 2;
        var eggs = 4;
        var bananGramm = banan*80;
        var milkGramm = milk*105;
        var plombirGramm = plombir*100;
        var eggsGramm = eggs*70;
        var SportGramm = bananGramm + milkGramm + plombirGramm + eggsGramm ;
        float SportKG = SportGramm/100f;
        System.out.println("" +SportKG);
        System.out.println("" +SportGramm);

        System.out.println("Решение задачи №4");
        var mass = 7;
        var ration250 = 250;
        var ration500 = 500;
        float rationKg1 = ration250 / 1000f;
        float rationKg2 = ration500 / 1000f;
        int day250 = (int) (mass/ rationKg1);
        int day500 = (int) (mass/ rationKg2);
        System.out.println("дней по рациону 250г- " +day250 +" дней");
        System.out.println("дней по рациону 500г- " +day500 +" дней");
        long days = (day250 + day500) / 2L;
        System.out.println("дней по рациону в среднем " +days +" дней");

        System.out.println("Решение задачи №5");
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        // годовой доход без увеличения
        int MashaYear = Masha * 12;
        int DenisYear = Denis * 12;
        int KristinaYear = Kristina * 12;
// // годовой доход после увеличения
        double MashaNew = Masha * 1.1;
        double DenisNew = Denis * 1.1;
        double KristinaNew = Kristina * 1.1;
        int MashaNewYear = (int) (MashaNew * 12);
        int DenisNewYear = (int) (DenisNew * 12);
        int KristinaNewYear = (int) (KristinaNew * 12);
        System.out.println("Годовой доход до увеличения Маша: "+MashaYear +" рублей");
        System.out.println("Годовой доход до увеличения Денис: "+DenisYear +" рублей");
        System.out.println("Годовой доход до увеличения Кристины: "+KristinaYear +" рублей");
        System.out.println("Годовой доход после увеличения Маша: "+MashaNewYear +" рублей");
        System.out.println("Годовой доход после увеличения Денис: "+DenisNewYear +" рублей");
        System.out.println("Годовой доход после увеличения Кристины: "+KristinaNewYear +" рублей");
        System.out.println("Конец задания");

    }
}