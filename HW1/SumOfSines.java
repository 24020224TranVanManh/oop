public class SumOfSines {
	public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        n = Math.toRadians(n);
        System.out.println(Math.sin(2*n) + Math.sin(3*n));
    }
}