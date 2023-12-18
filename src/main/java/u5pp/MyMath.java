package u5pp;

public class MyMath {
    // makes an int absolute value//
    public static int abs(int x){
        int num = x;
        
        if (num < 0){
            num = num * (-1);
        }

        
        return num;
    }
// makes a double absolute value//
    public static double abs(double dx){
        double dnum = dx;

        if (dnum < 0){
            dnum = dnum *(-1);
        }
        return dnum;
    }
// takes a double as a base number an int as exponent and solves//
    public static double pow(double base, int exponent){
        double number = base;
        if (exponent == 0){
            return 1.0;
        }
        
        for (int a = 0; a < exponent-1; a++){
            base*= number;
        }
        return base;
    }
// returns the squre root//
    public static int perfectSqrt(int square){
        int sr = square;
        
        if (sr < 0) {
            return -1; 
        }
        int sqrt = 0;
        while (sqrt * sqrt <= sr) {
            if (sqrt * sqrt == sr) {
                return sqrt;
            }
            sqrt++;
        }

        return -1;

    }
}
