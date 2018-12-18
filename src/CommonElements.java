import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class CommonElements {

    private Integer[] convertToObject(int[] array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i<array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    private int[] toInt(Set<Integer> set) {
        int[] a = new int[set.size()];
        int i = 0;
        for (Integer val : set) a[i++] = val;
        return a;
    }

    int[] commonElements(int[] first, int[] second) {

        if (first == null || second == null) return null;

        Set<Integer> intersection = new HashSet<>();

        Set<Integer> array1 = new HashSet<>(Arrays.asList(convertToObject(first)));
        Set<Integer> array2 = new HashSet<>(Arrays.asList(convertToObject(second)));

        first = toInt(array1);
        second = toInt(array2);

        int[] outer = first.length >= second.length ? first : second;
        int[] inner = first.length < second.length ? first : second;

        for (int i1 : outer) {
            for (int i : inner) {
                if (i1 == i) {
                    intersection.add(i);
                }
            }
        }

        return toInt(intersection);
    }
}
