package leetCode.top150IQ.QN452MinNoOfArrowsBurstBallon;

import java.util.Arrays;

public class Solution {
    public static int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        int arrow = 1;
        Arrays.sort(points, (a, b) ->  Integer.compare(a[1], b[1]));
        int first = points[0][1];
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > first){
                arrow++;
                first = points[i][0];
            }
        }
        return arrow;
    }

    public static void main(String[] args) {
        int[][] points = {{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}};
        System.out.println(findMinArrowShots(points));
    }
}
