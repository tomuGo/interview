package sword;

// 面试题3（一）：找出数组中重复的数字
// 题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
// 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。例如，如果输入长度为7的数组{2, 3, 1, 0, 2, 5, 3}，
// 那么对应的输出是重复的数字2或者3。
public class Duplicate {

    private static int  duplicateInts(int []ints){
        if(ints ==null||ints.length<2){
            return -1;
        }
        for(int i=0;i<ints.length;i++){
            while (i!=ints[i]){
                if(ints[i]==ints[ints[i]]){
                    return ints[i];
                }else {
                    int temp = ints[ints[i]];
                    ints[ints[i]] = ints[i];
                    ints[i] = temp;

                    /*int q=ints[i];
                    ints[i]=ints[ints[i]];
                    ints[ints[i]]=q;*/
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[]q={1,3,4,3,2};
        int w=duplicateInts(q);
        System.out.println(w);
    }
}
