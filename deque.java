import java.util.ArrayDeque;
import java.util.Scanner;

public class deque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> cube = new ArrayDeque<>();
        System.out.println("Введите 4 целых числа:");
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int z = scan.nextInt();
        cube.addFirst(i);
        cube.add(j);
        cube.add(k);
        cube.addLast(z);
        System.out.println(cube);
        int sum = i+j+k+z;
        cube.clear();
        cube.addFirst(i);
        cube.add(sum);
        cube.add(j);
        cube.add(sum);
        cube.add(k);
        cube.add(sum);
        cube.add(z);
        cube.addLast(sum);
        System.out.println(cube);
    }
}
