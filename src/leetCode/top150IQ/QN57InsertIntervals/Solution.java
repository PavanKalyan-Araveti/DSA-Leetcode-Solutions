package leetCode.top150IQ.QN57InsertIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int left = 0, n = intervals.length, right = n - 1, pos = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(intervals[mid][0] >= newInterval[0]){
                pos = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        for(int i = 0; i < pos; i++) result.add(intervals[i]);

        if(!result.isEmpty() && result.get(result.size() - 1)[1] >= newInterval[0]){
            newInterval[0] = Math.min(result.get(result.size() - 1)[0], newInterval[0]);
            newInterval[1] = Math.max(result.get(result.size() - 1)[1], newInterval[1]);
            result.remove(result.size() - 1);
        }
        result.add(newInterval);

        for(int i = pos; i < n; i++){
            int[] current = intervals[i];
            int[] last = result.get(result.size() - 1);
            if(current[0] <= last[1]){
                last[1] = Math.max(current[1], last[1]);
            }
            else{
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] output = insert(intervals, newInterval);
        for(int[] row: output){
            System.out.println(Arrays.toString(row));
        }
    }
}


/*
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
 */