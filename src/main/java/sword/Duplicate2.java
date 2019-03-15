package sword;

// 面试题3（二）：不修改数组找出重复的数字
// 题目：在一个长度为n+1的数组里的所有数字都在1到n的范围内，所以数组中至
// 少有一个数字是重复的。请找出数组中任意一个重复的数字，但不能修改输入的
// 数组。例如，如果输入长度为8的数组{2, 3, 5, 4, 3, 2, 6, 7}，那么对应的
// 输出是重复的数字2或者3。
public class Duplicate2 {
    //二分法

    public static int getDuplicate2(int[] ints) {
        if (ints == null || ints.length < 2) {
            return -1;
        }
        int start = 1;
        int end = ints.length-1;
        while (start <= end) {
            int middle = ((end - start) >> 1) + start;
            System.out.println("niddel:"+middle);
            System.out.println("start:"+start);
            System.out.println("end:"+end);

            int count = count(ints, start, middle);
            System.out.println(count);
            System.out.println();
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            int pre = middle - start +1;
            if (count > pre) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;

    }

    public static int count(int[] ints, int start, int end) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] >= start && ints[i] <= end) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] qwe = {2, 3, 4, 5, 2,3};
        int q = getDuplicate2(qwe);
        System.out.println(q);
    }
}
