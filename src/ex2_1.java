public class ex2_1 {
    public static void main(String[] args) {
        try {
            int[] intArray = {2,5,7,4,8,1,9,6,3};
            int d = 3;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
