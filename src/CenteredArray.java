import java.util.Arrays;

class CenteredArray {

    private boolean isArrayGreater(int number, int[] array) {
        boolean isGreater = true;
        for (int i1 : array) {
            if (i1 > number) continue;
            isGreater = false;
        }
        return isGreater;
    }

    int isArrayCentered(int[] array) {
        if (array.length < 2 || array.length % 2 != 1) return 0;

        int middleIndex = Math.floorDiv(array.length , 2);
        int middleElement = array[middleIndex];

        int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        int[] rightArray = Arrays.copyOfRange(array, middleIndex + 1, array.length);

        return isArrayGreater(middleElement, leftArray) && isArrayGreater(middleElement, rightArray) ? 1 : 0;
    }
}
