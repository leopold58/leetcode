public class hanmingnjuli461simple {
    /**
     * 461汉明距离
     * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
     * 给出两个整数 x 和 y，计算它们之间的汉明距离。
     * 注意：
     * 0 ≤ x, y < 231.
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int res=x^y;
        int num=0;
        while(res!=0){
            if(res%2==1)
                num+=1;
            res = res >> 1;
        }
        return num;
    }
}
