public class Reduce {

    public static void main(String[] args) {
        int n = 100;
        int step_cnt = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            step_cnt++;
        }
        System.out.println("steps number is : " + step_cnt);
    }
}
