public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[10];

        num[0] = 23;
        num[1] = 24;
        num[2] = 16;
        num[3] = 8;
        num[4] = 7;
        num[5] = 31;
        num[6] = 100;
        num[7] = 89;
        num[8] = 66;
        num[9] = 42;

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println((num[i]));
        }
    }
}
