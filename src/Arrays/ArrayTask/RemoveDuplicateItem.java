package Arrays.ArrayTask;

import java.util.Arrays;
public class RemoveDuplicateItem {
    int[] arr = {1, 2, 2, 3, 4, 5, 5, 2, 5, 5, 6, 6};
    int[] arr1 = new int[arr.length];
    boolean[] arr2 = new boolean[arr.length];

    void removeDuplicate() {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i]) {
                continue;
            }
            arr1[index++] = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                    arr2[j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] t) {
        RemoveDuplicateItem rm = new RemoveDuplicateItem();
        rm.removeDuplicate();
    }
}

