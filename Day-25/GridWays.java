
class GridWays {

    public static int Gridways(int i, int n, int j, int m) {
        // base  case.
        if (i == n - 1 && j == m - 1) // condition of last cells.
        {
            return 1;
        } else if (i == n || j == n)// boundary condition.
         {
            return 0;
        }
        // Right ways.
        // int rightways = Gridways(i + 1, n, j, m);
        // int downways = Gridways(i, n, j + 1, m);
        // int toalways = (rightways + downways);
        // return toalways;
        return Gridways(i + 1, n, j, m)+Gridways(i, n, j + 1, m);
    }

    public static void main(String args[]) {
        int n = 9, m =9;

        System.out.println(Gridways(0, n, 0, m));
    }
}
