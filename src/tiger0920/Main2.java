package tiger0920;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/20 17:12
 */
public class Main2 {
    public static class Project {
        public int cost;
        public int profile;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;
        Project[] projects = new Project[N];

        for (int i = 0; i < N; i++) {
            projects[i] = new Project();
            projects[i].cost = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            projects[i].profile = sc.nextInt();
        }

        Arrays.sort(projects, new Comparator<Project>() {
            @Override
            public int compare(Project o1, Project o2) {
                return o2.profile - o1.profile;
            }
        });

        for (int i = 0; i < projects.length; i++) {
            if (W > projects[i].cost && K > 0) {
                result += projects[i].profile;
                W -= projects[i].cost;
                K--;
            }
        }

        System.out.println(result);
    }
}
