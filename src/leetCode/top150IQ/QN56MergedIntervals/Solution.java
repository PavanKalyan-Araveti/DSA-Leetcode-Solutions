package leetCode.top150IQ.QN56MergedIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);
        for(int[] next: intervals){
            if(next[0] <= current[1]){
                current[1] = Math.max(current[1], next[1]);
            }
            else{
                current = next;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] input = {{1,1},{2,2},{0,0},{2,3},{1,3},{3,5},{2,3},{3,5}};
        int[][] output = merge(input);
        for(int[] row: output){
            for(int col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
