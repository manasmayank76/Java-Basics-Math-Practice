public class ThreeSort {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please enter exactly 3 integers.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        System.out.println(min + " " + mid + " " + max);
    }
}
