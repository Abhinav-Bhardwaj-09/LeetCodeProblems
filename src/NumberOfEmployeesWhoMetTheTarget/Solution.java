package NumberOfEmployeesWhoMetTheTarget;

// Created by Abhinav Bhardwaj on 07/03/2026 01:12 using IntelliJ IDEA

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
  public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    AtomicInteger count = new AtomicInteger();

    Arrays.stream(hours)
        .forEach(
            time -> {
              if (time >= target) {
                count.getAndIncrement();
              }
            });

    return count.get();
  }
}
