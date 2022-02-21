import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {

        List<Integer[]> solution = new ArrayList<>();
        for (int first = 0; first < array.length; first++) {
            for (int second = first + 1; second < array.length; second++) {
                for (int third = second + 1; third < array.length; third++) {
                    for (int fourth = third + 1; fourth < array.length; fourth++) {
                        if (array[first] + array[second] + array[third] + array[fourth] == targetSum) {
                            solution.add(new Integer[]{array[first], array[second], array[third], array[fourth]});
                        }
                    }
                }
            }
        }

        return solution;
    }

    public static void main(String[] args) {
        List<int[]> datasets = new ArrayList<int[]>() {{
            add(new int[]{7, 6, 4, -1, 1, 2});
            add(new int[]{1, 2, 3, 4, 5, 6, 7});
            add(new int[]{5, -5, -2, 2, 3, -3});
            add(new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            add(new int[]{-1, 22, 18, 4, 7, 11, 2, -5, -3});
            add(new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5});
            add(new int[]{1, 2, 3, 4, 5});
            add(new int[]{1, 2, 3, 4, 5, -5, 6, -6});
        }};
        int[] desiredSums = new int[]{
                16,
                10,
                0,
                4,
                30,
                20,
                100,
                5
        };
        List<List<Integer[]>> solutions = new ArrayList<List<Integer[]>>() {{
            add(Arrays.asList(
                    new Integer[]{7, 6, 4, -1},
                    new Integer[]{7, 6, 1, 2}
            ));
            add(Collections.singletonList(
                    new Integer[]{1, 2, 3, 4}
            ));
            add(Arrays.asList(
                    new Integer[]{5, -5, -2, 2},
                    new Integer[]{5, -5, 3, -3},
                    new Integer[]{-2, 2, 3, -3}
            ));
            add(Arrays.asList(
                    new Integer[]{-2, -1, 1, 6},
                    new Integer[]{-2, 1, 2, 3},
                    new Integer[]{-2, -1, 2, 5},
                    new Integer[]{-2, -1, 3, 4}
            ));
            add(Arrays.asList(
                    new Integer[]{-1, 22, 7, 2},
                    new Integer[]{22, 4, 7, -3},
                    new Integer[]{-1, 18, 11, 2},
                    new Integer[]{18, 4, 11, -3},
                    new Integer[]{22, 11, 2, -5}
            ));
            add(Arrays.asList(
                    new Integer[]{-5, 2, 15, 8},
                    new Integer[]{-3, 2, -7, 28},
                    new Integer[]{-10, -3, 28, 5},
                    new Integer[]{-10, 28, -6, 8},
                    new Integer[]{-7, 28, -6, 5},
                    new Integer[]{-5, 2, 12, 11},
                    new Integer[]{-5, 12, 8, 5}
            ));
            add(Collections.emptyList());
            add(Arrays.asList(
                    new Integer[]{2, 3, 5, -5},
                    new Integer[]{1, 4, 5, -5},
                    new Integer[]{2, 4, 5, -6},
                    new Integer[]{1, 3, -5, 6},
                    new Integer[]{2, 3, 6, -6},
                    new Integer[]{1, 4, 6, -6}
            ));
        }};

        for (int testCaseIndex = 0; testCaseIndex < datasets.size(); testCaseIndex++) {
            List<Integer[]> result = fourNumberSum(datasets.get(testCaseIndex), desiredSums[testCaseIndex]);

            if(areEquals(sort(solutions.get(testCaseIndex)), sort(result))){
                System.out.printf("%n%nTest: %s success %n", testCaseIndex + 1);
            }else {
                System.out.printf("Test: %s fail %n", testCaseIndex + 1);
            }
            printResult("Expected", solutions.get(testCaseIndex));
            printResult("Returned", result);

        }
    }

    private static boolean areEquals(List<String> expected, List<String> result) {
        int totalCheck = 0,
                totalSolution = expected.size();
        if (totalSolution != result.size()) {
            return false;
        }

        for (int i = 0; i < totalSolution; i++) {
            if(expected.get(i).equals(result.get(i))){
                totalCheck++;
            }
        }

        return totalCheck == totalSolution;
    }

    public static void printResult(String title, List<Integer[]> result) {
        System.out.println("=====================");
        System.out.println("Printing " + title);
        System.out.println("=====================");
        System.out.printf("Solution Amount: %s%n", result.size() + 1);
        System.out.println("=====================");

        for (int solutionIndex = 0; solutionIndex < result.size(); solutionIndex++) {
            StringBuilder sumElements = new StringBuilder();
            for (int i = 0; i < result.get(solutionIndex).length; i++) {
                sumElements.append(String.format("%s", result.get(solutionIndex)[i]));
                if (result.get(solutionIndex).length - 1 != i) {
                    sumElements.append(", ");
                }
            }
            System.out.printf("Solution %s: %s %n", solutionIndex, sumElements);
        }
    }

    public static List<String> sort(List<Integer[]> solution) {
        return solution.stream()
                .map(Arrays::toString)
                .sorted()
                .collect(Collectors.toList());
    }

}