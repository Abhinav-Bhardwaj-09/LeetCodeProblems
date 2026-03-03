package RestoreFinishingOrder;

import java.util.ArrayList;
import java.util.List;

// Created by Abhinav Bhardwaj on 03/03/2026 15:10 using IntelliJ IDEA

public class Solution {
  public int[] recoverOrder(int[] order, int[] friends) {
    List<Integer> friendsList = new ArrayList<>(friends.length);
    for (int friendsId : friends) {
      friendsList.add(friendsId);
    }

    List<Integer> result = new ArrayList<>(friends.length);

    for (int element : order) {
      if (friendsList.contains(element)) {
        result.add(element);
      }
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
