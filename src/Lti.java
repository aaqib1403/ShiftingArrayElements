public class Lti {
    public static void main(String[] args) {
        int a[] = new int[]{2, 1, 3, 5, 7, 4};
        int n = 3;
        for (int i = 1; i <= n; i++) {
            int index, lastElement;
            lastElement = a[a.length - 1];
            for (index = a.length - 1; index > 0; index--) {
                a[index] = a[index - 1];
            }
            a[0] = lastElement;
        }
        for (int i : a) {
            System.out.println(i);
        }


    }
}
