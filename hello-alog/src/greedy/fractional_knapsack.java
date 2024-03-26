package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToDoubleFunction;

/**
 * author:
 * data:2024/3/16 11:45
 * function:
 * time:
 */
public class fractional_knapsack {
    class Item{
        int w;//商品的重量
        int v;//价值

        public Item(int w, int v) {
            this.w = w;
            this.v = v;
        }
    }

    double fractionalKnapsack(int[] wgt, int[] val, int cap) {//重量,价值，需要的重量
        Item[] items = new Item[wgt.length];//数组中装的都是对象
        for (int i = 0; i < wgt.length; i++) {
            items[i]=new Item(wgt[i],val[i]);
        }//初始化
        Arrays.sort(items, Comparator.comparingDouble(item -> -(double) item.v/item.w));//其中负号是为了降序排列
        double res = 0;
        for (Item item:items) {
            if (item.w <= cap) {
                cap-=item.w;
                res+=item.v;
            }else {
                res+=(double) cap/item.w * item.v;
                break;
            }
        }

        return res;

    }
}
