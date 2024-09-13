public class Multiples {
    public static void main(String[] args) {
        int multiples = 0;
        for (int i = 1; i < 1000; i++) {
            boolean multipleof3 = i % 3 == 0;
            boolean multipleof5 = i % 5 == 0;

            if (multipleof3 || multipleof5) {
                multiples++;
            }
        }
        System.out.println(multiples);

    }
}
