package FindWordsContainingCharacter;

import java.util.ArrayList;
import java.util.List;

// Created by Abhinav Bhardwaj on 28/02/2026 22:43 using IntelliJ IDEA

public class Solution {
  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> result = new ArrayList<>();
    int index = 0;

    for (String element : words) {
      if (element.contains(String.valueOf(x))) {
        result.add(index);
      }

      index++;
    }

    return result;
  }
}
