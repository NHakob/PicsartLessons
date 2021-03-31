public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("5 + 6 = " + 5 + 6);
        System.out.println("5 * 6 = " + 5 * 6);
        System.out.println("11 module 6 = " + 11 % 6);
        System.out.println("6 - 5 = " + (6 - 5));
        int a = 5;
        System.out.println("Postincrement: " + a++);
        System.out.println("Preincrement: " + ++a);
        System.out.println("Postdecrement: " + a--);
        System.out.println("Predecrement: " + --a);
        //a, b, c are triangle sides
        int b = 3;
        int c = 4;
        System.out.println(b == c);
        System.out.println(b != c);
        System.out.println(b > c);
        System.out.println(b < c);
        System.out.println(b >= c);
        System.out.println(b <= c);
        System.out.println(a >= b && b >= c ? "A has the greatest length" : "A has not the greatest length");
        System.out.println(a <= b || b >= c ? "B's length isn't the smallest " : "B's length is the smallest");
        System.out.println(!(a + b > c && a + c > b && b + c > a) ? "There can't be a triangle with that values" :
                "There can be a triangle with that values");
        System.out.println("Logical AND for 3 and 4 = " + (b & c));
        System.out.println("Logical OR for 3 and 4 = " + (b | c));
        System.out.println("Logical XOR for 3 and 4 = " + (b ^ c));
        System.out.println("Flipping for 4 = " + (~c));
        System.out.println("Left shift with 1 bit for 4 = " + (c<<1));
        System.out.println("Right shift with 1 bit for 4 = " + (c>>1));
        System.out.println("Right shift zero fill with 1 bit for -4 = " + ((-c)>>>1));

    }
}
