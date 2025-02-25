
# Java Array Interview Questions and Answers

## 1. What is an array in Java?

An array in Java is a collection of elements of the same data type stored in contiguous memory locations. It is a fixed-size data structure.

```java
int[] numbers = new int[5];
```

---

## 2. How do you declare an array in Java?

```java
int[] arr; // Preferred way
int arr[]; // Also valid
```

---

## 3. How do you initialize an array in Java?

```java
int[] arr = {1, 2, 3, 4, 5};
```

---

## 4. What is the default value of an array element in Java?

- **Numeric types** (int, double, float, etc.): `0`
- **Boolean**: `false`
- **Object references**: `null`

---

## 5. How do you determine the length of an array?

```java
int[] arr = {1, 2, 3};
System.out.println(arr.length); // Output: 3
```

---

## 6. Can you change the size of an array once it is created?

No, arrays have a fixed size. You need to create a new array and copy elements if resizing is needed.

---

## 7. How do you access elements in an array?

```java
int[] arr = {10, 20, 30};
System.out.println(arr[1]); // Output: 20
```

---

## 8. What happens if you access an index outside the array bounds?

It throws an `ArrayIndexOutOfBoundsException`.

```java
int[] arr = {1, 2, 3};
System.out.println(arr[5]); // Throws ArrayIndexOutOfBoundsException
```

---

## 9. How do you iterate over an array in Java?

### Using a for loop:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Using an enhanced for loop:

```java
for (int num : arr) {
    System.out.println(num);
}
```

---

## 10. What are different ways to loop through an array?

- `for` loop
- `enhanced for` loop
- `while` loop
- `Streams API (Java 8+)`

---

## 11. What is a multi-dimensional array?

An array containing multiple arrays, like a matrix.

```java
int[][] matrix = {{1, 2}, {3, 4}};
```

---

## 12. How do you declare and initialize a 2D array?

```java
int[][] arr = new int[2][3];
int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
```

---

## 13. How do you access elements in a 2D array?

```java
System.out.println(arr[0][1]); // Access row 0, column 1
```

---

## 14. Can you have a non-rectangular 2D array?

Yes, it's called a **jagged array**.

```java
int[][] jagged = new int[2][];
jagged[0] = new int[3];
jagged[1] = new int[5];
```

---

## 15. How do you sort an array in Java?

### Using Arrays.sort()

```java
int[] arr = {5, 3, 8, 1};
Arrays.sort(arr);
```

---

## 16. How do you reverse an array?

```java
Collections.reverse(Arrays.asList(arr));
```

---

## 17. How do you find the maximum element in an array?

```java
int max = Arrays.stream(arr).max().getAsInt();
```

---

## 18. How do you merge two arrays?

```java
int[] merged = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
```

---

## 19. How do you remove duplicates from an array?

```java
int[] unique = Arrays.stream(arr).distinct().toArray();
```

---

## 20. How do you convert an array to an ArrayList?

```java
List<Integer> list = Arrays.asList(arr);
```

---



# DSA Question on Array


### Easy
1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
15. [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
16. - [Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/)
17. [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
18. [Missing Number](https://leetcode.com/problems/missing-number/)