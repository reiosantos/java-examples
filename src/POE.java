import java.util.Arrays;

class POE {

    int pointOfIndex(int[] array) {
        return point(array, 1);
    }

    private int point(int[] array, int startIndex) {
        if (array.length < 2 || array.length < startIndex + 1) return -1;

        int[] leftArray = Arrays.copyOfRange(array, 0, startIndex);
        int[] rightArray = Arrays.copyOfRange(array, startIndex + 1, array.length);

        return Arrays.stream(leftArray).sum() == Arrays.stream(rightArray).sum()
                ? startIndex
                : point(array, startIndex + 1);
    }
}
