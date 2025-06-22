class pat5 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                // First and last row: print 1s
                for (int j = 1; j <= n; j++) {
                    System.out.print("1 ");
                }
            } else {
                // Middle rows: print left number, spaces, right 5
                System.out.print(i + " ");
                for (int s = 1; s <= (n - 2); s++) {
                    System.out.print("  ");
                }
                System.out.print("5");
            }
            System.out.println();
        }
    }
}
