# CustomList Class

This Java class, CustomList, provides functionalities to manipulate an array of integers.

## Methods

### `toString()`

Returns a string representation of the array.

### `indexOf(int num)`

Finds the index of the first occurrence of the specified number in the array.

### `lastIndexOf(int num)`

Finds the index of the last occurrence of the specified number in the array.

### `get(int index)`

Returns the element at the specified index. If the index is out of bounds, returns 0.

### `get(int index, int examp)`

Returns the element at the specified index. If the index is out of bounds, returns the provided example value.

### `add(int num)`

Adds an element to the end of the array.

### `getMax()`

Returns the maximum element in the array.

### `pop()`

Removes and returns the last element in the array.

### `remove(int elem)`

Removes the first occurrence of the specified element from the array.

### `removeRight(int elem)`

Removes the last occurrence of the specified element from the array.

### `removeAll(int elem)`

Removes all occurrences of the specified element from the array.

### `removeByIndex(int index)`

Removes the element at the specified index.

### `removeAllByIndex(int index)`

Removes all occurrences of the element at the specified index.

## Usage

Instantiate the CustomList class:

```java
CustomList customList = new CustomList(new int[]{1, 2, 3, 4, 5});
// Or
CustomList customList = new CustomList();
