public class SumEven {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // 偶数の場合のみsumに加算する
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("合計は" + sum);
    }
}