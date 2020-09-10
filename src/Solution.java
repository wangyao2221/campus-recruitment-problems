import java.io.File;

public class Solution {
    public static void main(String[] args) {
        int[] A = {4, -1, -1, -1, -1, -1};
        int[] B = {1, 2, 3, 5, 6};
        merge(A, 1, B, 5);
        System.out.println();
    }

    public static void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] >= B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }

        File file = new File("test");

        while (i >= 0) {
            A[k--] = A[i--];
        }

        while (j >= 0) {
            A[k--] = B[j--];
        }
    }
}