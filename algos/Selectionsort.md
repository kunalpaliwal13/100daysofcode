# Selection sort 
![image](https://github.com/kunalpaliwal13/leetcode/assets/143526414/573704ff-b9ac-4984-902a-3c39fe0dd03b)

We move one greatest or smallest element to the leftmost or the rightmost place. Then, every element follows.

```
public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
```
