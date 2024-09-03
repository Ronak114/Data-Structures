public class a64_overloading {
    public static void main(String args[]) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        cal.sum((float) 1.9, (float) 2.7); // consider as double
        cal.sum(1, 8, 2);
    }
}

class Calculator {
    int sum(int a, int b) {
        return (a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }
}