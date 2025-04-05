public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int [] array = new int[3];
        array [0] = 1;
        array [1] =2;
        array [2] = 3;
        double [] array1 = {1.57, 7.654, 9.986};
        int [] array2 = {10, 20, 30};

        System.out.println("Задача №2");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array1[i]);
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array2[i]);
        }
        System.out.println();

        System.out.println("Задача №3");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(array[i] + ", ");
            }else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(array1[i] + ", ");
            }else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(array2[i] + ", ");
            }else {
                System.out.print(array2[i]);
            }
        }
        System.out.println();

        System.out.println("Задача №4");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}