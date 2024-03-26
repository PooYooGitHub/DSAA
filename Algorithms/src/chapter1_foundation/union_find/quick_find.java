package chapter1_foundation.union_find;/**
 * author:
 * data:2024/3/25 19:16
 * function:
 * time:
 */



/**
 * @projectName: DSAA
 * @package: chapter1_foundation.union_find
 * @className: quick_find
 * @author: Eric
 * @description: union-find算法实现
 * @date: 2024/3/25 19:16
 * @version: 1.0
 */
public class quick_find {
    //动态连通性问题
    private int id[];//触点
    private int count;//散列分量


    public quick_find(int count) {
        this.count = count;
        id = new int[count];
        //初始化触点
        for (int i = 0; i < count; i++) {
            id[i] = i;
        }
    }
    public int getCount() {
        return count;
    }

    public boolean connected(int a, int b) {//在同一个分量中则返回true
        return find(a) == find(b);
    }

    private int find(int a) {
        return id[a];
    }

    public void union(int a, int b) {//将a，b连通(a,b是下标)
        int aID = find(a);
        int bID = find(b);
        if (find(a) == find(b)) {
            return;
        }
        for (int i = 0; i < count; i++) {
            if (find(i)==bID) {
                id[i] = aID;
                count--;
            }
        }
    }
}
