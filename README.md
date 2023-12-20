# CustomList Class

The `CustomList` class provides functionalities to manipulate and perform operations on an array of integers.

## Methods

- `toString()`: Returns the string representation of the list.
- `indexOf(int num)`: Returns the index of the first occurrence of the specified number.
- `lastIndexOf(int num)`: Returns the index of the last occurrence of the specified number.
- `get(int index)`: Returns the element at the specified index or a default value if the index is out of bounds.
- `get(int index, int examp)`: Returns the element at the specified index or a provided default value if the index is out of bounds.
- `add(int num)`: Adds an element to the end of the list.
- `getMax()`: Returns the maximum value in the list.
- `pop()`: Removes and returns the last element of the list.
- `remove(int elem)`: Removes the first occurrence of the specified element.
- `removeRight(int elem)`: Removes the last occurrence of the specified element.
- `removeAll(int elem)`: Removes all occurrences of the specified element.
- `removeByIndex(int index)`: Removes an element at the specified index.
- `removeAllByIndex(int index)`: Removes all elements equal to the element at the specified index.
- `reverse()`: Reverses the order of elements in the list.
- `bubbleSort()`: Sorts the list in ascending order using the bubble sort algorithm.
- `bubbleSort(boolean desc)`: Sorts the list in ascending or descending order based on the given boolean value.
- `selectionSort()`: Sorts the list in ascending order using the selection sort algorithm.
- `selectionSort(boolean desc)`: Sorts the list in ascending or descending order using the selection sort algorithm.

## Usage

Example usage of the `CustomList` class:

```java
CustomList list = new CustomList(new int[]{5, 2, 8, 1, 3});
System.out.println("Initial List: " + list.toString());

list.add(6);
System.out.println("After adding 6: " + list.toString());

int index = list.indexOf(8);
System.out.println("Index of 8: " + index);

int maxValue = list.getMax();
System.out.println("Maximum value: " + maxValue);

list.bubbleSort();
System.out.println("Sorted List: " + list.toString());
