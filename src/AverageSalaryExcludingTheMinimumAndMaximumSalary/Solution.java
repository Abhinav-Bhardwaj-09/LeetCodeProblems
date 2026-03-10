package AverageSalaryExcludingTheMinimumAndMaximumSalary;

import java.util.Arrays;

// Created by Abhinav Bhardwaj on 24/01/23 15:10 using IntelliJ IDEA

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
