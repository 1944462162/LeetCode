import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/10/10 9:50
 * Content:
 */
class MedianFinder {

    int[] nums;
    int top = 0;
    /** initialize your data structure here. */
    public MedianFinder() {
        nums = new int[1000000];
    }

    public void addNum(int num) {
        top++;
        nums[top] = num;
//        for (int i = 1; i < top+1; i++) {
//            System.out.print(nums[i] + " ");
//        }
    }

    public double findMedian() {
        int a;
        double res;
        Arrays.sort(nums,1,top+1);
        if(top % 2 == 0){
            a = top/2;
            res = (nums[a] + nums[a + 1])/2.0;
        }
        else{
            a = top/2+1;
            res = nums[a];
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
         MedianFinder obj = new MedianFinder();
//[[],[6],[],[10],[],[2],[],[6],[],[5],[],[0],[],[6],[],[3],[],[1],[],[0],[],[0],[]]
        obj.addNum(6);
        double param_4 = obj.findMedian();
        System.out.println(param_4);
        obj.addNum(10);
        System.out.println(obj.findMedian());
        obj.addNum(2);
        System.out.println(obj.findMedian());
        obj.addNum(6);
        System.out.println(obj.findMedian());
        obj.addNum(5);
        System.out.println(obj.findMedian());

        obj.addNum(0);
        System.out.println(obj.findMedian());
        obj.addNum(6);
        System.out.println(obj.findMedian());
        obj.addNum(3);
        System.out.println(obj.findMedian());
        obj.addNum(1);
        System.out.println(obj.findMedian());
        obj.addNum(0);
        System.out.println(obj.findMedian());
        obj.addNum(0);
        System.out.println(obj.findMedian());
    }
}
