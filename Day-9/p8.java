package day_9;

class p8 {

    int[] tree;
    int[] arr;

    p8(int[] arr) {

        this.arr = arr;

        tree = new int[4 * arr.length];

        build(0, 0, arr.length - 1);
    }

    void build(int node, int start, int end) {

        if (start == end) {

            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        build(2 * node + 1, start, mid);

        build(2 * node + 2, mid + 1, end);

        tree[node] =
                tree[2 * node + 1] +
                tree[2 * node + 2];
    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 3};

        p8 st = new p8(arr);

        System.out.println("Total Sum: " + st.tree[0]);
    }
}