import java.util.*;

public class mergeintervals822 {
    public static int[][] merge(int[][] intervals) {
       // Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans  =  new ArrayList<>();
        // intial range
        int start  =  intervals[0][0];
        int end =  intervals[0][1];

        int  i =1;
        while(i<intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];
            // next interval start is smaller than prev end and array is sorted
            // so these two internal can merge
            if( s<=end  ) {
                // so merge both intervals
                end =  Math.max(end,e);
            }
            else{ // if merge not possible , then insert prev interval into list
                ans.add(new int[]{start,end});
                start = s;
                end =  e;
            }
            i++;
        }

        ans.add(new int[] {start,end});

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

        int[][] array = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(array);


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}