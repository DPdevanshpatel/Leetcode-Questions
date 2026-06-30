class Solution {

    private long calc(long peak, long cnt) {
        if (peak > cnt) {
            return (peak - 1 + peak - cnt) * cnt / 2;
        } else {
            return (peak - 1) * peak / 2 + (cnt - (peak - 1));
        }
    }

    public int maxValue(int n, int index, int maxSum) {
        long left = 1, right = maxSum;

        while (left < right) {
            long mid = left + (right - left + 1) / 2;

            long sum = mid;
            sum += calc(mid, index);
            sum += calc(mid, n - index - 1);

            if (sum <= maxSum) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return (int)left;
    }
}