package hw;

public class hw31octZadanie2 {
    public static void main(String[] args) {
        int[] arrayInt = {12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {

                System.out.print(arrayInt[i] + ", ");

            }
        }
        int max = arrayInt[0];
        for (int x = 1; x < arrayInt.length; x++){
            if (arrayInt[x] > max) {
                max = arrayInt [x];
            }
        }
        System.out.println();
        System.out.println("Максимальное значение = " + max);
    }
}
