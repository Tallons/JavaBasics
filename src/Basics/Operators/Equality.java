package Basics.Operators;

import java.util.Arrays;

public class Equality {

    public static void equality(int [] array ) {
        primitiveEquality(array[0], array[1]);

        int [] arraySlice1 = Arrays.copyOfRange(array, 0, 3); // 0 - 3 but not including index 3
        int [] arraySlice2 = Arrays.copyOfRange(array, 3, array.length);

        arrayEquality(arraySlice1, arraySlice2);

    }

    private static void primitiveEquality(int num1, int num2) {
        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " = " + (num1 < num2));
        System.out.println(num1 + " == " + num2 + " = " + (num1 == num2));
        System.out.println(num1 + " <= " + num2 + " = " + (num1 <= num2));
    }

    private static void arrayEquality(int[] array1, int[] array2) {
        System.out.println("First half of Array: " + Arrays.toString(array1));
        System.out.println("Second half of Array: " + Arrays.toString(array2));
        System.out.println("First half and Second half are equal: " + Arrays.equals(array1, array2));

        Object[] obj1 = {array1};
        Object[] obj2 = {array2};

        System.out.println("arrayObject1 and arrayObject2 are equal: " + Arrays.deepEquals(obj1, obj2));

    }

}
