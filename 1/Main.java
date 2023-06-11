public class Main {
    public static void main(String[] args) {
        // 1-1
        System.out.println("Hello World");
        // 1-2
        int x = 11;
        System.out.println("x=" + x) ;
        // 1-3
        int x = 13;
        int y = 17;
        System.out.println("x=" + x + ",y=" + y);
        // 1-4
        int x = 13 + 17;
        System.out.println(x);
        // 1-5
        System.out.println(13 * 17);
        // 1-6
        int x = 7;
        x *= 3;
        System.out.println(x);
        x /= 2;
        System.out.println(x);
        // 1-7
        int x = 3;
        int y = 7;
        int z = x;
        x = y;
        y = z;
        System.out.println( "x=" + x + ",y=" + y );
        // 1-8
        int x = 19;
        int y = 23;
        int z = x * y;
        System.out.println(z);
        // 1-9
        int x = 2;
        for (int i = 2; i < 6; i ++) {
            System.out.println(x * i);
        }
        // 1-10
        int x = 3;
        System.out.println(x + "\n" + x * x + "\n" + x * x * x);
        // 1-11
        int x = 4;
        System.out.println(x / 3)
        // 1-12
        int x = 3;
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
    }
}