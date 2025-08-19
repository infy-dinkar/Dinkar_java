import java.util.*;

public class SegmentTreeParet1 {

    public static void build(int arr1[], int l, int r, int i, int tree[]) {

        int mid = (l + r) / 2;

        if (l == r) {
            tree[i] = arr1[l];
            return;
        }
        build(arr1, l, mid, 2 * i + 1, tree);
        build(arr1, mid + 1, r, 2 * i + 2, tree);
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] tree = new int[4 * n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        build(arr, 0, n-1, 0, tree);
        System.out.println(Arrays.toString(tree));

    }
}
