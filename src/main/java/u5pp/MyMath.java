package u5pp;

public class MyMath {
    
    public static int abs(int x){
        int num = Math.abs(x);
        return num;
    }

    public static double abs(double dx){
        double dnum = Math.abs(dx);
        return dnum;
    }

    public static double pow(double base, int exponent){
        double number = base;
        int power = exponent;
        return Math.pow(number, power );
    }

    public static int perfectSqrt(int square){
        int sr = square;
        return Math.sqrt(sr);
    }
}
