class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;

        // First row
        ArrayList<Integer> firstRow = new ArrayList<>(Arrays.asList(1));
        triangle.add(firstRow);

        if (numRows == 1) return triangle;

        // Second row
        ArrayList<Integer> secondRow = new ArrayList<>(Arrays.asList(1, 1));
        triangle.add(secondRow);

        for (int i = 0; i < (numRows - 2); i++) {
            ArrayList<Integer> previousRow = new ArrayList<>(triangle.get(triangle.size() - 1));

            ArrayList<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int j = 0; j < (previousRow.size() - 1); j++) {
                newRow.add(previousRow.get(j) + previousRow.get(j + 1));
            }

            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle;
    }
}

