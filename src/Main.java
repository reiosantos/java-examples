import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CenteredArray centeredArray = new CenteredArray();
        int[] arrayToCheck = {3, 2, 1, 4, 5};

        System.out.println("1: Is array Centered: " + centeredArray.isArrayCentered(arrayToCheck));

        XMinusY xMinusY = new XMinusY();
        int[] array = {};
        System.out.println("2: Difference: " + xMinusY.xminusY(array));

        ReverseInteger reverseInteger = new ReverseInteger();
        int number = -12345;
        System.out.println("4: Reversed Number: " + reverseInteger.reverseInteger(number));

        CommonElements commonElements = new CommonElements();
        int[] array1 = {1, 8, 3, 2, 6};
        int[] array2 = {2, 6, 1};
        System.out.println("5: Common in arrays: " + Arrays.toString(commonElements.commonElements(array1, array2)));

        POE poe = new POE();
        int[] point = {1, 8, 3, 7, 10, 2};
        System.out.println("6: POE: " + poe.pointOfIndex(point));
    }
}
