public class Array {
    public static void main(String[] args) {

        int value = 7;

        int[] values;
        values = new int[3];

        System.out.println(values[0]);
        System.out.println("-----------");

        values[0] = 11;
        values[1] = 21;
        values[2] = 31;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println("-----------");

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("-----------");

        int[] numbers = {5, 6, 7};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }


}
