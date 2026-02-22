package ConvertDateToBinary;

// Created by Abhinav Bhardwaj on 22/02/2026 21:02 using IntelliJ IDEA

public class Solution {
  public String convertDateToBinary(String date) {
    StringBuilder binaryDate = new StringBuilder();
    String[] dateParts = date.split("-");

    for (String part : dateParts) {
      binaryDate.append(Integer.toBinaryString(Integer.parseInt(part))).append("-");
    }

    return binaryDate.toString().substring(0, binaryDate.length() - 1);
  }
}
