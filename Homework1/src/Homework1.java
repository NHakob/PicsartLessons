public class Homework1 {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 5252l;
        float e = 12.5f;
        double f = 22.55;
        boolean g = true;
        char h = '\u0024';
        String str = "Primitive types values are:\n";

        System.out.printf(str + "byte: %d\n" + "short: %d\n" + "int: %d\n" + "long: %d\n" + "float: %f\n" + "double: %f\n"
                          + "boolean: %b\n" + "char: %c\n", a, b, c, d, e, f, g, h);
    }
}
