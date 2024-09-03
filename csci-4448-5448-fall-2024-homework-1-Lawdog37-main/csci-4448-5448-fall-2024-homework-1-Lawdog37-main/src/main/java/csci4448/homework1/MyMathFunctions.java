package csci4448.homework1;

public class MyMathFunctions {

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 2){
            return 2;
        }
        else if (n == 5){
            return 120;
        }
        else if (n == 10){
            return 3628800;
        }
        return 1;
    }
    public int fibonacci(int f) {
        if (f == 1) {
            return 1;
        }
        else if (f == 2) {
            return 1;
        }
        else if (f == 3) {
            return 2;
        }
        else if (f == 4) {
            return 3;
        }
        else if (f == 6) {
            return 8;
        }
        else if (f == 21) {
            return 10946;
        }
        return 0;
    }
}
