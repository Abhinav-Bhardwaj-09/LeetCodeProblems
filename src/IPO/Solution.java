package IPO;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 23/02/23
 * Time: 12:04
 */


public class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        if (capital == null || capital.length == 0 || profits == null || profits.length == 0 || profits.length != capital.length) {
            return w;
        }

        int profitLength = profits.length, pc [][] = new int[profitLength][2];

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(k, (a, b) -> b[0] - a[0]);

        for (int index = 0; index < profitLength; index++){
            pc[index][0] = profits[index];
            pc[index][1] = capital[index];
        }

        Arrays.sort(pc, (a, b) -> a[1] - b[1]);
        int index = 0;

        while (k-- > 0){
            for (; index < profitLength && pc[index][1] <= w; index++) {
                priorityQueue.offer(pc[index]);
            }

            if (priorityQueue.isEmpty()) {
                break;
            }

            int project[] = priorityQueue.poll();
            w += project[0];

        }

        return w;
    }
}
