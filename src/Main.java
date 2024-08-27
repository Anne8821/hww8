public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] intArray = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};

        for (int i = 0; i < doubles.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(doubles[i]);
        }
        System.out.println();

        for (int i = 0; i < intArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(intArray[i]);
        }
        System.out.println();

        int[] intArray1 = new int[]{1, 2, 3};
        double[] doubles1 = {1.57, 7.654, 9.986};
        char[] chars1 = {'a', 'b', 'c', 'd', 'e', 'f'};

        for (int i = intArray1.length - 1; i >= 0; i--) {
            System.out.print(intArray1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doubles1.length - 1; i >= 0; i--) {
            System.out.print(doubles1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] inst = new int[]{1, 2, 3};

        for (int i = 0; i < inst.length; i++) {
            if (inst[i] % 2 != 0) {
                inst[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(inst[i]);
        }
    }
}