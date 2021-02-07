package HomeWork1;

public class MainHomeWork {

    public static void main(String[] args) {

        testVals();
        System.out.println(checkSum(7, 8));
        System.out.println(testFormula(1.0, 2.0, 3.0, 4.0));
        checkNum(-4);
        checkNumber(-5);
        writeHelloName();
        checkLeapYear(2400);
    }

    public static void testVals() {

        byte valA = -101;
        System.out.println(valA);

        short valB = 30000;
        System.out.println(valB);

        int valC;
        valC = 1000003;
        System.out.println(valC);

        long valD;
        valD = 2000000000L;
        System.out.println(valD);

        float valE;
        valE = 25.52f;
        System.out.println(valE);

        double valF;
        valF = -10.0;
        System.out.println(valF);

        char valJ;
        valJ = '\u1087';
        System.out.println(valJ);

        boolean valK = true;
        boolean valM = false;
        System.out.println(valM);

        String homeStr = "Home";
        String workStr = "work";
        System.out.println(homeStr + " " + workStr);
    }

    public static boolean checkSum(int varS, int varR) {
        var Sum = varS + varR;
        return Sum >= 10 && Sum <= 20;

    }

    public static double testFormula(double vara, double varb, double varc, double vard) {
        double varZ = vara * (varb + varc / vard);
        return varZ;
    }

    public static void checkNum(int varN) {

        if (varN >= 0) {
            System.out.println("Число положительне");
        } else
            System.out.println("Число отрицательное");
    }

    public static boolean checkNumber(int G) {
        return G < 0;
    }

    public static void writeHelloName() {
        final String helloStr = "Привет";
        String nameStr = "Вася";
        System.out.println(helloStr + " " + nameStr + "!");
    }

    public static void checkLeapYear(int Y) {
        if (Y % 4 == 0 && Y % 100 != 0 || Y % 400 == 0) {
            System.out.println(Y + " " + "год является високосным");
        } else
            System.out.println(Y + " " + "год обычный");
    }

}




