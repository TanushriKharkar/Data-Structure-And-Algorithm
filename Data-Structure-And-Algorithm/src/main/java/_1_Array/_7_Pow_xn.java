package _1_Array;

public class _7_Pow_xn {

    public double myPow(double x, int n) {

        long binForm = n;

        //for negative power
        if(n < 0)   {
            x = 1/x;
            binForm = -binForm;
        }

        double ans = 1;

        //for positive power
        while(binForm > 0)  {
            if(binForm % 2 == 1)    {
                ans *= x;
            }
            x *= x;
            binForm /= 2;
        }
        return ans;
    }


    public static void main(String args[])  {
        _7_Pow_xn obj = new _7_Pow_xn();

        // Sample Inputs
        double x1 = 2.0;
        int n1 = 10;

        double x2 = 2.0;
        int n2 = -2;

        double x3 = 0.5;
        int n3 = 4;

        // Print Results
        System.out.println(x1 + "^" + n1 + " = " + obj.myPow(x1, n1)); // 1024.0
        System.out.println(x2 + "^" + n2 + " = " + obj.myPow(x2, n2)); // 0.25
        System.out.println(x3 + "^" + n3 + " = " + obj.myPow(x3, n3)); // 0.0625
    }
}
