package horizoncolumbus.org;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr = {3, 2};

        int x = arr[0];
        int y = arr[1];

        int temp = x;
        x = y;
        y = temp;


        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
