package xiecheng.ji;

import java.util.Scanner;

public class xiecheng01 {
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int buyCoke(int m, int a, int b, int c, int x) {
        int times = 0;
        while (m > 0){
            int tmp = x;
            while (tmp > 0){
                //100
                if (c > 0 && tmp > 0){
                    int down = tmp / 100;
                    if(down <= c){
                        tmp -= down *100;
                        times += down;
                        c -= down;
                    }
                    else {
                        tmp -= c *100;
                        times += c;
                        c = 0;
                    }
                    if(tmp > 0 && c > 0){
                        tmp -= 100;
                        c--;
                        times++;
                    }
                }
//                System.out.println(times);
                if(tmp == 0){
                    break;
                }
                if(tmp < 0){
                    tmp = -tmp;
                    b += tmp / 50;
                    tmp -= tmp / 50 * 50;
                    a += tmp / 10;
                    break;
                }
                //50
                if (b > 0 && tmp > 0){
                    int down = tmp / 50;
                    if(down <= b){
                        b -= down;
                        tmp -= down * 50;
                        times += down;
                    }
                    else {
                        tmp -= b * 50;
                        times += b;
                        b = 0;
                    }
                    if(tmp > 0 && b > 0){
                        tmp -= 50;
                        b--;
                        times++;
                    }
                }
//                System.out.println(times);
                if(tmp == 0){
                    break;
                }
                if(tmp < 0){
                    tmp = -tmp;
                    a += tmp / 10;
                    break;
                }
                //10

                int down = tmp / 10;
                a -= down;
                tmp -= down * 10;
                times += down;
            }
            m--;
        }
        return times;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _a;
        _a = Integer.parseInt(in.nextLine().trim());

        int _b;
        _b = Integer.parseInt(in.nextLine().trim());

        int _c;
        _c = Integer.parseInt(in.nextLine().trim());

        int _x;
        _x = Integer.parseInt(in.nextLine().trim());

        res = buyCoke(_m, _a, _b, _c, _x);
        System.out.println(String.valueOf(res));

    }


}
