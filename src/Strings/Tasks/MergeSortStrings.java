package Strings.Tasks;
import java.util.*;
public class MergeSortStrings
{

        static void mergeSort(String[] s1, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                System.out.printf("%d ,%d ,%d \n",left,mid,right);
                mergeSort(s1, left, mid);
                mergeSort(s1, mid + 1, right);
                merge(s1, left, mid, right);
            }
        }

        static void merge(String[] s1, int left, int mid, int right)
        {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            String[] leftArray = new String[n1];
            String[] rightArray = new String[n2];

            for (int i = 0; i < n1; i++) leftArray[i] = s1[left + i];
            for (int i = 0; i < n2; i++) rightArray[i] = s1[mid + 1 + i];

            int i = 0, j = 0, k = left;

            while (i < n1 && j < n2) {
                if (!greaterString(leftArray[i], rightArray[j])) {
                    s1[k++] = leftArray[i++];
                } else {
                    s1[k++] = rightArray[j++];
                }
            }

            while (i < n1) s1[k++] = leftArray[i++];
            while (j < n2) s1[k++] = rightArray[j++];
        }

        static boolean greaterString(String s1, String s2)
        {
            int minLength = Math.min(s1.length(), s2.length());

            for (int i = 0; i < minLength; i++) {
                if (s1.charAt(i) > s2.charAt(i)) return true;
                if (s1.charAt(i) < s2.charAt(i)) return false;
            }

            return s1.length() > s2.length();
        }

        public static void main(String[] args)
        {
            String[] s = { "Hardships", "often", "prepare", "ordinary", "people", "for", "an", "extraordinary", "destiny", "motivate", "string" };

            System.out.println("Before Sorting: " + Arrays.toString(s));
            mergeSort(s, 0, s.length - 1);
            System.out.println("After Sorting: " + Arrays.toString(s));
        }
    }


