import java.util.PriorityQueue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args){
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 4 целых числа:");
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int z = scan.nextInt();

        myPriorityQueue.add(i);
        myPriorityQueue.add(j);
        myPriorityQueue.add(k);
        myPriorityQueue.add(z);
        System.out.println("Очередь:" +myPriorityQueue);
        System.out.println("Введите числo:");
        int x = scan.nextInt();
        myPriorityQueue.remove(a);
        myPriorityQueue.remove(b);
        myPriorityQueue.remove(c);
        myPriorityQueue.remove(d);

        myPriorityQueue.add(a+e);
        myPriorityQueue.add(b+e);
        myPriorityQueue.add(c+e);
        myPriorityQueue.add(+e);
        System.out.println("Очередь:" +myPriorityQueue);
        }
}