package MergeSortedArray;

// Created by Abhinav Bhardwaj on 27/01/2026 22:50 using IntelliJ IDEA

public class Solution {

  // using three-pointers approach
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index1 = m - 1; // last valid element of nums1
    int index2 = n - 1; // last element of nums2
    int index3 = m + n - 1; // last index of nums1

    // Merge from the end
    while (index1 >= 0 && index2 >= 0) {
      if (nums1[index1] > nums2[index2]) {
        nums1[index3] = nums1[index1];
        index1--;
      } else {
        nums1[index3] = nums2[index2];
        index2--;
      }

      index3--;
    }

    // Copy remaining elements from nums2 (if any)
    while (index2 >= 0) {
      nums1[index3] = nums2[index2];
      index2--;
      index3--;
    }
  }

  // using bubble sort approach
  public void merge1(int[] nums1, int m, int[] nums2, int n) {
    for (int index = 0; index < n; index++) {
      nums1[m + index] = nums2[index];
    }

    for (int index1 = 0; index1 < (m + n) - 1; index1++) {
      for (int index2 = 0; index2 < (m + n) - 1; index2++) {
        if (nums1[index2] > nums1[index2 + 1]) {
          int temp = nums1[index2];
          nums1[index2] = nums1[index2 + 1];
          nums1[index2 + 1] = temp;
        }
      }
    }
  }
}
