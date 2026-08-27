package day_7;

public class p16 {

    static void mergeSort(String[] a, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);

        String[] temp = new String[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (a[i].compareTo(a[j]) <= 0) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (i = 0; i < temp.length; i++) {
            a[left + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        String[] marks = {"a", "c", "g", "b", "h", "d"};

        mergeSort(marks, 0, marks.length - 1);

        for (String mark : marks) {
            System.out.print(mark + " ");
        }
    }
}