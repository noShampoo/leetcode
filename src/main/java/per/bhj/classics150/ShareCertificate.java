package per.bhj.classics150;

/**
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150">买卖股票的最佳时机</a>
 *
 * @author noShampoo
 * @date 2024/3/12
 */
public class ShareCertificate {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(new ShareCertificate().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int maxValue = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minPrice = Math.min(price, minPrice);
            maxValue = Math.max(price - minPrice, maxValue);
        }

        return maxValue;
    }

}
