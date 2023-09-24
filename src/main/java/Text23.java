public class Text23 {
    public static void main(String[] args) {

        int[] number = new int[1];
        try {
            number[0] = 1;
            number[1] = 2;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("hairetu");

        }
        System.out.println("shorim");
    }
}
