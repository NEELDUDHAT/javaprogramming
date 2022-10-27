public class logicaloperators {
    public static void main(String[] args) {
        int p = 20, q = 10, r = 5;

        // end operator
        System.out.println((p > q) && (p > r));
        System.out.println((p > q) && (p < r));

        // or perator
        System.out.println((p > q) || (r < q));
        System.out.println((p > q) || (r > q));
        System.out.println((p < q) || (r > q));

        // not operator
        System.out.println(!(p < q));
        System.out.println(!(p > q));

    }
}
