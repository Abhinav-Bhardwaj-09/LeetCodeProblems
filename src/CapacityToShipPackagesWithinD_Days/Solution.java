package CapacityToShipPackagesWithinD_Days;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 22/02/23
 * Time: 20:27
 */


public class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        int mid, minimumCapacity = right;

        while (left <= right) {
            mid = (left + right) / 2;

            if (check(weights, days, mid)) {
                minimumCapacity = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return minimumCapacity;
    }

    public boolean check(int [] weights, int days, int capacity){
        int requiredDays = 1;
        int currWeight = 0;

        for (int weight : weights) {
            if ((currWeight + weight) > capacity) {
                requiredDays++;
                currWeight = 0;
            }

            currWeight += weight;
        }

        return requiredDays > days ? false : true;
    }
}
