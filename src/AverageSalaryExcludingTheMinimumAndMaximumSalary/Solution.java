package AverageSalaryExcludingTheMinimumAndMaximumSalary;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 24/01/23
 * Time: 15:10
 */


public class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);

        double sum = 0, len = salary.length;
        for (int index = 1; index < len - 1; index++) {
            sum += salary[index];
        }

        return sum / (len - 2);
    }
}
