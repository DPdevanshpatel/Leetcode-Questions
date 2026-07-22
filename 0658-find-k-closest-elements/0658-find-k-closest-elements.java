import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int diff1 = Math.abs(a-x);
                int diff2 = Math.abs(b-x);

                if (diff1 != diff2)
                    return diff2-diff1;

                return b-a;
            }
        );

        for (int num:arr) {
            pq.offer(num);

            if (pq.size()>k)
                pq.poll();
        }

        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty())
            ans.add(pq.poll());

        Collections.sort(ans);

        return ans;
    }
}