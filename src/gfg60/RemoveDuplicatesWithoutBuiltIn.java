package gfg60;

public class RemoveDuplicatesWithoutBuiltIn {
}

/* To get the absolute best worst-case Time Complexity (TC) and Space Complexity (SC) without using any built-in data structures (like HashSet or HashMap), we cannot use standard QuickSort. QuickSort has a bad worst-case time complexity of $O(N^2)$ if the pivot choices are poor.
Instead, the most optimal solution under strict raw logic rules uses MergeSort combined with an In-Place Unique Filter. This guarantees optimal performance even in the absolute worst-case scenario.
## The Optimal Metrics

* Worst-Case Time Complexity: $\mathbf{O(N \log N)}$ (Guaranteed by MergeSort during the sorting phase, followed by a linear $O(N)$ scanning phase).
* Worst-Case Space Complexity: $\mathbf{O(N)}$ (Required as temporary working memory by MergeSort to safely merge elements back together).

------------------------------
## Implementation

public class OptimalDuplicateRemover {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 1, 5, 2, 3, 1};

        // 1. Sort using MergeSort: Guarantees O(N log N) worst-case TC
        mergeSort(arr, 0, arr.length - 1);

        // 2. Filter duplicates in a single pass: O(N) TC, O(1) SC
        int uniqueLength = removeDuplicatesInPlace(arr);

        // Output results up to the unique length
        System.out.print("Unique Elements: ");
        for (int i = 0; i < uniqueLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Single-pass filter for sorted elements
    public static int removeDuplicatesInPlace(int[] arr) {
        int n = arr.length;
        if (n < 2) return n;

        int uniqueIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i]; // Overwrite duplicates by shifting unique values forward
            }
        }
        return uniqueIndex + 1; // Returns new effective size
    }

    // MergeSort Logic: Guarantees O(N log N) time complexity
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Raw array allocations representing the O(N) auxiliary space footprint
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

## Breaking Down the Performance

   1. Time Strategy: Dividing the array takes $O(\log N)$ steps, and merging elements takes $O(N)$ work per level. This ensures that no matter how scrambled, reversed, or full of duplicates the input data is, the code completes execution in $O(N \log N)$ operations.
   2. Space Strategy: Because we manually create the temporary left L and right R working arrays inside the merge phase, our auxiliary memory scale is tied strictly to the size of the array ($O(N)$).

If you want to try pushing this further, let me know:

* Are the numbers bounded within a small, specific range (like values always between 0 and 1000)?
* If they are, we can use a custom counting bucket array to drop the worst-case time complexity down to a blazing-fast $O(N)$ linear time. Would you like to see that approach?



You are 100% correct. In a real-world software engineering or production environment, using a HashSet is absolutely the best way to handle this.
Using a HashSet reduces the overall complexity to:

* Average-Case Time Complexity: O(N) (because lookups and inserts into a hash table take O(1) constant time on average).
* Space Complexity: O(N) (to store the unique elements in the set).

The reason we didn't use it initially is that HashSet is a built-in collection framework class in Java (java.util.HashSet). Since your very first prompt asked to solve this "using raw logic / no built-in", we had to completely ban HashSet, ArrayList, and Arrays.sort(), forcing us to build sorting and filtering systems completely by hand.
## How to do it using HashSet (The Practical Approach)
If you are allowed to use built-in tools, here is the clean, efficient code you would actually write in a real project:

import java.util.HashSet;
public class PracticalDuplicateRemover {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 1, 5, 2, 3, 1};

        int[] result = removeDuplicatesWithSet(arr);

        System.out.print("Unique Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicatesWithSet(int[] arr) {
        // 1. Insert elements into HashSet to instantly filter duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // 2. Convert the set back to a primitive array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}

## The Catch with HashSet (Worst-Case Complexity)
While HashSet is highly optimized, it does have a hidden mathematical catch regarding its worst-case performance:

* Worst-Case Time Complexity: O(N²).
* Why? If many elements happen to produce the exact same hash code value (known as a hash collision), the HashSet inside Java has to fall back to chaining those elements in linked lists or trees. Searching and inserting then slows down drastically.

The custom MergeSort approach built in the previous step guarantees a hard ceiling of $O(N \log N)$ in every single possible scenario, whereas HashSet relies on a good hash distribution to maintain its O(N) speed.
Would you like to see how we can build a custom Hash Table from scratch using raw arrays to achieve that O(N) average speed without importing Java's built-in HashSet? Or would you prefer to explore how a LinkedHashSet can be used to preserve the exact original order of the elements?


*/