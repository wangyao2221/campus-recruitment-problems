package history.huawei0826;

import java.util.Arrays;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
//        String xStr = "[1, 1, 1, 1, 2, 1, 1],[5, 2, 5, 4, 5, 1, 6]";
        int[] x = {1, 1, 1, 1, 2, 1, 1};
        int[] y = {5, 2, 5, 4, 5, 1, 6};
        System.out.println(largestRectangleArea(x, y));
    }

    public static int fun(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            if (!(x[i] >= 1 && x[i] <= 100)) return 0;
        }

        int widthSum = 0;
        for (int i = 0; i < x.length; i++) {
            widthSum += x[i];
        }

        int[] newY = new int[widthSum];
        int j = 0;
        for (int i = 0; i < y.length; i++) {
            int tmp = x[i];
            while (tmp-- > 0) {
                newY[j++] = y[i];
            }
        }

        return largestRectangleArea_(newY);
    }

    public static int largestRectangleArea__(int[] widths, int[] heights) {
        for (int i = 0; i < widths.length; i++) {
            if (!(widths[i] >= 1 && widths[i] <= 100)) return 0;
        }

        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] sumWidth = new int[n];

        for (int i = 0; i < widths[i]; i++) {
            sumWidth[i] = widths[i];
        }
        Arrays.fill(right, n);

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                right[stack.peek()] = i;
                sumWidth[i] += widths[stack.peek()];
                int pop = stack.pop();
                if (!stack.isEmpty()) {
                    sumWidth[stack.peek()] += widths[pop];
                }
            }
            left[i] += (stack.isEmpty() ? -1 : heights[stack.peek()]);
//            if (!stack.isEmpty()){
//                sumWidth[stack.peek()] += widths[i];
//            }
            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, sumWidth[i] * heights[i]);
        }
        return ans;
    }

    public static int largestRectangleArea_(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                right[stack.peek()] = i;
                stack.pop();
            }
            left[i] = (stack.isEmpty() ? -1 : stack.peek());
            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }

    public static int largestRectangleArea(int[] width, int[] height) {
        if (height == null || height.length == 0)
            return 0;
        //存放每一个height[i]的矩形面积
        int[] area = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            int curHeight = height[i];
            area[i] = height[i] * width[i];
            //向右边加
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] < curHeight)
                    break;
                else
                    area[i] += curHeight * width[j];
            }
            //向左边加
            for (int k = i - 1; k >= 0; k--) {
                if (height[k] < curHeight)
                    break;
                else
                    area[i] += curHeight * width[k];
            }
        }
        //找出area[i]中最大的值
        int max = 0;
        for (int i = 0; i < area.length; i++) {
            if (area[i] > max)
                max = area[i];
        }
        return max;
    }
}