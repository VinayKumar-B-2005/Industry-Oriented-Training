package day_7;

public class p18 {

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {

                if (arr[j] < pivot) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int p = i + 1;

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        quickSort(arr, 0, arr.length - 1);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}