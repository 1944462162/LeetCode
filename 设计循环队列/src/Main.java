/**
 * Author: wangJianBo
 * Date: 2019/10/31 11:12
 * Content:
 */

class MyCircularQueue {
    private int front;
    private int rear;
    private int maxsize;
    private int[] arr;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        front = -1;
        rear = -1;
        maxsize = k;
        arr = new int[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear + 1) % maxsize;
        arr[rear] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(front == rear){
            front = -1;
            rear = -1;
            return true;
        }
        front = (front + 1) % maxsize;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return arr[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return arr[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((rear + 1) % maxsize) == front;
    }
}
public class Main {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println( myCircularQueue.enQueue(1));
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.enQueue(5));
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.Front());
    }
}
