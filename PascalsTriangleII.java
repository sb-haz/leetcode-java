/*
 * https://leetcode.com/problems/pascals-triangle-ii/
 */

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();

        // First row
        ArrayList<Integer> firstRow = new ArrayList<>(Arrays.asList(1));
        triangle.add(firstRow);

        // Second row
        ArrayList<Integer> secondRow = new ArrayList<>(Arrays.asList(1, 1));
        triangle.add(secondRow);

        for (int i = 0; i <= (rowIndex - 2); i++) {
            ArrayList<Integer> previousRow = new ArrayList<>(triangle.get(triangle.size() - 1));

            ArrayList<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int j = 0; j < (previousRow.size() - 1); j++) {
                newRow.add(previousRow.get(j) + previousRow.get(j + 1));
            }

            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle.get(rowIndex);
    }
}