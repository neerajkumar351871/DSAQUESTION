
import java.util.*;

class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            long value = 1;

            for (int j = 0; j <= i; j++) {
                row.add((int) value);

                // Calculate the next binomial coefficient:
                // C(i, j + 1) = C(i, j) * (i - j) / (j + 1)
                value = value * (i - j) / (j + 1);
            }

            mainList.add(row);
        }

        return mainList;
    }

    public static void main(String args[]) {
        PascalTriangle obj = new PascalTriangle();
        int n = 6;
        System.out.println(obj.generate(n));

    }
}
