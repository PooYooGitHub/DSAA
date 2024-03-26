package greedy;

/**
 * author:
 * data:2024/3/16 9:07
 * function:
 * time:
 */
public class coin_change_greedy {
    int coinChangeGreedy(int[] coins, int amt) {
        int i=coins.length-1;
        int count = 0;
        while (amt > 0) {
            while (coins[i] > amt) {
                i--;
            }
            amt-=coins[i];
            count++;
        }
        return amt==0?count:-1;
    }
}
