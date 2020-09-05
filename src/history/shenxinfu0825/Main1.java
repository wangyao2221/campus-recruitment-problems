package history.shenxinfu0825;

public class Main1 {
    static int max = -1;
    static int maxIndex = -1;
    static int secondMax = -1;
    static int secondMaxIndex = -1;

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        int rz = find(arr);
        System.out.println(rz);
    }

    private static int find(int[] arr) {
        int rz = 0;
        while (true){
            int maxLoc = getMax(arr);
            int minLoc = getMin(arr);
            int add = arr[maxLoc] - arr[minLoc];
//            System.out.println(add);
            if (add == 0){
                return rz;
            }
            for (int i = 0; i < arr.length; i++) {
                if(i != maxLoc){
                    arr[i]+=add;
                }
            }
            rz+=add;
//            System.out.println(Arrays.toString(arr));
        }
    }
    private static int getMax(int[] arr){
        int maxLoc = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
                maxLoc = i;
            }
        }
        return maxLoc;
    }

    private static int getMin(int[] arr){
        int minLoc = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min >= arr[i]){
                min = arr[i];
                minLoc = i;
            }
        }
        return minLoc;
    }
}