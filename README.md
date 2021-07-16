# Java-Challenge
Java Challenge

  Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. The function should find all quadruplets in
  the array that sum up to the target sum and return a two-dimensional array of
  all these quadruplets in no particular order.
  
  If no four numbers sum up to the target sum, the function should return an
  empty array.
  
### Sample Input
```
  array: [7 , 6,  4, -1, 1 ,2]
  targetSum = 16
```
  
### Sample Output

```
  [[7, 6, 4, -1], [7, 6, 1, 2]]  // the quadruplets could be ordered differently
```


### Main Class

```
import java.util.*;

class Program {
  public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
    // Write your code here.
    return new ArrayList<Integer[]>();
  }
}
```


#### Test Case 1
```
{
  "array": [7, 6, 4, -1, 1, 2],
  "targetSum": 16
}
```
##### Output
```
[
  [7, 6, 4, -1],
  [7, 6, 1, 2]
]
```
#### Test Case 2
```
{
  "array": [1, 2, 3, 4, 5, 6, 7],
  "targetSum": 10
}
```
##### Output
```
[
  [1, 2, 3, 4]
]
```
#### Test Case 3
```
{
  "array": [5, -5, -2, 2, 3, -3],
  "targetSum": 0
}
```
##### Output
```
[
  [5, -5, -2, 2],
  [5, -5, 3, -3],
  [-2, 2, 3, -3]
]
```
#### Test Case 4
```
{
  "array": [-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9],
  "targetSum": 4
}
```
##### Output
```
[
  [-2, -1, 1, 6],
  [-2, 1, 2, 3],
  [-2, -1, 2, 5],
  [-2, -1, 3, 4]
]
```
#### Test Case 5
```
{
  "array": [-1, 22, 18, 4, 7, 11, 2, -5, -3],
  "targetSum": 30
}
```
##### Output
```
[
  [-1, 22, 7, 2],
  [22, 4, 7, -3],
  [-1, 18, 11, 2],
  [18, 4, 11, -3],
  [22, 11, 2, -5]
]
```
#### Test Case 6
```
{
  "array": [-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5],
  "targetSum": 20
}
```
##### Output
```
[
  [-5, 2, 15, 8],
  [-3, 2, -7, 28],
  [-10, -3, 28, 5],
  [-10, 28, -6, 8],
  [-7, 28, -6, 5],
  [-5, 2, 12, 11],
  [-5, 12, 8, 5]
]
```
#### Test Case 7
```
{
  "array": [1, 2, 3, 4, 5],
  "targetSum": 100
}
```
##### Output
```
[]
```
#### Test Case 8
```
{
  "array": [1, 2, 3, 4, 5, -5, 6, -6],
  "targetSum": 5
}
```
##### Output
```
[
  [2, 3, 5, -5],
  [1, 4, 5, -5],
  [2, 4, 5, -6],
  [1, 3, -5, 6],
  [2, 3, 6, -6],
  [1, 4, 6, -6]
]
```

